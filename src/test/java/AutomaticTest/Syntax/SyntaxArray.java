package AutomaticTest.Syntax;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class SyntaxArray {
    private final Compiler compiler = new Compiler();

    @Test
    public void ArraySyntax2() throws IOException {
        checkFail("src/main/resources/samples/Syntax/Array/IncorrectUse/ArraySyntax2", "ArraySyntax2");
    }

    @Test
    public void ArraySyntax3() throws IOException {
        checkFail("src/main/resources/samples/Syntax/Array/IncorrectUse/ArraySyntax3", "ArraySyntax3");
    }


    @Test
    public void ArraySyntax() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/Array/CorrectUse/ArraySyntax", "ArraySyntax");
    }

    @Test
    public void ArraySyntax1() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/Array/CorrectUse/ArraySyntax1", "ArraySyntax1");
    }

    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
