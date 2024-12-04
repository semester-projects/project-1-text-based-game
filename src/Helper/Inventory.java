package src.Helper;

public class Inventory {
    public static String[] tool = new String[100];
    public static String[] clue = new String[100];

    public static String[][] inventory = {tool, clue};

    public static void insertTool(String tool){
        if(tool != null){
            String[] temp = new String[inventory[0].length + 1];
            System.arraycopy(inventory[0], 0, temp, 0, inventory[0].length);
            temp[temp.length - 1] = tool;
            inventory[0] = temp;

        }
    }

    public static void insertClue(String clue){
        if(clue != null){
            String[] temp = new String[clue.length() + inventory[1].length];
            System.arraycopy(inventory[1], 0, temp, 0, inventory[1].length);
            temp[temp.length - 1] = clue;
            inventory[1] = temp;
        }
    }

    public static void removeTool(String tool){
        if(tool != null){
            for(int i = 0; i < inventory[0].length; i++){
                if(inventory[0][i] != null &&inventory[0][i].equals(tool)){
                    String[] temp = new String[inventory[0].length - 1];
                    System.arraycopy(inventory[0], 0, temp, 0, i);
                    System.arraycopy(inventory[0], i + 1, temp, i, inventory[0].length - i - 1);
                    inventory[0] = temp;
                    break;
                }
            }
        }
    }

    public static void removeClue(String clue){
        if(clue != null){
            for(int i = 0; i < inventory[1].length; i++){
                if(inventory[1][i].equals(clue
                )){
                    String[] temp = new String[inventory[1].length - 1];
                    System.arraycopy(inventory[1], 0, temp, 0, i);
                    System.arraycopy(inventory[1], i + 1, temp, i, inventory[1
                    ].length - i - 1);
                    inventory[1] = temp;
                    break;
                }
            }
        }
    }

    public static void printInventory(){
        System.out.print("Tool: ");
        for (String t : inventory[0]) {
            if (t != null) {
                System.out.print(t + " ");
            }
            else{
                System.out.print("None");
                break;
            }
        }
        System.out.println();

        System.out.print("Clue: ");
        for (String c : inventory[1]) {
            if (c != null) {
                System.out.print(c + " ");
            }
            else{
                System.out.print("None");
                break;
            }
        }
        System.out.println();
    }
}
