package week5;

public class SomeClass {
    // counts the total number of someclasses
    public static int totalSomeClasses =0;
    
    private int a;  // can't access a variable from outside the class
    private int b;
    private int c;
    
    public SomeClass(int a, int b, int c) { 
        this.a = a;
        this.b = b;
        this.c = c;
        
        totalSomeClasses++; // increase the count of some classes
    }
    
    // sets all fields to a default value of 5
    public SomeClass() {
        // call another constructor on this object being created
        this(5, 5, 5);         
    }
    
    public static void test() {
        System.out.println("testing!");
    }

    
    // WARM-UP: what happens when this method is called?
    public void warmUp() {
        int a = 1;

        System.out.println(a);  // refer to the local variable, prints 1
        System.out.println(this.a); // field a, prints 3
        System.out.println(getA()); // Java implicitly passes "this" to getA(), same as calling this.getA()
    }
    
    // returns this object (the object calling the method)
    public SomeClass getMyself() {
        return this;
    }
    
    public int getA() {
        return a;   // a refers to field (there's no local variable called a, so it must be the field)
    }
    
    public void warmUpSolution() {
        // remember: "this" refers to the current object
        
        // creates a local variable, "a"
        int a = 1;
    
        System.out.println(a); // refers to the local variable a
        System.out.println(this.a); // refers to the field a
        
        System.out.println(this.getA()); // this.getA() = getA(); they do the same thing and Java implicitly passes "this" regardless
    }
}
