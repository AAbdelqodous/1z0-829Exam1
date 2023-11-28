package q24;

import java.time.LocalDate;

record Ticket2(int id, LocalDate date) {
    Ticket2 (int id, LocalDate date) {
        if(id < 10001 || id > 100001){
            throw new IllegalArgumentException(String.format("Id = %s is not valid", id));
        }
        if(date.isBefore(LocalDate.of(2022, 12, 31)) ||
                date.isAfter(LocalDate.of(2023, 1, 1))){
            throw new IllegalArgumentException(String.format("Date = %s is not valid", date.toString()));
        }
        this.id = id;
        this.date = date;
    }
}
