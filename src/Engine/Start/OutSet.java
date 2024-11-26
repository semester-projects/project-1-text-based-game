package src.Engine.Start;

import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateText;

public class OutSet {
    public void intaltize(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        animateText("OutSet", 100, "red");
        enter();
    }
}
