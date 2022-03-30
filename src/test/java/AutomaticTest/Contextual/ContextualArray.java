package AutomaticTest.Contextual;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class ContextualArray {
    private final Compiler compiler = new Compiler();

    @Test
    public void applyMoreDimension() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Arr/IncorrectUse/applyMoreDimension", "applyMoreDimension");
    }

    @Test
    public void differentTypes() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Arr/IncorrectUse/differentTypes", "differentTypes");
    }

    @Test
    public void wrongMulDimensionalArray() throws IOException, ParseException {
        checkFail("src/main/resources/samples/ContextualTest/Arr/IncorrectUse/wrongMulDimensionalArray", "wrongMulDimensionalArray");
    }

    @Test
    public void wrongTypeArray() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Arr/IncorrectUse/wrongTypeArray", "wrongTypeArray");
    }

    @Test
    public void arrayDimensionWithNonIntType() throws IOException {
        checkFail("src/main/resources/samples/ContextualTest/Arr/IncorrectUse/arrayDimensionWithNonIntType", "arrayDimensionWithNonIntType");
    }

    @Test
    public void mulDimensionalArray() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Arr/CorrectUse/mulDimensionalArray", "mulDimensionalArray");
        assertArrayEquals(ans, new Integer[]{2});
    }

    @Test
    public void multiDimensionalWithPartialAssignment() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Arr/CorrectUse/multiDimensionalWithPartialAssignment", "multiDimensionalWithPartialAssignment");
        assertArrayEquals(ans, new Integer[]{5,2,4,21,5,5});
    }


    @Test
    public void simpleArray() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/ContextualTest/Arr/CorrectUse/simpleArray", "simpleArray");
        assertArrayEquals(ans, new Integer[]{1,2,3,4,5,6});
    }

    private void checkFail(String filePath, String compiledFile) throws IOException {
        try {
            compiler.buildAndRun(filePath, compiledFile);
            fail(filePath + " shouldn't check but did");
        } catch (ParseException exc) {

        }
    }


}
