package src.Component.Chp2;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Line.addLines;
import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;

import src.Helper.GameFileHandler;

import static src.Helper.Input.input;


public class Chapter2 {
    public static int BILLY = 0;
    public static int ANNE = 0; 
    public static int WILLIAM = 0;

    public static int pointer = 0;
    
    public void printChapter2(){
        animateText("""
        i = info u have gathered\n
        q = quit
        """, "black", false, true);
        chapter2Start();

        chapter2DecisionEngine();
        GameFileHandler.Chapter++;
    }

    public void chapter2DecisionEngine(){
        while(pointer < 4){
            animateText("1. Interrogate Billy");
            animateText("2. Interrogate Anne");
            animateText("3. Interrogate William");

            animateText("Choose Your action from above: ", false, "cyan");
            int user_input = input(1);
            addLines(1);

            switch (user_input) {
                case 1:
                    interrogateBilly();
                    break;
                
                case 2:
                    interrogateAnne();;
                    break;
                
                case 3:
                    interrogateWilliam();
                    break;
                default:
                    animateText("Invalid Input! Please choose again");
                    break;
            }

            addLines(1);
        }
        addLines(1);
        goToOffice();
        enter("Press Enter to continue to next Chapter");
    }
    public void chapter2Start(){
        clearScreen();
        animateText("\t\tChapter 2", "cyan");
        addLines(2);
        String quote = "\t\"The difference between humans and wild animals is that humans pray before they commit murder.\"";
        animateText(quote, "red", true, true);
        enter();

        animateText("""
        The investigation has only just begun, and the air is thick with tension. The room is now teeming with detectives, forensics experts, and the occasional military officer passing through. Despite the chaos, Shepard remains calm, standing at the center of it all, eyes narrowed, his mind working through every detail.	
        """, "black", false, true);

        addLines(2);

        animateDialogue("SHEPARD", "(to KINSEY, quietly)", "green", "I want a closer look at the suspects. No one leaves without being questioned.");
       
        
        animateDialogue("DETECTIVE KINSEY", "(gesturing to the others)", "cyan", "Right away.");
       
        
        animateText("Shepard stands still, watching his team scatter as they begin to interview the first set of suspects. William Ashworth, his loyal assistant, steps up beside him, holding a file with the names of the potential culprits.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(quietly)", "blue", "We have three primary suspects: Billy, Joseph, and, well... me.");
       
        
        animateText("Shepard turns slowly to William, his expression unreadable, but a flicker of something passes through his eyes.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(flat)", "green", "You're on the list?");
       
        
        animateDialogue("WILLIAM", "(slightly defensive)", "blue", "I don't know why, but it's just a formality, right?");
       
        
        animateText("Shepard doesn't answer right away, his gaze flicking to the suspects standing across the room. The tension is palpable. Everyone seems to be hiding something, and Shepard can feel it. He reaches for a nearby cup of coffee and takes a sip, keeping his eyes fixed on each suspect in turn.", null, false, true);
          
    }

    public void interrogateBilly(){
        if(BILLY > 1){
            animateText("I have already interrogate Billy.");
        }
        if(BILLY == 0){
            addLines(20);
            animateText("INT. MILITARY BASE - LATER THAT DAY", null, false, true);
           
            
            animateText("Shepard and William walk down the long, narrow hallway of the base, the sterile white walls seeming to close in on them. The sound of their footsteps echoes, but the silence between them speaks volumes. Shepard's face is tight with concentration as they approach BILLY, the first suspect, standing nervously near the interrogation room.", null, false, true);
           
            
            animateDialogue("BILLY", "(young, around 20, wearing a military uniform)", "cyan", "(clearly uncomfortable) Detective Hollis… Mr. Ashworth.");
           
            
            animateText("Shepard nods curtly but doesn't speak. Billy looks down, avoiding eye contact. William steps forward, his more approachable demeanor a stark contrast to Shepard's cold silence.", null, false, true);
           
            
            animateDialogue("WILLIAM", "(gently)", "blue", "Billy, we just need to ask you a few questions. It won't take long.");
           
            
            animateText("Billy nods, looking more nervous by the second. He's clearly hiding something, though Shepard isn't sure what yet.", null, false, true);
            
            addLines(20);
            BILLY++; 
            pointer++;
            return;      
        }
        if(BILLY == 1){
            addLines(20);
            animateText("INT. INTERROGATION ROOM - MOMENTS LATER", null, false, true);
           
            
            animateText("Billy sits across from Shepard and William, fidgeting with his hands. The room feels like it's closing in on him as Shepard leans forward, his eyes sharp and unblinking.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(low, calculating)", "green", "What was your relationship with Joseph Worthington?");
           
            
            animateText("Billy flinches at the mention of the name. His eyes dart nervously between Shepard and William. He tries to steady his breathing, but it's clear he's struggling to maintain his composure.", null, false, true);
           
            
            animateDialogue("BILLY", "(stammering)", "cyan", "We… we didn't always get along. He was a strict officer, you know? Very demanding. But… he was also someone I looked up to.");
           
            
            animateText("Shepard tilts his head, as if evaluating the sincerity of Billy's words.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(softly)", "green", "Tell me about the night he died.");
           
            
            animateText("Billy hesitates, his lips trembling. He glances at the door, clearly uncomfortable.", null, false, true);
           
            
            animateDialogue("BILLY", "(avoiding eye contact)", "cyan", "I... I didn't see anything unusual. I went to bed early, just like any other night.");
           
            
            animateText("Shepard leans in closer, his tone colder.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(flat)", "green", "It's funny how everyone seems to have gone to bed early the night of the murder. Too early, don't you think?");
           
            
            animateText("Billy shifts uncomfortably in his chair but remains silent. Shepard doesn't press him further. He stands and motions for William to follow.", null, false, true);
           

            addLines(20);
            BILLY++;
            pointer++;
            return;
        }
    }

    public void interrogateAnne(){
        if(ANNE > 1){
            animateText("She is busy right now");
            return;
        }

        if(ANNE == 1){
            animateText("I've already interrogate Anne.");
            ANNE++;
            return;
        }
        addLines(20);
        animateText("INT. WORTHINGTON'S QUARTERS - CONTINUOUS", null, false, true);
       
        
        animateText("The next suspect is Joseph Worthington's assistant, ANNE, a woman in her late 30s. She's composed, almost too composed, as she stands near the body, her expression cold, detached. She's been working with Joseph for years, and yet, there's an air of distance between them, a professional barrier that's impossible to ignore.", null, false, true);
       
        
        animateDialogue("ANNE", "(calm, with a hint of exhaustion)", "cyan", "I didn't expect the detective himself to come down here.");
       
        
        animateDialogue("SHEPARD", "(flat, with a slight raise of his brow)", "green", "Expecting someone else?");
       
        
        animateText("Anne doesn't flinch, but the tightness in her voice is evident.", null, false, true);
       
        
        animateDialogue("ANNE", "(slightly defensive)", "cyan", "Of course not. I just didn't think it would be so… personal.");
       
        
        animateDialogue("SHEPARD", "(leaning in)", "green", "You worked closely with Joseph. What was he like?");
       
        
        animateText("Anne's lips curl into a thin smile, but it's more a grimace than anything resembling warmth.", null, false, true);
       
        
        animateDialogue("ANNE", "(softly)", "cyan", "Joseph was… well, he had a reputation for being a tough man. He didn't trust easily, and neither did I. But we worked well together.");
       
        
        animateText("Shepard watches her closely, noting the absence of emotion in her voice. Something about her response doesn't sit right with him.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(nodding slowly)", "green", "Were you with him the night he died?");
       
        
        animateText("Anne's eyes flicker, betraying a flash of uncertainty. But it's gone as quickly as it came.", null, false, true);
       
        
        animateDialogue("ANNE", "(stiffly)", "cyan", "I left his office early that night. Nothing unusual.");
       
        
        animateText("Shepard doesn't press her further but makes a mental note of her reaction. Something about Anne feels off, but it's still unclear what exactly she's hiding.", null, false, true);
          
        
        addLines(20);
        pointer++;
        ANNE++;
    }

    public void interrogateWilliam(){
        if(WILLIAM >= 1){
            animateText("Something is odd about him.............");
            return;
        }

        addLines(20);
        animateText("INT. WORTHINGTON'S QUARTERS - LATER THAT NIGHT", null, false, true);
       
        
        animateText("The final suspect is William Ashworth, Shepard's loyal assistant. He's been with Shepard for years, but that doesn't mean he's beyond suspicion. After all, in a case like this, anyone could be the murderer. The shadows in the room grow long as Shepard turns to face William, his expression unreadable.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(sternly)", "green", "What were you doing the night of the murder?");
       
        
        animateText("William's response is immediate, though there's a noticeable flicker of tension in his eyes.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(firmly)", "blue", "I was with you, Shepard. You know that.");
       
        
        animateText("Shepard's eyes narrow.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(flat)", "green", "And before you came to my office?");
       
        
        animateText("William hesitates, and for the first time, Shepard sees a flash of uncertainty in his eyes.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(hesitant)", "blue", "I… I was working on some reports. I didn't hear anything.");
       
        
        animateText("Shepard studies him for a moment, then nods slowly. He trusts William, but trust has never been a good reason to rule someone out.", null, false, true);
       
        
        addLines(20);
        pointer++;
        WILLIAM++;
    }

    public void goToOffice(){

        addLines(20);
        animateText("INT. SHEPARD'S OFFICE - NIGHT", "black", false, true);
       
        
        animateText("Shepard sits at his desk, the dim light casting long shadows across his face. William stands at the window, his back to the room, lost in thought. The tension between them is palpable, though neither speaks.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(softly)", "green", "Someone's lying.");
       
        
        animateDialogue("WILLIAM", "(quietly, not turning)", "blue", "Who?");
       
        
        animateText("Shepard doesn't respond. Instead, he picks up a paper and starts examining it, his mind already working through the tangled web of lies and motives.", null, false, true);
       
        
        animateText("Every detail is a piece of the puzzle. The suspects, the notes, the missing information—it all points somewhere.", null, false, true);
       
        
        animateText("And Shepard knows that in the end, the truth will always come out. But who will survive to see it?", null, false, true);
       
        addLines(20);
    }
}
