package src.Helper;

import static src.Helper.TextAnimation.animateText;
import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;

public class Greeting {
    public static void greet(String name) {
        animateText(("Hello , " + name + "!"), 150,  "green", false, true);
        System.out.println();
        animateText("Welcome to the game!", 150, "green", false, true);
        System.out.println();
        String title = "\t\tThe Tace of Absence";
        animateText(title, 150, "blue", false, true);
        enter();
        clearScreen();
    }
}
