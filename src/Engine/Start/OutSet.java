package src.Engine.Start;

import static src.Helper.Pauser.enter;
import static src.Helper.TextAnimation.animateText;
import static src.Helper.Greeting.greet;

public class OutSet {
    public void intaltize(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        greet("HMN");
        animateText("\t", 100, "red");
        enter();
    }
}