package week12;

public class ClassB extends ClassA {    
    public ClassB() { 
        // super();
        System.out.println("Class B!");
    }
    
    @Override
    public void printValue() {
        System.out.println("B value:");
        super.printValue();
    }
    
    public void extra() {
        System.out.println("Extra! " + value);
    }
    
    @Override
    public String toString() {
        return "Value: " + value;
    }
}
