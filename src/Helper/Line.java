package src.Helper;

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
}
