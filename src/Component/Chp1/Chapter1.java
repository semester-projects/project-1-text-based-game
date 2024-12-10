package src.Component.Chp1;

import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Input.input;
import static src.Helper.Pauser.enter;
import static src.Helper.Line.addHorizontalLine;
import static src.Helper.Line.addLines;
import static src.Helper.Line.printOptionMenuLine;
import static src.Helper.TextAnimation.animateDialogue;
import static src.Helper.TextAnimation.animateText;

import java.util.Random;

import src.Component.Chp2.Chapter2;
import src.Helper.GameFileHandler;
import src.Helper.Inventory;


public class Chapter1 {
    
    public static int COLONEL_COUNT = 0;
    public static int CRIME_SCENE_COUNT = 0;

    String[] dayStrings = {"Morning", "Afternoon", "Evening", "Next Day"};
    public static int pointer = 0;
    public void printChapter1(){
        chapter1Start();
        animateText("""
        You are given the case to solve, meet and interact with people to get some clue about the killer. Your current objective get the detail of the case.
        You can see the info u get from the people in the case file any time by entering "i" after someone chat.
        To quit enter q.
        """, "black", false, true);
        chapter1DecisionEngine();
        GameFileHandler.Chapter++;
    }

    public void chapter1DecisionEngine(){
        while(pointer < dayStrings.length){
            if(dayStrings[pointer] == "Next Day"){
                animateText("1. Visit Crime Scene again");
            }else{
                animateText("1. Visit  Crime Scene");
                animateText("2. Meet Colonel");
                animateText("3. Go to Office");
            }
            animateText("Choose Your action from above: ", false, "cyan");
            int user_input = input(1);
            addLines(1);
            if(user_input == 1){
                visitCrimeScene();
            }
            else if(user_input == 2 && pointer != 3){
                visitColonel();
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
       

        addHorizontalLine(20);
        animateText("INT. SHEPARD HOLLIS'S OFFICE - MORNING", "black", false, true);
       

        animateText("""
        A dimly lit room. Heavy curtains obscure the sunlight, casting the space in a grayish hue. The air is thick with the scent of coffee. On one side of the room, a desk cluttered with papers, open files, and a half-empty coffee cup. The only sound is the occasional rustle of paper and the rhythmic tick-tick of a clock hanging on the wall.
        Shepard Hollis, in his mid-thirties, is hunched over his desk. His unkempt hair falls into his eyes, which are half-lidded with fatigue. His coat, old and worn, hangs loosely over his shoulders. He sips from his coffee mug, his eyes scanning a set of documents.
        """, null, false, true);

       
        animateDialogue("WILLIAM", "(softly)", "cyan", "Shepard… You've been at this all night again, haven't you?");        
       

        animateDialogue("SHEPARD", "(flat, without looking up)", "green", "What's it to you?");
       

        animateDialogue("WILLIAM", "(tentatively)", "cyan", "I've been thinking about the Worthington case. Have you made any progress?");
       

        animateText("Shepard gives a small, almost imperceptible sigh, before putting his coffee down. He looks at William with a cold, calculating expression.", "black", false, true);
       

        animateDialogue("SHEPARD", "(firmly)", "green", "No progress. And I don't plan to. I've been asked to investigate a murder. Not to solve it in an hour.");
       
    }

    public void visitColonel(){
        if(COLONEL_COUNT > 1){
            animateText("There is no one in the office. The office is locked.", "black", false, true);
            return;
        }

        if(COLONEL_COUNT == 1){
           animateText("Colonel might be busy right one, why not visit him later");
           COLONEL_COUNT++;
           return;
        }

        addHorizontalLine(20);
        animateText("INT. HALLWAY - OUTSIDE SHEPARD'S OFFICE " + dayStrings[pointer], "black", false, true);
        animateText("COLONEL EDWARD BLACKTHORNE (early 40s, tall and broad-shouldered, with an air of authority) strides in. He wears a military uniform with impeccable precision. His face is a mask of professionalism, though his eyes betray a hint of impatience.", null, false, true);
       

        animateDialogue("COLONEL BLACKTHORNE", "(stepping into the office)", "red", "Detective Hollis, I trust you received my message.");
       

        printOptionMenuLine("I did", "Didn't receive it.", "No reply");
        int user_input = input();

        if(user_input == 1){
            animateDialogue("SHEPARD", "(looking up, expression unreadable)", "green", "I did.");
        }
        else if(user_input == 2){
            animateDialogue("SHEPARD", "(looking up, expression unreadable)", "green",
            "No, I didn't. I've been busy with some stuff.");
            addLines(1);
            animateText("William was stunned when he listen to this.", "black");
        }
        else if(user_input == 3){
            animateDialogue("SHEPARD", "(looking up, expression unreadable)", "green", "...");
        }
       

        animateText("William steps aside, a bit intimidated by the Colonel's presence. Shepard stands slowly, meeting the Colonel's gaze.", null, false, true);
       

        animateDialogue("SHEPARD", "(calmly)", "green", "What brings you here, Colonel?");
       

        animateDialogue("COLONEL BLACKTHORNE", "(stepping forward)", "red", "A situation has come up. A murder in one of our highest-ranking officer's quarters. You've been requested to handle this. You know the stakes.");
       

        animateText("Shepard's lips curl into a faint, almost imperceptible smirk.", null, false, true);
       

        animateDialogue("SHEPARD", "(smirking)", "green", "I'm no stranger to high stakes, Colonel. But I'd prefer details before I rush into a case.");
       

        animateDialogue("COLONEL BLACKTHORNE", "(stern)", "red", "The deceased is Joseph Worthington. We're certain it's not an accident. You have 48 hours to get to the bottom of this. The entire chain of command is in turmoil. It's critical.");
       

        animateDialogue("SHEPARD", "(looking down at the papers)", "green", "I see.");
       

        addHorizontalLine(20);
        COLONEL_COUNT++;

        pointer++;
    }  

    public void visitCrimeScene(){
        if(dayStrings[pointer] == "Next Day"){
            addHorizontalLine(20);
            animateText("INT. WORTHINGTON'S QUARTERS - THE NEXT DAY", null, false, true);
            animateText("The investigation continues. Shepard and his team have combed through every inch of the quarters, and though there's plenty of evidence, nothing concrete points to a clear suspect. There's something more at play—something hidden beneath the surface.", null, false, true);
           
            
            animateText("As Shepard stands in the center of the room, his mind races through the possibilities. His brow furrows as he picks up a small, seemingly insignificant object from the floor—a discarded cufflink.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(softly, to himself)", "green", "A cufflink... from the Colonel's collection.");
           
            
            animateText("The realization hits him like a wave.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(looking up sharply)", "green", "We've been looking in the wrong places.");
           
            
            animateText("William, watching from the doorway, looks at Shepard, waiting for him to explain. But Shepard is already moving, determined and certain.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(to William with a laughing face)", "green", "Time's running out. Get ready. This is about to get very interesting.");
           
            
            addHorizontalLine(20);

            pointer++;
            return;
        }

        if(CRIME_SCENE_COUNT > 1){
            animateText("Shepard has got all the evidence he needed", "black", false, true);
            return;
        }

        if(CRIME_SCENE_COUNT == 1){
            animateText("hmm....I think,I have got all the stuff.");
            CRIME_SCENE_COUNT++;
            return;
        }

        
        if(CRIME_SCENE_COUNT == 0){
            addHorizontalLine(20);
            animateText("INT. WORTHINGTON'S QUARTERS - "  + dayStrings[pointer], null, false, true);
            animateText("The camera pans over the luxurious quarters, but the scene is starkly different now. The space is a mess, with items scattered around in disarray. The body of JOSEPH WORTHINGTON, the senior military officer, is found slumped at his desk. His face is pale, eyes wide in shock, and a bloodstained note is beside him. The note reads: 'The truth is always closer than you think.'", null, false, true);
           
            
            animateText("Shepard enters the room with William by his side. Shepard's eyes immediately go to the note, his mind already racing with theories. He approaches the desk carefully, examining the body and the surroundings.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(softly, muttering to himself)", "green", "Interesting.");
           
            
            animateText("William looks at Shepard, both nervous and curious.", null, false, true);
           
            
            animateDialogue("WILLIAM", "(whispering)", "blue", "What are we dealing with here, Shepard?");
           
            
            animateText("Shepard remains silent. His eyes catch a peculiar marking on the desk—a faint, almost invisible groove etched into the wood. Brushing away some dust, he leans in closer, his sharp instincts kicking in.", null, false, true);
           
            
            addHorizontalLine(20);
        }
        
        animateText("You are going to search for clues. Look around the room carefully."); 

        while (true) {

            if (Inventory.checkInventory("cipher key") && Inventory.checkInventory("encrypted document")) {
                animateText("Shepard started cracking encrypted note using cipher.");
                
                animateDialogue("WILLIAM", "(staring in shock)", "blue", "Is that killer mess...?");
               
                
                animateDialogue("SHEPARD", "(nodding)", "green", "Yes. The pieces are falling into place, and the killer's identity won't stay hidden for long.");
               

                animateText("The mystery deepens as Shepard pockets the pin and deciphers the remaining details from the document.");
               
                
                animateDialogue("SHEPARD", "(quietly, but with conviction)", "green", "Worthington knew something he wasn't supposed to. And whoever killed him thought they could bury it.");
               
                
                animateText("He looks at William, his tone colder now.", null, false, true);
               
                
                animateDialogue("SHEPARD", "(grimly)", "green", "We're dealing with someone who plays a very dangerous game.");
               
                animateText("Shepard gathers all the clue. ");
                animateText("There was written \"The truth is always closer than you think. Look where the shadows fall, for they hide what the light cannot see.\" on the note. The question is who sent it or where it is from?", "black", true, true);
                Inventory.insertClue("A note saying :\"The truth is always closer than you think. Look where the shadows fall, for they hide what the light cannot see.\"");
               

                CRIME_SCENE_COUNT++;
                pointer++;
                return;
            }
            animateText("What do you want to investigate?");
            animateText("1. The bookshelf\n2. The desk\n3. The painting on the wall");
            animateText("Choose Your action from above: ", false, "cyan");
            int user_input = input();

            if (user_input == 1) {
                if(Inventory.checkInventory("flashlight")){
                    animateText("You inspect the bookshelf and find a hollowed-out book with a hidden key inside.");
                    Inventory.insertTool("key");
                    animateText("Key added to your inventory!");
                }
                else{
                    animateText("You can't see anything in the dark. You need a flashlight to inspect the bookshelf.");
                    animateText("The tool in the office");
                    animateText("Do you wanna move outside to grab the tool?(enter b to move outside): ", false);
                    String userString = input("S", true);
                    if (userString.equalsIgnoreCase("b")) { 
                        animateText("You decide to move outside to grab the tool.");
                        return; 
                    } else {
                        animateText("Invalid input. Staying inside.");
                    }
                }
            } 
            else if (user_input == 2) {
                if (Inventory.checkInventory("multi-tool knife")) {
                    animateText("Using the multi-tool knife, you pry open a hidden compartment under the desk.");
                    animateText("Inside, you find a puzzle box with engraved symbols.");
                    Inventory.insertTool("puzzle box");

                    animateDialogue("SHEPARD", "(to himself)", "green", "The puzzle box and burned document... they form a pattern.");
                   
                    animateText("The burned document, has written \"Between 5\" on it.");
                   

                    animateText("Guess 4 number to crack the code.");
                    int count = 0;
                    Random random = new Random();
                    while (count < 4) {
                        animateText("Enter the guess number: ", false);
                        int guess = random.nextInt(5);
                        int userInt = input(1);
                        if(guess == userInt){
                            count++;
                        }
                        else{
                            animateText("Why not I should try a different number.");
                        }
                    }
                    
                    animateText("Shepard aligns the symbols on the puzzle box based on the markings from the burned document.");
                   
            
                    animateText("With a faint *click*, the box opens, revealing a cipher key.");
                   
            
                    Inventory.insertClue("cipher key");
                } else {
                    animateText("The compartment is sealed. You might need a tool to open it.");
                    animateText("The tool in the office");
                    animateText("Do you wanna move outside to grab the tool?(enter b to move outside): ", false);
                    String userString = input("S", true);
                    if(userString.equals("q")){
                        return;
                    }
                }
            } 
            else if (user_input == 3) {
                animateText("You move the painting aside and find a safe embedded in the wall.");
                if (Inventory.checkInventory("key")) {
                    animateText("Using the key, you open the safe. Inside is an encrypted document and a broken military insignia pin.");
                    Inventory.insertTool("encrypted document");
                    animateText("Items added to your inventory!");
                } else {
                    animateText("You need a key to open the safe. Better keep looking.");
                }
            } 
            else {
                System.out.println(Inventory.checkInventory("encrypted document"));
                animateText("Invalid input. Try again!");

            }
        }


        // animateDialogue("SHEPARD", "(quietly, to himself)", "green", "A hidden mechanism...");
        // animateText("Shepard inspects the encrypted document and the military insignia, piecing together the mystery. 🕵️‍♂️");

        
        // animateDialogue("SHEPARD", "(quietly, to himself)", "green", "A hidden mechanism...");
        //
        
        // animateText("Shepard pulls out a small multi-tool knife from his inventory, flipping it open with precision. Carefully, he inserts the blade into the groove, feeling for resistance. A faint *click* echoes through the room, and a concealed compartment springs open on the underside of the desk.", null, false, true);
        //
        
        // animateText("Inside the compartment is a puzzle box, intricately designed with twisting dials and engraved symbols. Shepard pulls it out, his expression sharpening with intrigue.", null, false, true);
        //
        
        // animateDialogue("WILLIAM", "(confused)", "blue", "What the hell is that?");
        //
        
        // animateText("Shepard places the box on the desk and studies it.", null, false, true);
        //
        
        // animateDialogue("SHEPARD", "(smirking slightly)", "green", "A lock. And the note... it's the key.");
        //
        
        // animateText("He holds up the bloodstained note, rereading the words: 'The truth is always closer than you think.'", null, false, true);
        //
        
        // animateDialogue("SHEPARD", "(to himself)", "green", "Closer than you think...");
        //
        
        // animateText("He examines the symbols on the box and notices one matches a faint emblem on the edge of the note. Slowly, he aligns the symbols on the dials to mimic the emblem's arrangement. Another *click* sounds, and the box opens to reveal a small, encrypted document and a broken military insignia pin.", null, false, true);
        //
        
        // animateDialogue("WILLIAM", "(staring at the items)", "blue", "Is that—?");
        //
        
        // animateDialogue("SHEPARD", "(interrupting)", "green", "It's a fragment of the truth. But it's enough to tell us this wasn't random.");
        //
        
        // animateText("He pockets the insignia and studies the document, its contents partially readable.", null, false, true);
        //
    }

    public void goToOffice(){
        if(dayStrings[pointer] == "Night"){
            addHorizontalLine(20);
            animateText("INT. SHEPARD'S OFFICE - " + dayStrings[pointer], null, false, true);
            animateText("The clocks ticking. The office is quiet once again, the only sound the ticking of the clock. Shepard is hunched over more papers, his face illuminated by the faint light of an oil lamp. William stands by the window, gazing out into the darkness.", null, false, true);
           
            
            animateText("Shepard's fingers trace the lines of a map on his desk, eyes scanning the details. The door creaks open slowly, and DETECTIVE KINSEY, a stern-looking woman with sharp eyes, enters the room.", null, false, true);
           
            
            animateDialogue("DETECTIVE KINSEY", "(cutting to the point)", "yellow", "Sir, we've interviewed the staff. No one saw anything unusual.");
           
            
            animateDialogue("SHEPARD", "(looking up, still calm)", "green", "No one ever does, kinsey.");
           
            
            animateDialogue("DETECTIVE KINSEY", "(slightly frustrated)", "yellow", "You're not expecting to crack this in one night, are you?");
           
            
            animateDialogue("SHEPARD", "(slowly standing up)", "green", "I don't need a lifetime to solve it. I need the truth.");
           
            
            animateText("kinsey watches him, sensing the quiet intensity in his words. Shepard turns back to the map, fingers still tracing the lines.", null, false, true);
           
            
            animateDialogue("SHEPARD", "(flat)", "green", "We'll find the killer. But I can't do it alone. This case is bigger than just a dead officer. We're dealing with something much darker.");
              
    
            addHorizontalLine(20);
            return;
        }

        if(Inventory.checkInventory("flashlight") && Inventory.checkInventory("multi-tool knife")){
            animateText("You have a flashlight and a multi-tool knife in your inventory.", null, false , true);
            return;
        }
        animateText("Your are in the Shepard Office!");
        pointer++;
        while(true){
            animateText("Select form below: ", "cyan");
            animateText("0. Exit the office");
            animateText("1. Pick up the flash light.");
            animateText("2. Pick up the multi-tool knife");
            int userInt = input(1);
            if(userInt == 0){
                animateText("Going outside");
                return;
            }
            else if(userInt == 1 && !Inventory.checkInventory("flashlight")){
                Inventory.insertTool("flashlight");
                animateText("You picked up the flashlight!");
            }
            else if(userInt == 2 && !Inventory.checkInventory("multi-tool knife")){
                Inventory.insertTool("multi-tool knife");
                animateText("You picked up the multi-tool knife!");
            }
            else{
                animateText("Invalid choice. Please try again.");
            }
        }
    }
}