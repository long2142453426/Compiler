package Model;

/**
 * The address to jump/branch
 */
public class Target extends Operand {
    private final Type type;
    private final int value;

    public Target(Type type, int value) {
        this.type = type;
        this.value = value;
    }

    public enum Type {
        Abs,
        Rel,
        Ind
    }

    @Override
    public String myToString() {
        return "(" + type + " " + "(" + value + ")" + ")";
    }
}
