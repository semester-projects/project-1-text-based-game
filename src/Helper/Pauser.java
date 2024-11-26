package src.Helper;

import java.io.IOException;

public class Pauser {
    public static void enter(){
        try {
            System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
        }
    };
}
