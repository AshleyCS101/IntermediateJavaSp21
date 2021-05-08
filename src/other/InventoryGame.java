package other;

import java.util.Scanner;

import week10inventory.Inventory;

public class InventoryGame {
    private static final int INVENTORY_CAPACITY = 30;
    
    private Inventory inv;
    private boolean continueGame;   // true when the user wants to continue with the game

    public static void main(String[] args) {
        InventoryGame game = new InventoryGame();
        Scanner input = new Scanner(System.in);
        game.runGame(input);
        input.close();
    }
    
    public InventoryGame() {
        inv = new Inventory(INVENTORY_CAPACITY);
    }
    
    public void runGame(Scanner input) {
        continueGame = true;
        while(continueGame) {
            String command = input.nextLine();
            processInput(command);
        }
        System.out.println("Exiting Game.");
    }
    
    public void processInput(String command) {
        command = command.toLowerCase().trim();
        
        switch (command) {         
            case "print":
                inv.printItems();
                break;
            case "exit":
                continueGame = false;
                break;
            default:
                System.out.println("Command not recognized. Please try again.");
                break;
        }
    }
}
