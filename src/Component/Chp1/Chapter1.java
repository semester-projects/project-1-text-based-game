package src.Component.Chp1;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;
import static src.Helper.Spacer.addLines;
import static src.Helper.TextAnimation.animateText;

public class Chapter1 {
    public void printChapter1(){
        clearScreen();
        animateText("\t\tChapter 1", "cyan");
        addLines(2);
        String quote = "\t\"It's not the face that makes someone a monster, it's the choices they make with their lives.\"";
        animateText(quote, "red", true, true);
        enter();
    }
}