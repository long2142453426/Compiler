package AutomaticTest.Contextual;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class ContextualScope {
    private final Compiler compiler = new Compiler();

    @Test
    public void sameScopeRedeclared() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/Scope/IncorrectUse/sameScopeRedeclared", "sameScopeRedeclared");
    }

    @Test
    public void DifferentScopeRedeclared() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Scope/CorrectUse/DifferentScopeRedeclared", "DifferentScopeRedeclared");
        assertArrayEquals(ans, new Integer[]{1, 4});
    }

    @Test
    public void AssignmentInScope () throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Scope/CorrectUse/AssignmentInScope", "AssignmentInScope");
        assertArrayEquals(ans, new Integer[]{3});
    }


    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
