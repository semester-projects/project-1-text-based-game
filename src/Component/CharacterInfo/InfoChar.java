package src.Component.CharacterInfo;

import static src.Helper.TextAnimation.animateText;
import static src.Helper.Cleaner.clearScreen;
import static src.Helper.Pauser.enter;
import static src.Helper.Line.addLines;

public class InfoChar {

    public void infoChar(){
        clearScreen();
        animateText("\t\tCharacters Info");
        shepardHollis();
        williamAshworth();
        josephWorthington();
        anneWhitlock();
        billyCarroway();
        josephAbbott();
        colonelEdwardBlackThrone();
        kinseyMillhone();
    }

    public void shepardHollis(){
        animateText("Shepard Hollis: " ,false, "green");
        String info = """
        A 35 year old detective, widely known for his extraordinary skills. His ability to deduce and to see the tiniest detail is out of the chart.\n
        He is a man of few words, but when he speaks, people listen. He is a man of justice, and he will stop at nothing to bring the truth to light.\n
        He is a man of mystery, and his past is shrouded in secrecy. But one thing is certain, he is a man you don't want to mess with.\n\n
        His appearance is quite interesting. A person with half eyes opened, take a sip from his coffee mug and dives into the world of mystery. No one
        knows about his actual background, and what he thinks, a complete mystery. But one thing is sure, he knows how to solve a mystery.\n
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void williamAshworth(){
        animateText("William Ashworth: " ,false, "green");
        String info = """
        A 28 year old young detective, who is still learning the ropes. He is a man
        of great enthusiasm and energy. He is always eager to learn and take on new challenges.\n
        He is a bit of a hothead and can do whatever it takes complete his goal at any means, and sometimes his impulsive nature gets the best of him. 
        But he is a good kid, and he has a lot of potential.
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void josephWorthington(){
        animateText("Joseph Worthington: " ,false, "green");
        String info = """
        A senior military officer. A man of great stature and even greater pride, Joseph was known for his strict leadership style and uncompromising demeanor. 
        His life was filled with luxury and privilege, but also with secrets, enemies, and a dangerous past. 
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void anneWhitlock(){
        animateText("Anne Whitlock: " ,false, "green");
        String info = """
        Anne is a former maid in Joseph\'s household. Dismissed under mysterious circumstances, she harbors a deep resentment toward the victim. 
        Anne is intelligent and composed, her demeanor calculated to deflect suspicion.
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void billyCarroway(){
        animateText("Billy Carroway: " ,false, "green");
        String info = """
        A brash and outspoken former soldier under Joseph\'s command, Billy is known for his fiery temper and a long history of disputes with his superiors. 
        Hot-headed and reckless, he frequently clashed with Joseph, making him an obvious suspect. Yet, his alibi is unusually solid, raising questions about whether he\'s being set up—or setting someone else up.
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void josephAbbott(){
        animateText("Joseph Abbott: " ,false, "green");
        String info = """
        A soft-spoken clerk who shares the victim’s name, Joseph Abbott appears unassuming at first glance. Known for his meticulous work and quiet demeanor, he seems the least likely of suspects. 
        However, his reserved nature hides a keen intellect, and clues suggest he may know far more about the crime than he lets on.
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void colonelEdwardBlackThrone(){
        animateText("Colonel Edward Blackthorne: " ,false, "green");
        String info = """
        A well-respected officer with a spotless record, Edward is seen as a stabilizing figure in a tumultuous time.
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }

    public void kinseyMillhone(){
        animateText("Kinsey Millhone: " ,false, "green");
        String info = """
        A 32 year detective having more than 15 year experience in this field. She is a very good detective and has a very good track record.
        """;
        animateText(info, 50, null);
        addLines(1);
        enter(true);
    }
}