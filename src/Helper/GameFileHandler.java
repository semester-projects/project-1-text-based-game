package src.Helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class GameFileHandler {
    public static int Chapter = 1;
    public static String NAME = "";
    
    static String[] tool = Inventory.getTool();
    static String[] clue = Inventory.getClue();
    public static void writeFile(){
        try{
            File f = new File("log/log.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            try(PrintWriter prw = new PrintWriter(new FileOutputStream(f))){
                prw.print("Name: " + NAME);
                prw.print("\nTool: ");
                for(int i = 0; i < tool.length; i++){
                    if(tool[i] != null){
                        prw.print(tool[i] + ", ");
                    }
                }
                prw.print("\nClue: ");
                for(int i = 0; i < clue.length; i++){
                    if(clue[i] != null){
                        prw.print(clue[i] + ", ");
                    }
                }
                prw.print("\nChapter: " + Chapter);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
