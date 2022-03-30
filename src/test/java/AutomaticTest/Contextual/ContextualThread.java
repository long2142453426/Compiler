package AutomaticTest.Contextual;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class ContextualThread {
    private final Compiler compiler = new Compiler();

    @Test
    public void lockOutsideThread() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/Thread/Incorrectuse/LockOutsideThread", "LockOutsideThread");
    }

    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }

}
