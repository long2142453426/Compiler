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


public class TypeTest {

    private final Generator compiler = new Generator();


    @Test
    public void testBasicTypes() throws IOException, ParseException {
        Checker checker = new Checker();
        ParseTree tree = compiler.parse("src/main/resources/samples/ContextualTest/SimpleExpr/CorrectUse/SimpleIDType");
        Result result = checker.check(tree);
        ParseTree mainProg = tree.getChild(0);
        ParseTree assA = mainProg.getChild(2).getChild(0).getChild(2).getChild(1);
        ParseTree assAs = mainProg.getChild(3);
        ParseTree idExprA = mainProg.getChild(3).getChild(2);
        assertEquals(Type.BOOL, result.getType(assA.getChild(0)));
        assertEquals(Type.INT, result.getType(assAs.getChild(0)));
        assertEquals(Type.INT, result.getType(idExprA));
    }


    @Test
    public void testArrayTypes() throws IOException, ParseException {
        Checker checker = new Checker();
        ParseTree tree = compiler.parse("src/main/resources/samples/ContextualTest/Arr/CorrectUse/multiDimensionalWithPartialAssignment");
        Result result = checker.check(tree);
        ParseTree mainProg = tree.getChild(0);
        ParseTree a = ((G71Parser.AssStatContext) mainProg.getChild(3)).expr().getChild(0); //a
        ParseTree a0 = ((G71Parser.AssStatContext) mainProg.getChild(3)).expr(); //a[0]
        mainProg.getChild(3).getChild(2);
        assertEquals(new Type.Arr(new Type.Arr(Type.INT,6),2), result.getType(a));
        assertEquals(new Type.Arr(Type.INT,6), result.getType(a0));
    }

    @Test
    public void testFunctionType() throws IOException, ParseException {
        Checker checker = new Checker();
        ParseTree tree = compiler.parse("src/main/resources/samples/Semantics/Function/fibonacci");
        Result result = checker.check(tree);
        assertEquals(Type.INT, result.getFunctionType("fib"));
    }

}
