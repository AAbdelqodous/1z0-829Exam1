package q30;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        System.out.println(Boolean.valueOf("abc"));
        System.out.println(Boolean.valueOf("tRuE"));
        System.out.println(Boolean.valueOf("FALSE"));
        System.out.println("---------------------------");

        Deque<Boolean> deque = new ArrayDeque<>(); //push, pop and peek are Stack's terminology.
        deque.push(Boolean.valueOf("abc"));
        deque.push(Boolean.valueOf("tRuE"));
        deque.push(Boolean.valueOf("FALSE"));   //push(E) calls addFirst(E),
                deque.push(true);
        System.out.println(deque.pop() + ":"        //pop() calls removeFirst() and
                + deque.peek() + ":" + deque.size());   //peek() invokes peekFirst(),
    }
}
