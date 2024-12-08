package src.Component.Chp4;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Input.input;
import static src.Helper.Line.addHorizontalLine;
import static src.Helper.Line.addLines;
import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;

public class Chapter4 {
    public void printChapter4(){
        animateText("""
            i = info u have gathered\n
            q = quit
            """, "black", false, true);
        chapter4Start();
        chapter4DecisionEngine();
    }
    public void chapter4Start(){
        clearScreen();
        animateText("\t\tChapter 4", "cyan");
        addLines(2);
        String quote = "\t\"“A murderer kills a murderer, praised by the society!\"";
        animateText(quote, "red", true, true);
        enter();

        animateText("INT. SHEPARD'S OFFICE - NIGHT", "black", false, true);
       

        animateText("The faint flicker of the oil lamp cast long shadows across the room, where the silence felt suffocating. Shepard sat hunched over his desk, examining the evidence once more, his weary eyes scanning the pages of notes, photographs, and statements. The room felt heavy, the weight of the case pressing down on him.", null, false, true);
       

        animateText("His mind raced through the events of the past few days, piecing together the fragmented clues, but the answers never quite felt right. Something was off—something Shepard had ignored, something he hadn't wanted to admit.", null, false, true);
       

        animateText("Finally, he stood up from the desk, running a hand through his unkempt hair. The truth had been there all along, hiding in plain sight. It was time to confront it.", null, false, true);
       

        addLines(2);
    }

    public void chapter4DecisionEngine(){
        while (true) {
            animateText("1. Visit WorthingTon Quatres");
            animateText("Choose Your action from above: ", false, "cyan");

            int user_input = input(1);
            if(user_input == 1){
                visitWorthing();
            }
            else{
                animateText("Invalid Input! Please choose again");
                continue;
            }

            animateText("You have to made a decision, what to do next.");
            animateText("1. Arrest William");
            animateText("2. Investigate further");
            animateText("Choose Your action from above: ", false, "cyan");

            int user_input2 = input(2);

            if(user_input2 == 1){
                arrestWilliam();
            }
            else if(user_input2 == 2){
                talkThroughIt();
            }

            break;
        }
    }
    public void visitWorthing(){

        addHorizontalLine(20);
        animateText("INT. WORTHINGTON'S QUARTERS - NIGHT", "black", false, true);
       
        
        animateText("The final confrontation. William was waiting for him, his back to the door, arms crossed, a confident smile on his face. Shepard had never seen him like this before—so sure of himself, so calm, so... dangerous.", null, false, true);
       
        
        animateText("William turned as Shepard entered, his expression a mask of calculated composure.", null, false, true);
       
        
        animateText("WILLIAM (leaning back) You took your time, Shepard. I thought you would have figured it out by now.", null, false, true);
        animateText("SHEPARD (quietly) I've known for a while, William. You were always too eager, too ambitious. I just didn't want to believe it.", null, false, true);
       
        
        animateText("William smirked, his eyes glinting with pride. He took a step toward Shepard.", null, false, true);
       
        
        animateText("WILLIAM (mockingly) And now? Now you know the truth. I didn't need to kill them, Shepard. I just needed to eliminate the obstacles. I played the game better than anyone else, and now I'm where I belong.", null, false, true);
       
        
        animateText("Shepard's gaze hardened. He stepped forward, closing the distance between them, his voice low and dangerous.", null, false, true);
       
        
        animateText("SHEPARD (whispering) But the thing about ambition, William... it blinds you. You didn't just kill them—you killed yourself, too. You don't even realize it, but you've already lost.", null, false, true);
       
        
        animateText("William's smile faltered for a moment, a flicker of doubt crossing his face. Shepard reached into his coat pocket, pulling out a small, glimmering object. The room seemed to grow colder.", null, false, true);
        addHorizontalLine(20);
    }

    public void arrestWilliam(){

        addHorizontalLine(20);
        animateText("INT. WORTHINGTON'S QUARTERS - NIGHT", "black", false, true);
       
        
        animateText("The atmosphere is thick with the weight of the final confrontation. Shepard stands tall, his expression hard, as William, now disarmed and restrained, is escorted toward the door by military officers. The weight of the events seems to hang in the air—William's smugness shattered, his actions finally caught up with him.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(calm, authoritative)", "green", "You've played the game well, William. But now, the game's over.");
       
        
        animateText("William looks at him with a mixture of contempt and something deeper—regret? Fear? It's hard to say, but there's no smile left. He stands motionless as Shepard approaches, his eyes locking with William's one last time.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(quietly)", "red", "You think you've got it all figured out, don't you? All the pieces fit perfectly.");
       
        
        animateDialogue("SHEPARD", "(flat)", "green", "No. Not perfectly. But enough to put you away.");
       
        
        animateText("As the officers start to take William out of the room, Shepard takes one last look around, as though trying to confirm that everything is indeed over. The door shuts behind them, leaving Shepard alone in the room with the eerie silence of the night.", null, false, true);
       

        animateText("INT. SHEPARD'S OFFICE - LATER THAT NIGHT", "black", false, true);
       
        
        animateText("Shepard is sitting at his desk, his face illuminated only by the dim desk lamp. His fingers tap rhythmically against the wood, lost in thought. His eyes flicker to a photograph of the victims, their faces frozen in time.", null, false, true);
       
        
        animateText("\"But is he sure? Has he really captured the right criminal?\"", "blue", false, true);
       
        
        animateText("The sound of a ticking clock fades in, punctuating the uncertainty.", null, false, true);
       
        
        addHorizontalLine(20);
    }

    public void talkThroughIt(){
        addHorizontalLine(20);
        animateText("INT. WORTHINGTON'S QUARTERS - CONTINUED", "black", false, true);
       

        animateText("William's confident demeanor shattered as he took a step back, realizing Shepard's intentions. But it was too late.", null, false, true);
       

        animateDialogue("SHEPARD", "(quietly)", "green", "You think you can control everything, don't you? You've underestimated me. And now, I'm going to finish this—your game.");
       

        animateText("The moment stretched out, time seeming to slow as William's eyes darted around the room, searching for an escape that didn't exist. He took another step back, but Shepard was faster.", null, false, true);
       

        animateText("With a swift motion, Shepard drew his weapon. The cold steel was an extension of his own darkness, a reminder that some things, some people, need to be eradicated.", null, false, true);
       

        animateDialogue("SHEPARD", "(steely calm)", "green", "You thought I was just another cog in this machine, didn't you? That I was just another detective chasing after the truth... But truth isn't always so simple.");
       

        animateText("He raised the weapon, his eyes locking with William's.", null, false, true);
       

        animateDialogue("SHEPARD", "(calmly)", "green", "The truth is... I've always known what you were. And now, I'll make sure you never hurt anyone again.");
       

        animateText("BANG!", null, false, true);
       
        addHorizontalLine(20);
    }
}
