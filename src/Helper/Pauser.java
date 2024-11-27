package src.Helper;

import java.io.IOException;

public class Pauser {
    public static void enter(){
        try {
            System.out.print("Press enter to continue");
            System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
        }
    };

    public static void enter(Boolean message){
        try {
            if(message){
                System.out.print("Press enter to continue");
            }
            System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
