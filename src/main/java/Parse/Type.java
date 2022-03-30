package Parse;


import java.util.Objects;

public abstract class Type {
    /**
     * The singleton instance of the {@link Bool} type.
     */
    public static final Type BOOL = new Bool();
    /**
     * The singleton instance of the {@link Int} type.
     */
    public static final Type INT = new Int();
    public static final Type VOID = new Void();
    private final TypeKind kind;

    /**
     * Constructor for subclasses.
     */
    protected Type(TypeKind kind) {
        this.kind = kind;
    }

    /**
     * Returns the kind of this type.
     */
    public TypeKind getKind() {
        return this.kind;
    }

    public abstract int size();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Type)) return false;
        Type type = (Type) o;
        return getKind() == type.getKind();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKind());
    }

    /**
     * Representation of Boolean type.
     */
    public static class Bool extends Type {
        private Bool() {
            super(TypeKind.BOOL);
        }


        @Override
        public int size() {
            return 1;
        }

        @Override
        public String toString() {
            return "boolean";
        }
    }

    /**
     * Representation of Integer type.
     */
    static public class Int extends Type {
        private Int() {
            super(TypeKind.INT);
        }


        @Override
        public int size() {
            return 1;
        }

        @Override
        public String toString() {
            return "int";
        }
    }

    /**
     * Representation of Array types.
     */
    public static class Arr extends Type {
        private final Type elemType;
        private final int nrElems;

        public Arr(Type elemType, int nrElems) {
            super(TypeKind.ARRAY);
            this.elemType = elemType;
            this.nrElems = nrElems;
        }


        /**
         * Returns the type of the simpleArray
         */
        public Type getElemType() {
            return this.elemType;
        }


        @Override
        public int size() {
            return elemType.size() * nrElems;
        }

        @Override
        public String toString() {
            return "[" + nrElems + "]" + elemType.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Arr)) return false;
            if (!super.equals(o)) return false;
            Arr arr = (Arr) o;
            return nrElems == arr.nrElems &&
                    Objects.equals(getElemType(), arr.getElemType());
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getElemType(), nrElems);
        }
    }

    /**
     * Used in function as an extra types, to check the function and its return value
     */
    static public class Void extends Type {
        private Void() {
            super(TypeKind.VOID);
        }


        @Override
        public int size() {
            return 0;
        }

        @Override
        public String toString() {
            return "void";
        }
    }


    public enum TypeKind {
        /**
         * Integer base type.
         */
        INT,
        /**
         * Boolean base type.
         */
        BOOL,
        /**
         * Array compound type.
         */
        ARRAY,

        /**
         * void type, function returns nothing
         */
        VOID

    }
}
