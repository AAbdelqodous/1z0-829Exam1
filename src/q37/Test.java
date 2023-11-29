package q37;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');   //VLETO
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');
        list.add(1, 'L');

        if(list.contains('O')) {
            list.remove(3);
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}
