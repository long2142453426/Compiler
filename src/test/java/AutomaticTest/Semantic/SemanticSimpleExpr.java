package AutomaticTest.Semantic;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class SemanticSimpleExpr {
    private final Compiler compiler = new Compiler();

    @Test
    public void MixedAssocitivity() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/SimpleArthExpr/MixedAssocitivity", "MixedAssocitivity");
        assertArrayEquals(new Integer[]{45}, ans);

    }

    @Test
    public void LongExpr() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/SimpleArthExpr/LongExpr", "LongExpr");
        assertArrayEquals(new Integer[]{1241}, ans);

    }

    @Test
    public void RightAssociativity() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/SimpleArthExpr/RightAssociativity", "RightAssociativity");
        assertArrayEquals(new Integer[]{29}, ans);

    }


}
