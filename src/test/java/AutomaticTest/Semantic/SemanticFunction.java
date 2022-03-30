package AutomaticTest.Semantic;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class SemanticFunction {
    private final Compiler compiler = new Compiler();

    @Test
    public void fibonacci() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Function/fibonacci", "fibnacci");
        assertArrayEquals(new Integer[]{233}, ans);

    }

    @Test
    public void sumUpTo() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Function/sumUpTo", "sumUpTo");
        assertArrayEquals(new Integer[]{91}, ans);


    }


}
