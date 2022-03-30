package AutomaticTest.Semantic;

import Exceptions.ParseException;
import Parse.Compiler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SemanticThread {
    private final Compiler compiler = new Compiler();

    @Test
    public void ParBeginParEnd() throws IOException, ParseException {
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/ParBeginParEnd", "ParBeginParEnd");
        int first = ans[0];
        int last = ans[3];
        assertEquals(first, 0);
        assertEquals(last, 3);
    }

    @Test
    public void peterson() throws IOException, ParseException {
        //To see the correctness of peterson, you better look at the class and the output, its not testable here
        compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/peterson", "peterson");
    }

    @Test
    public void lock() throws IOException, ParseException {
        //To see the correctness of lock, you better look at the class and the output, its not testable here
        compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/lock", "lock");
    }

    @Test
    public void differentLockWithSameParent() throws IOException, ParseException {
        //To see the correctness of lock, you better look at the class and the output, its not testable here
        compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/differentLockWithSameParent", "differentLockWithSameParent");
    }

    @Test
    public void nestedThread() throws IOException, ParseException {
        //To see the correctness of lock, you better look at the class and the output, its not testable here
        compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/nestedThread", "nestedThread");
    }

    @Test
    public void threadWithFunction() throws IOException, ParseException {
        //To see the correctness of lock, you better look at the class and the output, its not testable here
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/threadWithFunction", "threadWithFunction");
        int first = ans[0];
        assertEquals(first,1);//1 is true
    }

    @Test
    public void bank() throws IOException, ParseException {
        //To see the correctness of lock, you better look at the class and the output, its not testable here
        Integer[] ans = compiler.buildAndRun("src/main/resources/samples/Semantics/Thread/bank", "bank");
        int first = ans[0];
        assertEquals(first,100);//1 is true
    }



}
