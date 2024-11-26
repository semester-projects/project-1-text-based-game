import src.Engine.Start.OutSet;

public class Main {
    public static void main(String[] args) {
        OutSet outSet = new OutSet();
        
        outSet.intaltize();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        outSet.intaltize();
    
    }
}