package week8;

public class Week8 {
    
    public static void main(String[] args) {
        // Cleaning up booleans
        
        boolean isHungry = true;
        
        if(isHungry == true) {
            System.out.println("I'm hungry...");
        } else if(isHungry == false) {
            System.out.println("I'm full!");
        }
        
        // Combining boolean cases with ||
        boolean hasFood = false;
        boolean hasMoney = true;
        boolean isNearStore = true;
        
        if(isHungry && hasFood) {
            System.out.println("I can eat!");
            
        } else if(isHungry && hasMoney && isNearStore) {
            System.out.println("I can eat!");
            
        } else if(isHungry && !hasFood && !hasMoney) {
            System.out.println("I'm hungry but I can't get food...");
            
        } else if(isHungry && !hasFood && !isNearStore) {
            System.out.println("I'm hungry but I can't get food...");
            
        } else if(!isHungry) {
            System.out.println("I'm full!");
        }
        
 
        // put least-specific cases at top of if/else, to catch most of the cases
        // use || to combine cases with the same behavior
    }

}
