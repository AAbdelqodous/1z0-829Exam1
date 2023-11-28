package q27;

public class Test {
    enum Directions {
        NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");
        //As enum Directions contains more code after constant declarations,
        // hence last constant declaration must be followed by a semicolon.
        private String notation;

        Directions(String notation) {
            this.notation = notation;
        }

        public String getNotation() {
            return notation;
        }
    }

    public static void main(String[] args) {
        System.out.println( Test.Directions.NORTH.getNotation());
    }
}
