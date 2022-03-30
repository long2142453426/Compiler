package AutomaticTest.Semantic;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class SemanticIfWhile {
    private final Compiler compiler = new Compiler();

    public void StuckWhile() throws IOException, ParseException {
       try{
           compiler.buildAndRun("src/main/resources/samples/Semantics/IfWhile/StuckWhile", "StuckWhile");
           fail("should not reach here");
       }catch (Exception e){

       }

    }

    @Test
    public void sumUpTo() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/IfWhile/sumUpTo", "sumUpTo");
        assertArrayEquals(new Integer[]{45}, ans);
    }




}
