package game;

import java.util.Scanner;

public class BattleIO {
    private final Scanner scan;
    
    public BattleIO(Scanner scan) {
        this.scan = scan;
    }
    
    // execute a battle, start-to-finish
    public void run(Player player) {
        System.out.println("You found an enemy!");
        int enemyHealth = 3;
        // keep doing turns until enemy is defeated
        while(enemyHealth >0) {            
            // execute a turn
            // player turn
            boolean didTurn = false;
            String input;
            System.out.println("Type 'attack' to attack.");
            while(!didTurn) {               
                input = scan.nextLine();
                
                if(input.equals("attack")){
                    System.out.println("You attack!");
                    enemyHealth--;
                    didTurn = true;
                } else {
                    System.out.println("Command not recognized.");
                }              
            }
            
        }
        System.out.println("Enemy defeated.");
        player.gainPoint();        
    }
}
