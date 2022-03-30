package Model;

import static Model.AddrImmDI.Type.DirAddr;

/**
 * Represents the AddrImmDI in sprockell
 */
public class AddrImmDI extends Operand {
    private final Type type;
    private final int value;
    public static final AddrImmDI NUMIO = new AddrImmDI(DirAddr, 65536);


    public AddrImmDI(Type type, int value) {
        this.type = type;
        this.value = value;
    }

    public enum Type {
        ImmValue,
        DirAddr,
        IndAddr
    }

    @Override
    public String myToString() {
        return "(" + type + " " + "(" + value + ")" + ")";
    }


}
