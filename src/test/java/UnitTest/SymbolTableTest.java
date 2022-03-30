package UnitTest;

import Exceptions.ParseException;
import Parse.Result;
import Parse.Type;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SymbolTableTest {
    /**
     * The symbol table of our program is integrated into the result
     */

    Result result = new Result();


    @Test
    public void testFunctionScope() {
        assertTrue(result.put("a", Type.INT, 0, null));
        result.openScope(0);
        assertTrue(result.put("b", Type.INT, 0, null));
        assertFalse(result.put("b", Type.INT, 0, null));
        result.openScope(0);
        assertTrue(result.put("b", Type.INT, 0, null));
        assertTrue(result.put("c", Type.INT, 0, null));
        assertEquals(result.scopeOfId("b", 0, null), result.scopeOfId("c", 0, null));
        result.openScope(0);
        assertTrue(result.put("c", Type.INT, 0, null));
        assertFalse(result.scopeOfId("b", 0, null) == result.scopeOfId("c", 0, null)); //c is Not the same scope as b
        assertFalse(result.put("c", Type.INT, 0, null));
        assertTrue(result.put("a", Type.INT, 0, null));
    }




}
