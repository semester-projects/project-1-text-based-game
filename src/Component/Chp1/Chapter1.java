package src.Component.Chp1;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;
import static src.Helper.Line.addHorizontalLine;
import static src.Helper.Line.addLines;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;

public class Chapter1 {
    
    public static int COLONEL_COUNT = 0;
    public static int KINSEY_COUNT = 0;

    public static void printChapter1(){
        chapter1Start();
        animateText("""
        You are given the case to solve, meet and interact with people to get some clue about the killer. Your current objective get the detail of the case.
        """);
    }

    public static void chapter1Start(){
        clearScreen();
        animateText("\t\tChapter 1", "cyan");
        addLines(2);
        String quote = "\t\"It's not the face that makes someone a monster, it's the choices they make with their lives.\"";
        animateText(quote, "red", true, true);
        enter();

        addHorizontalLine(10);
        animateText("INT. SHEPARD HOLLIS'S OFFICE - MORNING", "black", false, true);
        enter();

        animateText("""
        A dimly lit room. Heavy curtains obscure the sunlight, casting the space in a grayish hue. The air is thick with the scent of coffee. On one side of the room, a desk cluttered with papers, open files, and a half-empty coffee cup. The only sound is the occasional rustle of paper and the rhythmic tick-tick of a clock hanging on the wall.
        Shepard Hollis, in his mid-thirties, is hunched over his desk. His unkempt hair falls into his eyes, which are half-lidded with fatigue. His coat, old and worn, hangs loosely over his shoulders. He sips from his coffee mug, his eyes scanning a set of documents.
        """, null, false, true);

        animateDialogue("WILLIAM", "(softly)", "cyan", "Shepard… You've been at this all night again, haven't you?");        
        enter();

        animateDialogue("SHEPARD", "(flat, without looking up)", "green", "What's it to you?");
        enter();

        animateDialogue("WILLIAM", "(tentatively)", "cyan", "I've been thinking about the Worthington case. Have you made any progress?");
        enter();

        animateText("Shepard gives a small, almost imperceptible sigh, before putting his coffee down. He looks at William with a cold, calculating expression.", "black", false, true);
        enter();

        animateDialogue("SHEPARD", "(firmly)", "green", "No progress. And I don't plan to. I've been asked to investigate a murder. Not to solve it in an hour.");
        enter();

        animateText("William's eyes narrow, sensing tension in the air. Before he can respond, the door swings open, and a new figure enters.", null, false, true);
        enter();
    }

    public void visitColonel(int n){
        if(COLONEL_COUNT > 1){
            animateText("There is no one in the office. The office is locked.");
        }
    }
}