package q2;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}
