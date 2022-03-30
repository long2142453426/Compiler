package Model;

/**
 * Encapsulate of int, includes registers and numbers
 */
public class Num extends Operand {
    public static final Num ZERO = new Num(0);
    public static final Num r_1 = new Num(2);
    public static final Num r_2 = new Num(3);
    public static final Num r_3 = new Num(4);
    public static final Num R_EXPR_MEM_POINT = new Num(5);
    public static final Num R_RETURN_ADDRESS = new Num(6);
    public static final Num R_ARP = new Num(7);

    private final int value;

    public Num(int value) {
        this.value = value;
    }


    public int getContent() {
        return value;
    }

    @Override
    public String myToString() {
        return "(" + value + ")";
    }
}