package week12;

public class ClassA {
    protected int value;
    private String name;
    
    public ClassA() {
        System.out.println("Class A!");

        name = "A";
        value = 0;
    }
    
    public void printValue() {
        value++;
        System.out.println(value);
    }
}
