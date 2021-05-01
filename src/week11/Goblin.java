package week11;

public class Goblin {
    protected static final int MAX_DAMAGE = 5;
    protected static final int MAX_HEALTH = 20;

    protected int health;
    
    public Goblin() {
        health = MAX_HEALTH;
        System.out.println("goblin!");
    }
    
    public Goblin(String message) {
        System.out.println(message);
    }
    
    // returns attack points
    public int attack() {
        System.out.println("Krakatow!");
        // Math.random(): returns a double between 0 and 0.99999
        return (int) (Math.random() * MAX_DAMAGE);
    }
    
    // hurts this goblin by the given amount
    public void hurt(int damage) {
        this.health -= damage;
    }
}
