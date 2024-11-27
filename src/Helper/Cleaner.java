package src.Helper;

public class Cleaner {
    public static final String FLUSHER = "\033[H\033[2J";

    public static void clearScreen() {
        System.out.print(FLUSHER);
        System.out.flush();
    }
}
