package q24;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Ticket(10001, LocalDate.of(2022, 12, 31)));
        System.out.println(new Ticket(100001, LocalDate.of(2023, 1, 1)));
//        System.out.println(new Ticket(10000, LocalDate.of(2022, 12, 31))); //Id = 10000 is not valid
//        System.out.println(new Ticket(100002, LocalDate.of(2023, 1, 1))); // 100002 is not valid
//        System.out.println(new Ticket(10001, LocalDate.of(2022, 12, 30))); // Date = 2022-12-30 is not valid
//        System.out.println(new Ticket(100001, LocalDate.of(2023, 1, 2))); // Date = 2023-01-02 is not valid
    }
}
