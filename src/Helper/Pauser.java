package src.Helper;

import java.io.IOException;

public class Pauser {
    public void enter(){
        try {
            System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
        }
    };
}
