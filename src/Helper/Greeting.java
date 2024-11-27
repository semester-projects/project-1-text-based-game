package src.Helper;

import static src.Helper.TextAnimation.animateText;
import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;
import static src.Helper.Spacer.addLines;

public class Greeting {
    public static void greet(String name) {
        animateText(("Hello , " + name + "!"), 50,  "green", false, true);
        animateText("Welcome to the game!", 50, "green", false, true);
        addLines(2);
        String title = "\t\tThe Tace of Absence";
        animateText(title, 50, "blue", false, true);
        enter();
        clearScreen();
    }
}
