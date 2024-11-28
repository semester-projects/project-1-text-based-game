package src.Component.Chp1;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Input.input;
import static src.Helper.Pauser.enter;
import static src.Helper.Line.addHorizontalLine;
import static src.Helper.Line.addLines;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;

import java.util.ArrayList;

public class Chapter1 {
    
    public static int COLONEL_COUNT = 0;
    public static int CRIME_SCENE_COUNT = 0;
    public static int OFFICE_COUNT = 0;
    public ArrayList<String> Info;
    public Chapter1(ArrayList<String> info){
        this.Info = info;
    }

    String[] dayStrings = {"Morning", "Afternoon", "Evening", "Next Day"};
    int pointer = 0;
    public void printChapter1(){
        chapter1Start();
        animateText("""
        You are given the case to solve, meet and interact with people to get some clue about the killer. Your current objective get the detail of the case.
        You can see the info u get from the people in the case file any time by entering "i" after someone chat.
        To quit enter q.
        """, "black", false, true);
        chapter1DecisionEngine();
    }

    public void chapter1DecisionEngine(){
        while(pointer < dayStrings.length){
            if(dayStrings[pointer] == "Next Day"){
                animateText("1. Visit Colonel");
            }else{
                animateText("1. Visit Colonel");
                animateText("2. Visit Crime Scene");
                animateText("3. Visit Office");
            }
            animateText("Choose Your action from above: ", false, "cyan");
            int user_input = input(1);
            addLines(1);
            if(user_input == 1){
                visitColonel();
            }
            else if(user_input == 2 && pointer != 3){
                visitCrimeScene();
            }
            else if(user_input == 3 &&  pointer != 3){
                goToOffice();
            }
            else{
                animateText("Invalid Input! Please choose again");
            }
            addLines(1);
        }
        addLines(3);
        enter("Press Enter for the Next Chapter");
    }

    public void chapter1Start(){
        clearScreen();
        animateText("\t\tChapter 1", "cyan");
        addLines(2);
        String quote = "\t\"It's not the face that makes someone a monster, it's the choices they make with their lives.\"";
        animateText(quote, "red", true, true);
        enter();

        addHorizontalLine(20);
        animateText("INT. SHEPARD HOLLIS'S OFFICE - MORNING", "black", false, true);
        enter();

        animateText("""
        A dimly lit room. Heavy curtains obscure the sunlight, casting the space in a grayish hue. The air is thick with the scent of coffee. On one side of the room, a desk cluttered with papers, open files, and a half-empty coffee cup. The only sound is the occasional rustle of paper and the rhythmic tick-tick of a clock hanging on the wall.
        Shepard Hollis, in his mid-thirties, is hunched over his desk. His unkempt hair falls into his eyes, which are half-lidded with fatigue. His coat, old and worn, hangs loosely over his shoulders. He sips from his coffee mug, his eyes scanning a set of documents.
        """, null, false, true);

        enter();
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
        addLines(20); 
        enter();
    }

    public void visitColonel(){
        if(dayStrings[pointer] == "Next Day"){
            addLines(20);
            animateText("INT. WORTHINGTON'S QUARTERS - THE NEXT DAY", null, false, true);
            animateText("The investigation continues. Shepard and his team have combed through every inch of the quarters, and though there's plenty of evidence, nothing concrete points to a clear suspect. There's something more at play—something hidden beneath the surface.", null, false, true);
            enter();
            
            animateText("As Shepard stands in the center of the room, his mind races through the possibilities. His brow furrows as he picks up a small, seemingly insignificant object from the floor—a discarded cufflink.", null, false, true);
            enter();
            
            animateDialogue("SHEPARD", "(softly, to himself)", "green", "A cufflink... from the Colonel's collection.");
            enter();
            
            animateText("The realization hits him like a wave.", null, false, true);
            enter();
            
            animateDialogue("SHEPARD", "(looking up sharply)", "green", "We've been looking in the wrong places.");
            enter();
            
            animateText("William, watching from the doorway, looks at Shepard, waiting for him to explain. But Shepard is already moving, determined and certain.", null, false, true);
            enter();
            
            animateDialogue("SHEPARD", "(to William with a laughing face)", "green", "Time's running out. Get ready. This is about to get very interesting.");
            enter();
            
            addLines(20);
            Info.add("a cufflink from the Colonel's collection");
            pointer++;
        }

        if(COLONEL_COUNT > 1){
            animateText("There is no one in the office. The office is locked.", "black", false, true);
            return;
        }

        if(COLONEL_COUNT == 1){
           animateText("Colonel might be busy right one, why not visit him later");
           COLONEL_COUNT++;
           return;
        }

        addLines(20);
        animateText("INT. HALLWAY - OUTSIDE SHEPARD'S OFFICE" + dayStrings[pointer], "black", false, true);
        animateText("COLONEL EDWARD BLACKTHORNE (early 40s, tall and broad-shouldered, with an air of authority) strides in. He wears a military uniform with impeccable precision. His face is a mask of professionalism, though his eyes betray a hint of impatience.", null, false, true);
        enter();

        Info.add("damn1");
        animateDialogue("COLONEL BLACKTHORNE", "(stepping into the office)", "red", "Detective Hollis, I trust you received my message.");
        enter();

        animateDialogue("SHEPARD", "(looking up, expression unreadable)", "green", "I did.");
        enter();

        animateText("William steps aside, a bit intimidated by the Colonel's presence. Shepard stands slowly, meeting the Colonel's gaze.", null, false, true);
        enter();

        animateDialogue("SHEPARD", "(calmly)", "green", "What brings you here, Colonel?");
        enter();

        animateDialogue("COLONEL BLACKTHORNE", "(stepping forward)", "red", "A situation has come up. A murder in one of our highest-ranking officer's quarters. You've been requested to handle this. You know the stakes.");
        enter();

        animateText("Shepard's lips curl into a faint, almost imperceptible smirk.", null, false, true);
        enter();

        animateDialogue("SHEPARD", "(smirking)", "green", "I'm no stranger to high stakes, Colonel. But I'd prefer details before I rush into a case.");
        enter();

        animateDialogue("COLONEL BLACKTHORNE", "(stern)", "red", "The deceased is Joseph Worthington. We're certain it's not an accident. You have 48 hours to get to the bottom of this. The entire chain of command is in turmoil. It's critical.");
        enter();

        animateDialogue("SHEPARD", "(looking down at the papers)", "green", "I see.");
        enter();

        Info.add("Complete the case in 48 hours");
        addLines(20);
        COLONEL_COUNT++;

        pointer++;
    }  

    public void visitCrimeScene(){
        if(CRIME_SCENE_COUNT > 1){
            animateText("Shepard has got all the evidence he needed", "black", false, true);
            return;
        }

        if(CRIME_SCENE_COUNT == 1){
            animateText("hmm....I think,I have got all the stuff.");
            CRIME_SCENE_COUNT++;
            return;
        }
        addLines(20);
        animateText("INT. WORTHINGTON'S QUARTERS - "  + dayStrings[pointer], null, false, true);
        animateText("The camera pans over the luxurious quarters, but the scene is starkly different now. The space is a mess, with items scattered around in disarray. The body of JOSEPH WORTHINGTON, the senior military officer, is found slumped at his desk. His face is pale, eyes wide in shock, and a bloodstained note is beside him. The note reads: 'The truth is always closer than you think.'", null, false, true);
        enter();
        
        animateText("Shepard enters the room with William by his side. Shepard's eyes immediately go to the note, his mind already racing with theories. He approaches the desk carefully, examining the body and the surroundings.", null, false, true);
        enter();
        
        animateDialogue("SHEPARD", "(softly, muttering to himself)", "green", "Interesting.");
        enter();
        
        animateText("William looks at Shepard, both nervous and curious.", null, false, true);
        enter();
        
        animateDialogue("WILLIAM", "(whispering)", "cyan", "What do you think happened here, Shepard?");
        enter();
        
        animateText("Shepard remains silent for a moment, his eyes narrowing. He reaches for the note and examines it.", null, false, true);
        enter();
        
        animateDialogue("SHEPARD", "(flat)", "green", "He didn't die by chance. This is too clean, too… deliberate. Someone wanted him dead. Someone who knows how to cover their tracks.");
        enter();
        
        animateText("William stands still, glancing around the room.", null, false, true);
        enter();
        
        animateDialogue("WILLIAM", "(slightly unnerved)", "cyan", "This doesn't feel like an ordinary murder.");
        enter();
        
        animateText("Shepard doesn't respond immediately. He continues to inspect the room, his mind churning. After a long pause, he turns to William, his voice cold and calculating.", null, false, true);
        enter();
        
        animateDialogue("SHEPARD", "(quietly)", "green", "I don't believe in coincidences. Let's see what the others have to say.");
        enter();
        
        Info.add("A note saying 'The truth is always closer than you think.'");
        addLines(20);
        CRIME_SCENE_COUNT++;

        pointer++;
    }

    public void goToOffice(){
        if(OFFICE_COUNT >= 1){
            animateText("I need to crack this mystery in 48 hours.");
            return;
        }

        addLines(20);
        animateText("INT. SHEPARD'S OFFICE - " + dayStrings[pointer], null, false, true);
        animateText("The clock shows it's nearing midnight. The office is quiet once again, the only sound the ticking of the clock. Shepard is hunched over more papers, his face illuminated by the faint light of an oil lamp. William stands by the window, gazing out into the darkness.", null, false, true);
        enter();
        
        animateText("Shepard's fingers trace the lines of a map on his desk, eyes scanning the details. The door creaks open slowly, and DETECTIVE KINSEY, a stern-looking woman with sharp eyes, enters the room.", null, false, true);
        enter();
        
        animateDialogue("DETECTIVE KINSEY", "(cutting to the point)", "yellow", "Sir, we've interviewed the staff. No one saw anything unusual.");
        enter();
        
        animateDialogue("SHEPARD", "(looking up, still calm)", "green", "No one ever does, kinsey.");
        enter();
        
        animateDialogue("DETECTIVE KINSEY", "(slightly frustrated)", "yellow", "You're not expecting to crack this in one night, are you?");
        enter();
        
        animateDialogue("SHEPARD", "(slowly standing up)", "green", "I don't need a lifetime to solve it. I need the truth.");
        enter();
        
        animateText("kinsey watches him, sensing the quiet intensity in his words. Shepard turns back to the map, fingers still tracing the lines.", null, false, true);
        enter();
        
        animateDialogue("SHEPARD", "(flat)", "green", "We'll find the killer. But I can't do it alone. This case is bigger than just a dead officer. We're dealing with something much darker.");
        enter();   

        addLines(20);
        OFFICE_COUNT++;
        pointer++;
    }
}