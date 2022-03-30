package AutomaticTest.Contextual;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ContextualFunction {
    private final Compiler compiler = new Compiler();

    @Test
    public void HasNoReturn() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Function/IncorrectUse/HasNoReturn", "HasNoReturn");
    }

    @Test
    public void IncompatibleParamTypes() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Function/IncorrectUse/IncompatibleParamTypes", "IncompatibleParamTypes");
    }

    @Test
    public void IncompatibleReturnType() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Function/IncorrectUse/IncompatibleReturnType", "IncompatibleReturnType");
    }

    @Test
    public void ParamNotDeclared() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Function/IncorrectUse/ParamNotDeclared", "ParamNotDeclared");
    }



    @Test
    public void functionGlobalVar() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Function/CorrectUse/functionGlobalVar", "functionGlobalVar");
        assertArrayEquals(ans, new Integer[]{8});
    }

    @Test
    public void functionIf() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Function/CorrectUse/functionIf", "functionIf");
        assertArrayEquals(ans, new Integer[]{1});
    }

    @Test
    public void functionOnThread() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Function/CorrectUse/functionOnThread", "functionOnThread");
        int first = ans[0];
        assertTrue(first == 13 || first == 34);
    }

    @Test
    public void functionScope() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Function/CorrectUse/functionScope", "functionScope");
        assertArrayEquals(ans, new Integer[]{6});
    }

    @Test
    public void functionWhile() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Function/CorrectUse/functionWhile", "functionWhile");
        assertArrayEquals(ans, new Integer[]{0, 1, 2, 3, 4});
    }

    @Test
    public void functionWithAgurments() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Function/CorrectUse/functionWithAgurments", "functionWithAgurments");
        assertArrayEquals(ans, new Integer[]{6});
    }


    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
