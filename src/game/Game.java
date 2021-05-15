package game;

import java.util.Scanner;

public class Game {
    private final Scanner scan;
    private final MapIO map;
    
    public Game() {
        scan = new Scanner(System.in);
        map = new MapIO(scan);
    }
    
    /*
     * "entry point" into game, the game starts running here
     */
    public void runGame() {
        System.out.println("Start game.");
        
        Player player = new Player();

        // divert: go to map and start stepping
        // return: when points = 10
        map.run(player);   
        
        System.out.println("Points: " + player.getPoints());        
        System.out.println("Ended game.");
    }
}
