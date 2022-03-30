package Model;

/**
 * Opcode of the operation
 */
public enum OpCode {
    Compute,
    Load,
    Store,
    Branch,
    Jump,
    Nop,
    ReadInstr,
    WriteInstr,
    Receive,
    TestAndSet,
    EndProg;
}
