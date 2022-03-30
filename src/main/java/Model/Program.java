package Model;


import java.util.*;

/**
 * ILOC program.
 *
 * @author Arend Rensink
 */
public class Program {



    /**
     * Indexed list of all operations in the program.
     * This is the flattened list of instructions.
     */
    private List<Op> opList;
    private final int id;


    /**
     * Creates a program with an initially empty instruction list.
     */
    public Program(int id) {
        this.opList = new ArrayList<>();
        this.id = id;
    }

    /**
     * Adds an instruction to the instruction list of this program.
     *
     * @throws IllegalArgumentException if the instruction has a known label
     */
    public void addInstr(Op op) {
        this.opList.add(op);
    }

    /**
     * Returns the flattened list of operations in this program.
     */
    public List<Op> getOps() {
        return Collections.unmodifiableList(this.opList);
    }


    /**
     * Set the op at the line to new op
     * @param line
     * @param op
     */
    public void setOpAt(int line, Op op) {
        opList.set(line, op);
    }

    /**
     * Returns the size of the program, in number of operations.
     */
    public int size() {
        return this.opList.size();
    }



    public int getId() {
        return id;
    }

    public void copyFromOther(Program other) {
        opList = new ArrayList<>(other.getOps());
    }




    @Override
    public String toString() {
        return "prog" + id;
    }
}
