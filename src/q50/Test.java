package q50;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");

        List<String> subList = list.subList(1, 2); //Line n1
        // It returns a view of the portion of this list between the specified fromIndex and toIndex.
        subList.set(0, "E"); //Line n2
//        list.add(1, "Z");
        System.out.println(String.join(",", list));

        System.out.println(String.join("-", subList));

        //String.join(".", "A", "B", "C"); returns "A.B.C"
        //String.join("+", new String[]{"1", "2", "3"}); returns "1+2+3"
        //String.join("-", "HELLO"); returns "HELLO"

        //String.join(null, "A", "B"); throws NullPointerException
        //String [] arr = null; String.join("-", arr); throws NullPointerException

        //String str = null; String.join("-", str); returns "null"
        //String.join("::", new String[] {"James", null, "Gosling"}); returns "James::null::Gosling"

        //String.join(".", List.of("A", "B", "C")); returns "A.B.C"
        //String.join(".", List.of("HELLO")); returns "HELLO"

        //String.join(null, List.of("HELLO")); throws NullPointerException
        //List<String> list = null; String.join("-", list); throws NullPointerException

        //List<String> list = new ArrayList<>(); list.add("A"); list.add(null); String.join("::", list); returns "A::null"
        //String.join("-", null); causes compilation error as compiler is unable to tag this call to specific join(...) method. It is an ambiguous call.
    }
}
