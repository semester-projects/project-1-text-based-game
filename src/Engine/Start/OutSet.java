package src.Engine.Start;

import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateText;

import src.Component.CharacterInfo.InfoChar;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Greeting.greet;
import static src.Helper.Input.input;

public class OutSet {
    public static String NAME;
    public void initialize(){
        clearScreen();
        animateText("Enter your Name: ", false);
        NAME = input("s");
        clearScreen();
        greet(NAME);
        System.out.print("Do you wanna know about the characters in the game. It will be helpful if u are playing it for the first time(Enter 'y' for yes or 'n' for no): ");
        String choice = input("s");
        if(choice.equals("y")){
            InfoChar infoChar = new InfoChar();
            infoChar.infoChar();
        }else{
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
        }
    }
}