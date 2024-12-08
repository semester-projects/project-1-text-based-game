package src.Component.Chp3;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Line.addHorizontalLine;
import static src.Helper.Line.addLines;
import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;
import static src.Helper.Input.input;


public class Chapter3 {
    int OFFICE = 0;
    int MILITARY_BASE = 0;
    int INTERROGATION_ROOM = 0;

    int pointer = 0;
    public void printChapter3(){
        animateText("""
            i = info u have gathered\n
            q = quit
            """, "black", false, true);
        chapter3Start();
        chapter3DecisionEngine();
        enter("Press Enter to continue to the next chapter");
    }

    public void chapter3DecisionEngine(){
        while(pointer < 3){
            animateText("1. Visit the Office");
            animateText("2. Visit the Military Base");
            animateText("3. Visit the Interrogation Room");

            animateText("Choose Your action from above: ", false, "cyan");
            int user_input = input(1);
            addLines(1);
        
            switch(user_input){
                case 1:
                    goToOffice();
                    break;
                case 2:
                    visitMilitaryBase();;
                    break;
                case 3:
                    visitInterrogationRoom();
                    break;
                default:
                    animateText("Invalid Input! Please choose again");
                    break;
            }
            addLines(1);
        }
        worthingtonQuatres();
    }

    public void chapter3Start(){
        clearScreen();
        animateText("\t\tChapter 3", "cyan");
        addLines(2);
        String quote = "\t\t\"Why live?\"";
        animateText(quote, "red", true, true);
        enter();

        addHorizontalLine(20);
        animateText("INT. WORTHINGTON'S QUARTERS - DAY", "black", false, true);
       
        
        animateText("The investigation had barely begun when the second murder took place. Shepard had just finished questioning Anne when the news came through.", null, false, true);
       
        
        animateText("The air in the room shifted from tense to terrifying. William Ashworth, who had always been the quiet, reliable assistant, had now found himself promoted to a position of power—the very rank Joseph Worthington had held before his untimely death.", null, false, true);
       
        
        animateText("Shepard stood motionless, staring at the messenger who brought the news. The murder had occurred in the same military barracks, in the very office where Joseph had been found lifeless just days ago.", null, false, true);
       
        
        animateText("The body of Lieutenant Colonel Arnold Preston, now promoted to Joseph's position, was discovered slumped in the chair, a bullet wound in his chest.", null, false, true);
       
        addHorizontalLine(20);

        addLines(2);
    }


    public void goToOffice(){
        if(OFFICE >= 1){
            animateText("T have got all the stuff");
            return;
        }
        addHorizontalLine(20);

        animateText("INT. SHEPARD'S OFFICE - MOMENTS LATER", "black", false, true);
       
        
        animateText("Shepard sat at his desk, eyes focused on the file in front of him, but his mind was elsewhere. William's sudden promotion to Joseph's rank left too many questions. Why had he been chosen for such a swift rise? It could've been out of respect for his capabilities, or it could have been part of a larger, more sinister plan.", null, false, true);
       
        
        animateText("William entered the room quietly, his usual sharp suit now slightly disheveled from the chaos of the investigation. His expression was unreadable, though Shepard could see the strain in his eyes. The young detective seemed unsettled, his steps heavy, as though the weight of the situation was pressing down on him.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(softly, looking at Shepard)", "blue", "Another one. Lieutenant Colonel Preston. Found dead in his office.");
       
        
        animateText("Shepard didn't respond right away, instead picking up his coffee cup and taking a slow sip. William watched him, waiting for some sign of direction, but Shepard remained silent, his gaze unfocused.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(flat)", "green", "It's too neat. Too convenient.");
       
        
        animateDialogue("WILLIAM", "You think it's connected to Joseph?", "blue", null);
       
        
        animateText("Shepard didn't answer directly. Instead, he stood up, walked over to the window, and stared out into the gray sky. His mind was working fast, piecing together the events, analyzing every movement, every word.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(quietly)", "green", "William, you've been promoted. Too quickly. Almost as if someone wanted you in that position.");
       
        
        animateText("William flinched slightly, but Shepard didn't turn to face him. He already knew the young detective's reaction before it happened.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(defensive)", "blue", "I didn't ask for it! You know that. It's just how things unfolded—quickly.");
       
        
        animateText("Shepard turned his gaze back to William, his eyes piercing, but his face expressionless.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(flat)", "green", "I don't believe in coincidences. The same office, the same method, the same kind of person. A military officer killed in the same way as Joseph… and now you're in his place.");
       
        
        animateText("William swallowed hard, his throat dry. He opened his mouth to speak but closed it again, unsure of what to say.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(slowly)", "blue", "You think I did it?");
       
        
        animateText("Shepard didn't answer immediately. He studied William carefully, taking note of every subtle twitch of his face, every slight tremor in his voice.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(softly)", "green", "I think you're too close to this, William. Too close to everything that's happened.");
       
        addHorizontalLine(20);

        OFFICE++;
        pointer++;
    }

    public void visitMilitaryBase(){
        if(MILITARY_BASE >= 1){
            animateText("Nothing new to see there");
            return;
        }
        addHorizontalLine(20);

        animateText("INT. MILITARY BASE - DAY", "black", false, true);
       
        
        animateText("The crime scene was a mess of tension, and it was clear that everyone was on edge. Shepard and William entered the room where Preston's body had been found, a pool of dark blood now staining the polished wooden floor. The military personnel had already secured the area, but it was still chaotic. Another death, and this one was tied to the same rank, the same circle of power.", null, false, true);
       
        
        animateText("Billy, now looking even more nervous than before, stood near the door, his arms crossed tightly across his chest. He glanced at Shepard and William as they entered, his eyes flickering with suspicion but also fear.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(eyes scanning the room)", "green", "What do we know?");
       
        
        animateText("One of the military officers approached, his face pale.", null, false, true);
       
        
        animateDialogue("OFFICER", "(urgently)", "blue", "It looks like a clean shot, Detective. Right through the heart. Just like Worthington. We've got no signs of forced entry, and the door was locked from the inside.");
       
        
        animateText("Shepard nodded, then walked over to the desk where Preston had been found. There was a letter—another cryptic note. He picked it up, studying the handwriting. It wasn't much different from the note found beside Joseph's body. The same sharp, careful script.", null, false, true);
         
        
        addHorizontalLine(20);

        MILITARY_BASE++;
        pointer++;
    }

    public void visitInterrogationRoom(){
        if(INTERROGATION_ROOM >= 1){
            animateText("Already interrogated Billy!");
            return;
        }

        addHorizontalLine(20);
        animateText("INT. INTERROGATION ROOM - LATER THAT DAY", "black", false, true);
       
        
        animateText("The questioning of the suspects was intense, and though Shepard's instincts told him to focus on William, he couldn't ignore the connection between him and the newly appointed position. But Billy, too, seemed more on edge than usual, his fidgeting and inability to make eye contact making Shepard suspicious.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(cutting to the point)", "green", "Billy, when you left Joseph's quarters the night he died, did you see anyone else?");
       
        
        animateText("Billy's eyes darted around the room, unsure. He cleared his throat, trying to gather his thoughts.", null, false, true);
       
        
        animateDialogue("BILLY", "(slowly)", "blue", "I... I didn't see anything. I went to my room. Stayed there. Didn't hear a thing.");
       
        
        animateText("Shepard's gaze lingered on him for a moment longer than necessary before turning to Anne, who was seated quietly in the corner. She hadn't offered much useful information, but she was starting to seem more detached than she had earlier in the investigation. Was she involved? Or was she merely another player in this twisted game?", null, false, true);
         
        
        addHorizontalLine(20);

        INTERROGATION_ROOM++;
        pointer++;
    }


    public void worthingtonQuatres(){

        addHorizontalLine(20);
        animateText("INT. WORTHINGTON'S QUARTERS - NIGHT", "black", false, true);
       
        
        animateText("The day had turned into night, and Shepard's mind was still racing. He couldn't shake the feeling that something was wrong—something deeper than what appeared on the surface. William's promotion, the quick succession of murders, the familiar methods, the locked rooms—nothing made sense.", null, false, true);
       
        
        animateText("As he stared out the window of his office, lost in thought, William entered quietly, standing in the doorway for a moment before speaking.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(softly)", "blue", "You still think I'm involved, don't you?");
       
        
        animateText("Shepard turned to face him, his face unreadable.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(stern)", "green", "I think you've been put in a position of power, William. Too easily. Too quickly. And with power comes a lot of temptation.");
       
        
        animateText("William seemed to flinch, but then he straightened, his jaw clenching.", null, false, true);
       
        
        animateDialogue("WILLIAM", "(defensive)", "blue", "I didn't do anything, Shepard. You have to believe me.");
       
        
        animateText("For a moment, Shepard said nothing. Then, after a long silence, he spoke again, his voice low and deliberate.", null, false, true);
       
        
        animateDialogue("SHEPARD", "(flat)", "green", "Someone here is hiding something. And one of us is lying. I'll find out who it is, even if it's you.");
       
        
        animateText("William didn't say another word, but the look in his eyes was filled with something unreadable. Was it fear? Guilt? Or something else entirely?", null, false, true);
       
        
        animateText("As the night wore on, Shepard's suspicions deepened. He had a sense that they were all trapped in a dangerous game—a game where no one was innocent, and anyone could be the next victim.", null, false, true);
        

        addHorizontalLine(20);
    }
}
