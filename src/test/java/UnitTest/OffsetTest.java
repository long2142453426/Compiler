package UnitTest;

import Antlr.G71Parser;
import Exceptions.ParseException;
import Parse.Checker;
import Parse.Generator;
import Parse.Result;
import Parse.Type;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class OffsetTest {

    private final Generator compiler = new Generator();

    @Test
    public void testBasicOffset() throws IOException, ParseException {
        Checker checker = new Checker();
        ParseTree tree = compiler.parse("src/main/resources/samples/ContextualTest/SimpleExpr/CorrectUse/SimpleIDType");
        Result result = checker.check(tree);
        ParseTree mainProg = tree.getChild(0);
        ParseTree assA = mainProg.getChild(2).getChild(0).getChild(2).getChild(1);
        ParseTree assAs = mainProg.getChild(3);
        G71Parser.OutStatContext idExprA = (G71Parser.OutStatContext) mainProg.getChild(4);
        assertEquals(1, result.getOffset(assA));
        assertEquals(0, result.getOffset(assAs.getChild(0)));
        assertEquals(0, result.getOffset(idExprA.expr()));
    }


    @Test
    public void testArrayOffset() throws IOException, ParseException {
        Checker checker = new Checker();
        ParseTree tree = compiler.parse("src/main/resources/samples/ContextualTest/Arr/CorrectUse/multiDimensionalWithPartialAssignment");
        Result result = checker.check(tree);
        ParseTree mainProg = tree.getChild(0);
        //There real offset of a[0] will be computed with spockell, so its temporarily set as the offset of a
        ParseTree a = ((G71Parser.AssStatContext) mainProg.getChild(3)).expr();
        ParseTree b = ((G71Parser.OutStatContext) mainProg.getChild(4)).expr();
        assertEquals(0, result.getOffset(a));
        //The offset of be increases by 12- size of a
        assertEquals(12, result.getOffset(b));
    }


}
