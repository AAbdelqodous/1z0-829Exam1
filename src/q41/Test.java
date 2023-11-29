package q41;

public class Test {
    public static void main(String[] args) {
        int num = 10;
        if(num++ == num++) {
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num);
        }
//        (10 == num++) //Left side operand is evaluated first,
//                        value 10 is used in the expression and
//                        variable num is incremented by 1, so num=11
//        (10 == 11) //Right side operand is evaluated next,
//                      value 11 is used in the expression and
//                      variable num is incremented by 1, so num = 12
    }
}
