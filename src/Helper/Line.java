package src.Helper;

import static src.Helper.TextAnimation.animateText;

public class Line {
    
    public static void addLines(int n){
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static void addHorizontalLine(int n){
        addLines(1);
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        addLines(1);
    }

    public static void printOptionMenuLine(String s1, String s2, String s3){
        System.out.println("1. " + s1);
        System.out.println("2. " + s2);
        System.out.println("3. " + s3);
        animateText("Choose Your action from above: ", false, "cyan");
    }
}
