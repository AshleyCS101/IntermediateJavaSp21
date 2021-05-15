package game;

public class Player {
    private int points;
    public Player() {
        this.points = 0;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void gainPoint() {
        points++;
    }  
}
