package q36;

public class Test {
    public static void main(String[] args) throws Exception {
        try (AutoCloseable resource = new MyResource()){

        }
    }
}
