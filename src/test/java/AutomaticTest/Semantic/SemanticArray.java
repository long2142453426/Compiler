package AutomaticTest.Semantic;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class SemanticArray {
    private final Compiler compiler = new Compiler();



    @Test
    public void arrayEquality() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Arr/arrayEquality", "arrayEquality");
        assertArrayEquals(new Integer[]{1, 0, 0}, ans);

    }

    @Test
    public void arraySum() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Arr/arraySum", "arraySum");
        assertArrayEquals(new Integer[]{194}, ans);

    }

    @Test
    public void arraySumWithFunction() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Arr/arraySumWithFunction", "arraySumWithFunction");
        assertArrayEquals(new Integer[]{12}, ans);

    }

    @Test
    public void prefixsum() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Arr/prefixsum", "prefixsum");
        assertArrayEquals(new Integer[]{13,34,77,98,140,194}, ans);

    }





}
