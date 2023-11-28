package q17;

public class Test {
    public static void main(String[] args) {
        try{
            check();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private static void check() {
        try {
            RuntimeException re =
                    new RuntimeException(); //Line n2
            throw re; //Line n3
        } catch(RuntimeException e) {
            System.out.println(1);
            ArithmeticException ex =
                    (ArithmeticException)e; //Line n4
            System.out.println(2);
            throw ex;
        }
    }
}
