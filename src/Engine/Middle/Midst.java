package src.Engine.Middle;

import static src.Helper.Cleaner.clearScreen;

import java.util.ArrayList;

import src.Component.Chp2.Chapter2;

public class Midst {
    
    public void initialize(ArrayList<String> Info){
        clearScreen();
        Chapter2 chapter2 = new Chapter2(Info);
        chapter2.printChapter2();
    }

    
}