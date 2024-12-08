package src.Helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import src.Component.Chp1.Chapter1;
import src.Component.Chp2.Chapter2;
import src.Component.Chp3.Chapter3;
import src.Component.Chp4.Chapter4;

public class GameFileHandler {
    public static int Chapter = 1;
    public static String NAME = "";
    
    public static void writeFile(){
        String[] tool = Inventory.getTool();
        String[] clue = Inventory.getClue();
        try{
            File f = new File("log/log.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            try(PrintWriter prw = new PrintWriter(new FileOutputStream(f))){
                prw.print(NAME);
                prw.println();
                for(int i = 0; i < tool.length; i++){
                    if(tool[i] != null){
                        prw.print(tool[i] + ",");
                    }
                }
                prw.println();
                if(clue.length > 0){
                    for(int i = 0; i < clue.length; i++){
                        if(clue[i] != null){
                            prw.print(clue[i] + ",");
                        }
                    }
                }else{
                    prw.print("null");
                }
                prw.println();
                prw.print(Chapter);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void readfile(){
        try{
            File f = new File("log/log.txt");
            if(f.exists()){
               if(f.length() <= 0){
                    System.out.println("No log file found.");
               }
               else{
                    System.out.println("Continuing Game");
               }
            }else{
                System.out.println("No log file found.");
            }

            Scanner read = new Scanner(f);
            NAME = read.nextLine();
            System.out.println(NAME);
            String[] tool = read.nextLine().split(",");
            for(int i = 0; i < tool.length; i++){  
                if(tool[i] != null){
                    Inventory.insertTool(tool[i]);
                }  
            }
            String[] clue = read.nextLine().split(",");
            if(!clue[0].equals("null")){
                for(int i = 0; i < clue.length; i++){
                    if(clue[i] != null)
                    Inventory.insertClue(clue[i]);
                }
            }
            Chapter = read.nextInt();
            read.close();
            if(Chapter == 1){
                Chapter1 chapter1 = new Chapter1();
                chapter1.printChapter1();
            }
            else if(Chapter == 2){
                Chapter2 chapter2 = new Chapter2();
                chapter2.printChapter2();
            }
            else if(Chapter == 3){
                Chapter3 chapter3 = new Chapter3();
                chapter3.printChapter3();
            }
            else if(Chapter == 4){
                Chapter4 chapter4 = new Chapter4();
                chapter4.printChapter4();
            }
            else{
                System.out.println("Invalid Chapter Number");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
