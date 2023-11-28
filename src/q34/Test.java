package q34;

public class Test {
    public static void main(String[] args) {
        int day = 5;
        String dayName = switch(day) {
            case 1 : yield  "SUNDAY"; //case 1 -> "SUNDAY";
            case 2 : yield "MONDAY";
            case 3 : yield "TUESDAY";
            case 4 : yield "WEDNESDAY";
            case 5 : yield "THURSDAY";
            case 6 : yield "FRIDAY";
            case 7 : yield "SATURDAY";
            default : yield "NA";
        };
        System.out.println(dayName);
    }
}
