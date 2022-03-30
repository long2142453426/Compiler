package AutomaticTest.Syntax;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class SyntaxFunction {
    private final Compiler compiler = new Compiler();

    @Test
    public void FunctionSyntax2() throws IOException {
        checkFail("src/main/resources/samples/Syntax/Function/IncorrectUse/FunctionSyntax2", "FunctionSyntax2");
    }

    @Test
    public void FunctionSyntax3() throws IOException {
        checkFail("src/main/resources/samples/Syntax/Function/IncorrectUse/FunctionSyntax3", "FunctionSyntax3");
    }


    @Test
    public void FunctionSyntax() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/Function/CorrectUse/FunctionSyntax", "FunctionSyntax");
    }

    @Test
    public void FunctionSyntax1() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/Function/CorrectUse/FunctionSyntax1", "FunctionSyntax1");
    }

    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
