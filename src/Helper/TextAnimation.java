package src.Helper;

import static src.Helper.Pauser.enter;

import java.util.Map;

public class TextAnimation {
    private static final int DEFAULT_DELAY = 5;
    private static final String RESET_COLOR = "\033[0m";
    private static final String BOLD_COLOR = "\033[1m";
    private static final String ITALIC_STRING = "\u001B[3m";
    private static final Map<String, String> colorMap = Map.of(
            "red", "\033[91m",
            "green", "\033[92m",
            "blue", "\033[94m",
            "yellow", "\033[93m",
            "magenta", "\033[95m",
            "cyan", "\033[96m",
            "white", "\033[97m",
            "black", "\033[90m",
            "gray", "\033[90m"
    );

    public static void animateText(String text) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }

    public static void animateText(String text, String color) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(getColor(color) + text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }

    public static void animateText(String text, boolean newLine) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        if(newLine){
            System.out.println();
        }
    }

    public static void animateText(String text, boolean newLine, String color) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(getColor(color) + text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        if(newLine){
            System.out.println();
        }
    }

    public static void animateText(String text, int delay, String color) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(getColor(color) + text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(delay > 0 ? delay : DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }

    public static void animateText(String text, String color, Boolean itBoolean) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(ITALIC_STRING + getColor(color) + text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }
    
    public static void animateText(String text, String color, Boolean itBoolean, Boolean bldBoolean) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(ITALIC_STRING + BOLD_COLOR + getColor(color) + text.charAt(i) + RESET_COLOR);
            try {
                Thread.sleep(DEFAULT_DELAY);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Animation interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }


    public static void animateDialogue(String CharName, String state, String color, String dialogue){
        if(state != null){
            animateText(CharName, color, false, true);
            animateText(state + ": ", color);
        }else{
            animateText(CharName + " : ", color, false, true);
        }

        if(dialogue != null){
            animateText(dialogue);
        }
        enter();
    }

    public static String getColor(String color){
        if (color == null || color.isEmpty()) {
            return RESET_COLOR;
        }

        return colorMap.get(color);
    }
}
