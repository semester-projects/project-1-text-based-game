package src;

import src.Engine.End.End;
import src.Engine.Middle.Midst;
import src.Engine.Start.OutSet;



public class Main {
    public static void main(String[] args) {
        OutSet outSet = new OutSet();
        Midst midSet = new Midst();
        End end = new End();
        outSet.initialize();
        midSet.initialize();
        end.initialize();
    }
}