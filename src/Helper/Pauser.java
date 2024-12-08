package src.Helper;

import java.io.IOException;

public class Pauser {
    public static void enter(){
        try {
            char input = (char) System.in.read();
            
            if(input == 'i'){
                System.in.read();
                Inventory.printInventory();
                enter();
            }
            if(input == '\n'){
                return;
            }
            if(input == 'q'){
                GameFileHandler.writeFile();
                System.exit(0);
            }
            } catch (IOException e) {
                e.printStackTrace();
        }
    };

    public static void enter(Boolean message){
        try {
            if(message){
                System.out.print("Press enter to continue");
            }
            char input = (char) System.in.read();
            if(input == 'i'){
                System.out.println("You have entered the input 'i'.");
                enter(message);
            }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }

    public static void enter(String message){
        try {
            System.out.print(message);
            System.in.read();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
