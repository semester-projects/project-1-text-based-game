package src.Engine.Middle;

import static src.Helper.Cleaner.clearScreen;

import java.util.ArrayList;

import src.Component.Chp3.Chapter3;


public class Midst {
    
    public void initialize(ArrayList<String> Info){
        clearScreen();
        Chapter3 chapter3 = new Chapter3(Info);
        chapter3.printChapter3();
    }
}