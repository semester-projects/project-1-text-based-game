package src.Component.PreStory;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateText;

public class PreStory {
    public static void printPreStory() {
        clearScreen();
        
        String date = "12th November 1825";
        animateText(date, "magenta", false, true);
        
        String start = """
    (Laughters.....)
    The year is 1825, and the world is at the brink of a new era. The Industrial Revolution is in full swing, and the once quiet village of Ashwood is now bustling with activity. 
    The villagers are busy preparing for the annual Harvest Festival, a time of celebration and joy. But amidst the excitement, a sense of unease settles over the village.
    Strange occurrences have been happening, there was an increase in the murders, and the villagers are whispering about dark forces at work. 
    """;
        animateText(start);
        enter();
    
        animateText("Night: 9.05 pm ", false, "red");
        animateText("MILITARY HEAD OFFICE", true);
    
        animateText("Joseph Worthington (Head Officer): ", false, "red");
        String s1 = """
    Man! this year was tough. The murders have been piling up, and the villagers are getting restless. 
    I've been trying to get to the bottom of it, but it's like they're hiding something from me.
    """;
        animateText(s1);
        enter(false);
    
        animateText("Anonymous (A Whispering Voice): ", false, "red");
        String s2 = """
    Joseph, I know you're trying to help, but you're getting close to the truth. You
    need to be careful, the killer is getting bolder, and I fear it's only a
    matter of time before they strike again.
    """;
        animateText(s2);
        enter(false);
    
        animateText("Moments Later...", true);
        enter();
    
        String s3 = """
    (Sound of footsteps echoing in the corridor...)
    Suddenly, the room goes silent. Joseph stands still, sensing someone is nearby. 
    The flickering candlelight casts eerie shadows on the walls.
    """;
        animateText(s3);
        enter(false);
    
        String s4 = """
    A voice emerges from the darkness, calm yet sinister:
    "Joseph, your time is up."
    Before he can react, a figure lunges from the shadows, and the room is engulfed in chaos.
    """;
        animateText(s4, "cyan", false, true);
        enter();
    
        animateText("Anonymous(With a laugher): ", false, "red");
        animateText("""
    One more victim, one more secret kept. The game is far from over, Joseph.
                """, null, false, true);

        String s5 = """
    The next morning, Joseph Worthington is found lifeless in his office chair, a knife piercing his chest. 
    A bloodstained note lies on the desk:
    "You sought the truth, and now you have paid the price."
    """;
        animateText(s5, "red", false, true);
        enter();
    
        animateText("""
    The murder shocks the village, and whispers of a conspiracy spread like wildfire. 
    Shepard Hollis, the country's top detective, is summoned to solve the case. 
    But with each step closer to the truth, the darkness around the village grows thicker.
    """, true);
        enter();
    }   
}
