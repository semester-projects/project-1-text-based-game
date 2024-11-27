package src.Component.Chp1;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;
import static src.Helper.Line.addHorizontalLine;
import static src.Helper.Line.addLines;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;

public class Chapter1 {
    public static void printChapter1(){
        clearScreen();
        animateText("\t\tChapter 1", "cyan");
        addLines(2);
        String quote = "\t\"It's not the face that makes someone a monster, it's the choices they make with their lives.\"";
        animateText(quote, "red", true, true);
        enter();

        addHorizontalLine(10);
        animateText("INT. SHEPARD HOLLIS'S OFFICE - MORNING", "black", false, true);
        enter(false);

        animateText("""
        A dimly lit room. Heavy curtains obscure the sunlight, casting the space in a grayish hue. The air is thick with the scent of coffee. On one side of the room, a desk cluttered with papers, open files, and a half-empty coffee cup. The only sound is the occasional rustle of paper and the rhythmic tick-tick of a clock hanging on the wall.
        Shepard Hollis, in his mid-thirties, is hunched over his desk. His unkempt hair falls into his eyes, which are half-lidded with fatigue. His coat, old and worn, hangs loosely over his shoulders. He sips from his coffee mug, his eyes scanning a set of documents.
        """, null, false, true);

        animateDialogue("WILLIAM ASHWORTH: ", "(late 20s, sharp-looking, well-dressed)", "stands in front of the desk, watching Shepard closely. William has a nervous energy about him, his fingers tapping on the side of a chair.lll","cyan");
    }
}