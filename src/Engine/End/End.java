package src.Engine.End;

import static src.Helper.TextAnimation.animateText;

import java.util.ArrayList;

import src.Component.Chp4.Chapter4;

public class End {
    public void initialize(ArrayList<String> Info){
        Chapter4 chapter4 = new Chapter4(Info);
        chapter4.printChapter4();

        animateText("The thing we see ain't real, it's just a illusion of someones dream.", "red", true, true);
    }
}
