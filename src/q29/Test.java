package q29;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var es = Executors.newSingleThreadExecutor();
        var future = es.submit(new Caller("Call"));// creates a Caller object and invokes the call method.
        // This method prints 'CALL' on to the console and returns null.
        System.out.println(future.get());
//        es.shutdown();
    }
}
