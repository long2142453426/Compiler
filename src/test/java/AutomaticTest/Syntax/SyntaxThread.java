package AutomaticTest.Syntax;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class SyntaxThread {
    private final Compiler compiler = new Compiler();




    @Test
    public void ThreadSyntax() throws IOException, ParseException {
        compiler.buildAndRun("src/main/resources/samples/Syntax/Thread/CorrectUse/ThreadSyntax", "ThreadSyntax");
    }

    @Test
    public void ThreadSyntax1() throws IOException, ParseException {
        checkFail("src/main/resources/samples/Syntax/Thread/InCorrectUse/ThreadSyntax1", "ThreadSyntax1");
    }

    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
