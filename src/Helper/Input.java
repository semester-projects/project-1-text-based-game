package src.Helper;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    
    public static String input(String s) {
        return scanner.nextLine();
    }

    public static int input(int n) {
        return scanner.nextInt();
    }
}
