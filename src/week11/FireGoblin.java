package week11;

public class FireGoblin extends Goblin {   // "special type" of goblin
    private static final int MAX_FIRE_DAMAGE = 20;
    
    // implictly has an inherited health variable
    
    public FireGoblin() {
        //super();    // Java implicitly calls no-argument constructor of immediate parent
        System.out.println("fire goblin!");
    }
    
    // returns attack points
    @Override
    public int attack() {
        if(Math.random() > 0.5) {
            return super.attack(); // call attack method in immediate parent
        } else {
            // fire thing
            System.out.println("Fireball!");
            return (int) (Math.random() * MAX_FIRE_DAMAGE);
        }
        
    }
}
