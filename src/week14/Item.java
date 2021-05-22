package week14;

public class Item {
    private final String name;
    private final int weight;   // the weight of the item, in pounds
    
    // message that gets printed when item is used
    private final String useMessage;
       
    // creates an item
    public Item(String name, int weight, String useMessage) {
        this.name = name;
        this.weight = weight;
        this.useMessage = useMessage;
    }
    
    // returns the item name
    public String getName() {
        return name;
    }
    
    // returns the item's weight
    public int getWeight() {
        return weight;
    }
    
    // prints what happens when you use the item
    public void use() {
        System.out.println(useMessage);
    }
}
