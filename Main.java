import java.util.ArrayList;

import src.Engine.End.End;
import src.Engine.Middle.Midst;
import src.Engine.Start.OutSet;



public class Main {
    public static void main(String[] args) {
        ArrayList<String> Info = new ArrayList<>();
        OutSet outSet = new OutSet();
        Midst midSet = new Midst();
        End end = new End();
        outSet.initialize(Info);
        midSet.initialize(Info);
        end.initialize(Info);
    }
}