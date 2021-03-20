package week6;

public class Dog {
    private static final int MAX_ENERGY = 100;
    private String name;
    private int energyLevel;
    
    public Dog(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }
    
    public Dog(String name) {   // default energy of 50
        this(name, 50);
    }
    
    public String getName() {
        return name;
    }
    
    public int getEnergyLevel() {
        return energyLevel;
    }
    
    // feed this dog the given amount
    public void feed(int foodAmount) {
        energyLevel += foodAmount;
        
        // cap energy level when reaches max
        if(energyLevel > MAX_ENERGY) {
            energyLevel = MAX_ENERGY;
        }
    }
}
