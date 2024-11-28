package src.Engine.Start;

import static src.Helper.TextAnimation.animateText;

import java.util.ArrayList;

import src.Component.CharacterInfo.InfoChar;
import src.Component.Chp1.Chapter1;

import static src.Component.PreStory.PreStory.printPreStory;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Greeting.greet;
import static src.Helper.Input.input;

public class OutSet {
    public static String NAME;
    public void initialize(ArrayList<String> info){
        clearScreen();
        // animateText("Enter your Name: ", false);
        // NAME = input("s");
        // clearScreen();
        // greet(NAME);
        // System.out.print("Do you wanna know about the characters in the game. It will be helpful if u are playing it for the first time(Enter 'y' for yes): ");
        // String choice = input("s");
        // if(choice.equals("y")){
        //     InfoChar infoChar = new InfoChar();
        //     infoChar.infoChar();
        // }
        // printPreStory();
        Chapter1 chapter1 = new Chapter1(info);
        chapter1.printChapter1();
    }
}