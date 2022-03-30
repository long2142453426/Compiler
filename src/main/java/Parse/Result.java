package Parse;


import Antlr.G71Parser.ArrayExprContext;
import Antlr.G71Parser.ExprContext;
import Antlr.G71Parser.FuncExprContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.*;


public class Result {

    /**
     * Symbol table
     */
    private final List<Deque<Scope>> scopes = new ArrayList<>();
    private final Map<String, Deque<Scope>> functionScopes = new HashMap<>();
    private final ParseTreeProperty<Type> types = new ParseTreeProperty<>();
    private final Map<String, Integer> globalOffsets = new HashMap<>();
    private final Map<String, Type> globalTypes = new HashMap<>();
    private final Map<String, Type> functionType = new HashMap<>();
    private final Map<FuncExprContext, Integer> jumpDistances = new HashMap<>();
    private final ParseTreeProperty<List<ExprContext>> contents = new ParseTreeProperty<>();
    private final Map<String, Integer> startLineMap = new HashMap<>();
    private final ParseTreeProperty<Integer> threadNrMap = new ParseTreeProperty<>();
    private final ParseTreeProperty<String> functionMap = new ParseTreeProperty<>();
    private final Map<Integer, Integer> parentMap = new HashMap<>();
    private final Set<ParseTree> globalCtx = new HashSet<>();
    private final Set<String> returnedFunction = new HashSet<>();
    private int nrOfThreads;
    private int globalSize;


    /**
     * Mapping from variables to coordinates.
     */
    private final ParseTreeProperty<Integer> offsets = new ParseTreeProperty<>();


    public Result() {
        nrOfThreads = 0;
        globalSize = 0;
        scopes.add(new ArrayDeque<>());
        scopes.get(0).push(new Scope(0));
    }

    public void setOffset(ParseTree node, int offset) {
        this.offsets.put(node, offset);
    }

    /**
     * Returns the declaration offset of the variable
     * accessed in a given parse tree node.
     */
    public int getOffset(ParseTree node) {
        return this.offsets.get(node);
    }

    /**
     * Adds an association from a parse tree expression, type,
     * or assignment target node to the corresponding (inferred) type.
     */
    public void setType(ParseTree node, Type type) {
        this.types.put(node, type);
    }


    /**
     * add the id not the global set
     *
     * @param idNode the node to be set global
     */
    public void addGlobalContext(ParseTree idNode) {
        globalCtx.add(idNode);
    }

    /**
     * Set the jump distance to the function expression
     */
    public void setJumpDistance(FuncExprContext ctx, int distance) {
        jumpDistances.put(ctx, distance);
    }

    /**
     * Get the jump distance of the function expression
     */
    public int getJumpDistance(FuncExprContext ctx) {
        return jumpDistances.get(ctx);
    }

    /**
     * Store the line that the given function starts
     */
    public void setStartLine(String function, int line) {
        startLineMap.put(function, line);
    }


    /**
     * Return the line that the given function starts
     */
    public Integer getLine(String funciton) {
        return startLineMap.get(funciton);
    }

    /**
     * Returns the type associated with a given parse tree node.
     */
    public Type getType(ParseTree node) {
        return this.types.get(node);
    }

    /**
     * Returns the thread associated with a given parse tree node.
     */
    public Integer getThreadNr(ParseTree node) {
        return threadNrMap.get(node);
    }

    /**
     * Set the node the thread that the node belongs to
     *
     * @param node Node tobe set
     * @param nr   threadNr
     */
    public void putThreadNr(ParseTree node, int nr) {
        threadNrMap.put(node, nr);
    }


    /**
     * Open a new scope
     *
     * @param threadNr id of thread to open a new scope
     */
    public void openScope(int threadNr) {
        assert scopes.get(threadNr).peek() != null;
        int currentSize = scopes.get(threadNr).peek().offset;
        scopes.get(threadNr).push(new Scope(currentSize));

    }

    public void addReturnedFunction(String function) {
        returnedFunction.add(function);
    }

    public boolean hasReturnStatement(String function) {
        return returnedFunction.contains(function);
    }


    /**
     * Close the current scope
     *
     * @param threadNr id of thread to open a new scope
     */
    public HashSet<String> closeScope(int threadNr) {
        Scope scope = scopes.get(threadNr).pop();
        return scope.getUndeclaredVars();
    }

    /**
     * Open scope of the function
     *
     * @param function name of the function
     */
    public void openScope(String function) {
        int currentSize = Objects.requireNonNull(functionScopes.get(function).peek()).offset;
        functionScopes.get(function).push(new Scope(currentSize));
    }


    /**
     * CLose the scope of the function
     *
     * @param function name of the function
     */
    public void closeScope(String function) {
        functionScopes.get(function).pop();
    }


    public boolean put(String id, Type type, int threadNr, String function) {
        if (function != null)
            return functionScopes.get(function).peek().put(id, type);
        return scopes.get(threadNr).peek().put(id, type);
    }


    /**
     * Map the function to the type it returns
     *
     * @param function name of the function
     * @param type     type of the function
     */
    public void putFunctionType(String function, Type type) {
        functionType.put(function, type);
    }


    /**
     * Get the function to the type it returns
     *
     * @param function name of the function
     * @return the type of the function
     */
    public Type getFunctionType(String function) {
        return functionType.get(function);
    }

    public boolean putParam(String function, List<String> ids, List<Type> types) {
        boolean ans = true;
        for (int i = 0; i < ids.size(); i++) {
            String id = ids.get(i);
            Type type = types.get(i);
            ans &= functionScopes.get(function).peek().put(id, type);

        }
        return ans;
    }


    /**
     * Map the context to its function
     *
     * @param function the function associated to the context
     */
    public void setFunction(ParseTree ctx, String function) {
        functionMap.put(ctx, function);
    }

    /**
     * Get the function of the ctx
     *
     * @return the name of the function associated with the node
     */
    public String getFunction(ParseTree node) {
        return functionMap.get(node);
    }


    /**
     * Returns the type of a given variable.
     *
     * @param id       name of variable
     * @param function function name that the variable is in
     * @param threadNr thread that variable is in
     */
    public Type type(String id, int threadNr, String function) {
        Scope currentScope = scopeOfId(id, threadNr, function);
        if (currentScope != null) {
            return currentScope.type(id);
        }
        return null;
    }


    /**
     * Get the offset of variable
     *
     * @param id       of variable
     * @param function function name that the variable is in
     * @param threadNr thread that variable is in
     */
    public Integer offset(String id, int threadNr, String function) {
        Scope currentScope = scopeOfId(id, threadNr, function);
        if (currentScope != null) {
            return currentScope.offset(id);
        }
        return null;
    }

    /**
     * Get the scope of given id
     *
     * @param id       name of the variable
     * @param threadNr the threadId that the id is in
     * @param function name of the function
     * @return the scope of the id
     */
    public Scope scopeOfId(String id, int threadNr, String function) {
        Scope currentScope;
        Iterator<Scope> iter;
        if (function == null)
            iter = scopes.get(threadNr).iterator();
        else
            iter = functionScopes.get(function).iterator();
        while (iter.hasNext()) {
            currentScope = iter.next();
            Integer offset = currentScope.offset(id);
            if (offset != null) {
                return currentScope;
            }
        }
        return null;
    }


    /**
     * Get the global offset of the variable
     *
     * @param id name of the variable
     */
    public Integer globalOffset(String id) {
        return globalOffsets.get(id);
    }

    /**
     * Get the global type of the variable
     *
     * @param id name of the variable
     */
    public Type globalType(String id) {
        return globalTypes.get(id);
    }


    /**
     * Create a new thread
     *
     * @return newly create thread number
     */
    public int newThread() {
        Deque<Scope> newThreadScopes = new ArrayDeque<>();
        newThreadScopes.push(new Scope(0));
        scopes.add(newThreadScopes);
        nrOfThreads++;
        return nrOfThreads;
    }

    /**
     * Create a new function
     *
     * @param function name of new function
     */
    public void newFunction(String function) {
        Deque<Scope> newFunctionScopes = new ArrayDeque<>();
        newFunctionScopes.push(new Scope(0));
        functionScopes.put(function, newFunctionScopes);
    }

    /**
     * Calculate the jump distance (current offset) of r_arp when it calls a new function, when there is no function,
     * calculate for the threadNr instead
     *
     * @param function name of the function
     * @param threadNr thread number
     * @return jump distance
     */
    public int getContextOffSet(String function, int threadNr) {
        if (function != null) {
            return functionScopes.get(function).peek().offset;
        } else {
            return scopes.get(threadNr).peek().offset;
        }
    }

    /**
     * Put the variable to the global scope
     *
     * @param id   name of the variable
     * @param type type of the variable
     * @return true if the variable was not in the scope, false otherwise
     */
    public boolean globalPut(String id, Type type) {
        if (globalOffsets.containsKey(id))
            return false;
        globalOffsets.put(id, globalSize);
        globalSize += type.size();
        globalTypes.put(id, type);

        return true;
    }


    /**
     * Check if the node is global
     */
    public boolean isGlobal(ParseTree node) {
        return globalCtx.contains(node);
    }

    /**
     * Get the content of the simpleArray node
     */
    public List<ExprContext> getContents(ArrayExprContext node) {
        return contents.get(node);
    }

    /**
     * Add the simpleArray child expressions to its content list, this makes it easier to find offset and fetch the simpleArray
     * e.g. [[1 2 3] [4 5 2*8]] will have the content list of [1,2,3,4,5,2*8]
     */
    public void addContents(ArrayExprContext node, ExprContext childNode) {
        List<ExprContext> childNodeContents = contents.get(childNode);
        if (childNodeContents == null)
            contents.get(node).add(childNode);
            //IfWhile the child node is also an simpleArray, add the child node contents.
        else
            contents.get(node).addAll(childNodeContents);
    }

    /**
     * Create a new contents list for the the simpleArray expression
     */
    public void newContents(ArrayExprContext node) {
        contents.put(node, new ArrayList<>());
    }


    /**
     * Get the number of created threads
     */
    public int getNrOfThreads() {
        return nrOfThreads;
    }


    /**
     * Set the relationship between parent and child threads, its used in fork, join, lock, unlock, where children
     * need to know its parent
     *
     * @param threadNr       the child thread number
     * @param parentThreadNr the parent thread number
     */
    public void setParent(int threadNr, int parentThreadNr) {
        parentMap.put(threadNr, parentThreadNr);
    }


    /**
     * Get the parent of the thread
     */
    public int getParent(int threadNr) {
        return parentMap.get(threadNr);
    }


    private static class Scope {

        /**
         * The types of ids
         */
        private final Map<String, Type> idTypeMap;
        /**
         * the idOffsetMap of ids
         */
        private final Map<String, Integer> idOffsetMap;
        /**
         * undeclared variables in the scope
         */
        private final HashSet<String> undeclaredVars;

        /**
         * the offset of the current scope to the current activation record
         */
        private int offset;


        /**
         * @param startOffset the offset that the current scope will start at
         */
        public Scope(int startOffset) {
            offset = startOffset;
            idTypeMap = new HashMap<>();
            idOffsetMap = new HashMap<>();
            undeclaredVars = new HashSet<>();
        }


        /**
         * Check if the variable is already in the scope, if not, add id in
         *
         * @param id   name of the variable
         * @param type type of the variable
         * @return true if id is already in the scope, false otherwise
         */
        public boolean put(String id, Type type) {
            boolean result = !this.idTypeMap.containsKey(id);
            if (result) {
                idTypeMap.put(id, type);
                idOffsetMap.put(id, offset);
                offset += type.size();
            }
            undeclaredVars.add(id);
            return result;
        }


        /**
         * Returns the offset of a given variable,
         * with respect the current activation record.
         */
        public Integer offset(String id) {
            return idOffsetMap.get(id);
        }

        /**
         * Returns the type of a given id.
         */
        public Type type(String id) {
            return idTypeMap.get(id);
        }

        /**
         * getter of undeclaredVars
         */
        public HashSet<String> getUndeclaredVars() {
            return undeclaredVars;
        }
    }


}
