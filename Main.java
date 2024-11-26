import src.Helper.Pauser;
import static src.Helper.TextAnimation.animateText;

public class Main {
    public static void main(String[] args) {
        Pauser pauser = new Pauser();
        animateText("Hello, World!", 100, "cyan");
        pauser.enter();
        animateText("This is a text animation!", 100, "red");
        pauser.enter();
        animateText("This is another text animation!", 100, "green", true);
        pauser.enter();
        animateText("This is another text animation!", 100, "green", true, true);
    }
}