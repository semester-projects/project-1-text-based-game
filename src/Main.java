package src;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Input.input;
import static src.Helper.TextAnimation.animateText;

import java.io.File;

import src.Engine.End.End;
import src.Engine.Middle.Midst;
import src.Engine.Start.OutSet;
import src.Helper.GameFileHandler;


public class Main {
    public static void main(String[] args) {
        clearScreen();
        String title = "===========================\n"
                + "    WELCOME TO THE GAME    \n"
                + "===========================";
        
        String menu = "\n 1. New Game\n"
                    + " 2. Continue\n"
                    + "===========================\n";

        animateText(title, "red", true, true);
        animateText(menu, "red", true, true);
        animateText("Choose your option (1 or 2): ", false, "red");

        int choice = input(1);

        if (choice == 1) {
            animateText("Starting a New Game... Good luck!", "red", true, true);
            OutSet outSet = new OutSet();
            Midst midSet = new Midst();
            End end = new End();
            outSet.initialize();
            midSet.initialize();
            end.initialize();
        } else if (choice == 2) {
            animateText("Loading your progress... Stay sharp!", "red", true, true);
            try{
                File file = new File("log/log.txt");
                if(file.exists()){
                    if(file.length() > 0){
                        GameFileHandler.readfile();
                    }
                }else{
                    animateText("Damn, no saved game, how about restart the game");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        } else {
            animateText("Invalid choice! Restart the game, buddy!", "red", true, true);
        }
    }
}