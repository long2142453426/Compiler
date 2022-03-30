package AutomaticTest.Contextual;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ContextualSimpleExpr {
    private final Compiler compiler = new Compiler();

    @Test
    public void and() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/SimpleExpr/CorrectUse/and", "and");
        assertArrayEquals(ans, new Integer[]{0, 1, 1});

    }

    @Test
    public void multiply() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/SimpleExpr/CorrectUse/multiply", "multiply");
        int first = ans[0];
        assertEquals(first, 6);
    }

    @Test
    public void subtract() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/SimpleExpr/CorrectUse/subtract", "subtract");
        int first = ans[0];
        assertEquals(first, 5);
    }

    @Test
    public void Addition() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/SimpleExpr/IncorrectUse/Addition", "Addition");


    }

    @Test
    public void Comparison() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/SimpleExpr/IncorrectUse/Comparison", "Comparison");

    }

    @Test
    public void IfWhile() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/SimpleExpr/IncorrectUse/IfWhile", "IfWhile");

    }

    @Test
    public void Multiplication() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/SimpleExpr/IncorrectUse/Multiplication1", "Multiplication1");

    }


    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
