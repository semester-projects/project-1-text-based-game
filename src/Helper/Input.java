package src.Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    
    public static String input(String s) {

        return scanner.nextLine().trim();
    }

    public static String input(String s, boolean trim){
        if(scanner.hasNextLine() && trim){
            scanner.nextLine().trim();
        }
        return scanner.nextLine().trim();
    }

    public static int input(int n) {
        try{
            return scanner.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            return input(n);
        }
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
