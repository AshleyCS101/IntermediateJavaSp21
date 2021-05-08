package week13;

/**
 * Represents a group you can add things to
 */
public class Group {
    public void add() {
        System.out.println("added");
    }
    public void addAll(int amount) {
        for(int i=0; i<amount; i++) {
            add();
        }
    }
}
