package game;

import java.util.Scanner;

public class MapIO {
    private final Scanner scan;
    private final BattleIO battle;
    
    public MapIO(Scanner scan) {
        this.scan = scan;
        battle = new BattleIO(scan);
    }
    
    /*
     * Run through steps, maybe encounter an enemy
     * Returns when points = 10
     */
    public void run(Player player) {
        // while points != 10
        while(player.getPoints() < 1) {
            System.out.println("Type 'go' to move.");
            
            // take a step
            String input;
            boolean didStep = false;
            while(!didStep) {        
                input = scan.nextLine();
                
                // check step
                if(input.equals("go")) {
                    System.out.println("You take a step.");
                    didStep = true;
                } else {
                    System.out.println("Command not recognized. Please re-enter command: ");
                }
            }
        
            // took a step
            // maybe encounter enemy? -> call BattleIO
            if(Math.random() > 0.5) {
                // encounter enemy
                battle.run(player);              
            }  
        }  
        //
        // method is over
    }
    
    

}
