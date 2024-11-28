package src.Engine.Middle;

import static src.Helper.Cleaner.clearScreen;

import java.util.ArrayList;

import src.Component.Chp2.Chapter2;
import src.Component.Chp3.Chapter3;


public class Midst {
    
    public void initialize(ArrayList<String> Info){
        clearScreen();
        Chapter2 chapter2 = new Chapter2(Info);
        Chapter3 chapter3 = new Chapter3(Info);
        chapter2.printChapter2();
        chapter3.printChapter3();
    }
}