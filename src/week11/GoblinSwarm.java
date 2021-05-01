package week11;

import java.util.*;

public class GoblinSwarm {
    List<Goblin> swarm;
    
    public GoblinSwarm(int size) {
        swarm = new ArrayList<>();
        
        for(int i =0; i < size; i++) {
            if(Math.random() < 0.1) {
                swarm.add(new FireGoblin());
            } else {
                swarm.add(new Goblin());
            }
        }
    }
    
    // calls all goblins to collectively attack, returns total damage
    public int attack() {
        int total = 0;
        for(Goblin g : swarm) { // for each Goblin (variable g) in swarm list
            total += g.attack();
        }
        
        return total;
    }
}
