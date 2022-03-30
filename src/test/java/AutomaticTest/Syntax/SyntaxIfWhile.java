package AutomaticTest.Syntax;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class SyntaxIfWhile {
    private final Compiler compiler = new Compiler();

    @Test
    public void IfSyntax1() throws IOException {
        checkFail("src/main/resources/samples/Syntax/IfWhile/IncorrectUse/IfSyntax1", "IfSyntax1");
    }

    @Test
    public void WhileSyntax1() throws IOException {
        checkFail("src/main/resources/samples/Syntax/IfWhile/IncorrectUse/WhileSyntax1", "WhileSyntax1");
    }


    @Test
    public void IfSyntax() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/IfWhile/CorrectUse/IfSyntax", "IfSyntax");
    }

    @Test
    public void WhileSyntax() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/IfWhile/CorrectUse/WhileSyntax", "WhileSyntax");
    }

    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
