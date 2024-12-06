package src.Helper;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    
    public static String input(String s) {
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
        return scanner.nextLine().trim();
    }

    public static int input(int n) {
        return scanner.nextInt();
    }

    public static int input(){
        int in = scanner.nextInt();
        while(in != 1 && in != 2 && in != 3){
            System.out.println("Invalid input. Please enter the correct option.");
            in = scanner.nextInt();
        }
        return in;
    }
}
