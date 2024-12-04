package src.Engine.Middle;

import static src.Helper.Cleaner.clearScreen;


import src.Component.Chp2.Chapter2;
import src.Component.Chp3.Chapter3;


public class Midst {
    
    public void initialize(){
        clearScreen();
        Chapter2 chapter2 = new Chapter2();
        Chapter3 chapter3 = new Chapter3();
        chapter2.printChapter2();
        chapter3.printChapter3();
    }
}