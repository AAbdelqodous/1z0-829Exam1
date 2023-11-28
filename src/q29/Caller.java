package q29;

import java.util.concurrent.Callable;

public class Caller implements Callable<Void> {
    String str;
    public Caller(String s) {
        this.str = s;
    }
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Void call() throws Exception {
        System.out.println(str.toUpperCase());
        return null;
    }
}
