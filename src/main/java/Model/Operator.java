package Model;

/**
 * Represent the operator
 */
public class Operator extends Operand {
    private Type type;


    public final static Operator ADD = new Operator(Type.Add);
    public final static Operator SUB = new Operator(Type.Sub);
    public final static Operator MUL = new Operator(Type.Mul);
    public final static Operator AND = new Operator(Type.And);
    public final static Operator OR = new Operator(Type.Or);
    public final static Operator XOR = new Operator(Type.Xor);
    public final static Operator EQUAL = new Operator(Type.Equal);
    public final static Operator NEQ = new Operator(Type.NEq);
    public final static Operator GT = new Operator(Type.Gt);
    public final static Operator GTE = new Operator(Type.GtE);
    public final static Operator LT = new Operator(Type.Lt);
    public final static Operator LTE = new Operator(Type.LtE);

    public Operator(Type type) {
        this.type = type;
    }

    public enum Type {
        Add,
        Sub,
        Mul,
        And,
        Or,
        Xor,
        Equal,
        NEq,
        Gt,
        GtE,
        Lt,
        LtE,
    }

    @Override
    public String myToString() {
        return "" + type;
    }
}
