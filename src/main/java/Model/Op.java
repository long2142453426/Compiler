package Model;


import java.util.Arrays;
import java.util.List;


/**
 * Reposents the operation
 */
public class Op {


    /**
     * The operation code.
     */
    private final OpCode opCode;


    /**
     * The list of arguments of this operation.
     */
    private final List<Operand> args;


    /**
     * Constructs a labelled operation with a given opcode and arguments.
     */
    public Op(OpCode opCode, Operand... args) {
        this.args = Arrays.asList(args);
        this.opCode = opCode;

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(opCode);
        for (Operand opr : args)
            result.append(" " + opr.toString());
        result.append("\n\t");
        return result.toString();
    }




}
