package Model;

/**
 * Abstract class of all type of operands
 */
abstract public class Operand {
    public abstract String myToString();

    @Override
    public String toString() {
        return myToString();
    }
}
