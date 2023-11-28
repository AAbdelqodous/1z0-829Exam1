package q3;

public class Test {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        } catch(NullPointerException ex) //catch(NullPointerException | RuntimeException ex)
        {
            System.out.println("DONE");
        }
    }
}
