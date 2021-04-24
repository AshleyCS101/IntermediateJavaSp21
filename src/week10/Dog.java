package week10;

/*
 * Represents a dog
 */
public class Dog implements Driveable {
    private static final int MAX_ENERGY_LEVEL = 100;
    
    private final int energyPerHour;
    
    private String name;
    private int age;    // in human years
    private int energyLevel;
    
    public Dog(String name, int humanAge, int energyLevel, int energyPerHour) {
        this.name = name;
        this.age = humanAge;    // here, technically you could omit the this.
        this.energyLevel = energyLevel;
        this.energyPerHour = energyPerHour;
    }
    
    public Dog(String name, int energyLevel) {
        this(name, 0, energyLevel, 5);
    }
    
    public Dog(String name) {
        this(name, 50);
    }
    
    // GETTERS
    public String getName() {
        return name;
    }
    
    public int getDogAge() {
        return Dog.toDogYears(age);
        // technically you can also do:
        // return toDogYears(age);
    }
    public int getHumanAge() {
        return age;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
    
    // OTHER METHODS
    public void rename(String name) {
        this.name = name;
    }
    public void feed(int foodAmount) {
        energyLevel += foodAmount;
        
        if(energyLevel > MAX_ENERGY_LEVEL) {
            energyLevel = MAX_ENERGY_LEVEL;
        }
    }
    
    public void play(int hours) {
        energyLevel -= (energyPerHour * hours);
        
        if(energyLevel <0) {
            energyLevel =0;
        }
    }
    
    // STATIC METHODS    
    public static int toDogYears(int humanAge) {
        return (int) Math.round(humanAge/7.0);  // since the method returns an int, it's going to have to truncate
    }
    
    public static int toHumanYears(int dogAge) {
        return (int) Math.round(dogAge *7.0);
    }

    // OVERRIDDEN METHODS
    @Override
    public void drive(double miles) {
        if(energyLevel <= 0) {
            System.out.println(name + " is too tired to drive.");
        }
        System.out.println(name + " drove " + miles + " miles. Woof!");
        this.energyLevel -= 5 * miles;       
    }
}