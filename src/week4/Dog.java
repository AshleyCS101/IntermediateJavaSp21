package week4;

public class Dog {
    // fields are usually private (to prevent external access)
    private String name;
    private int age;
    
    // CONSTRUCTOR: public, no return type, same name as class
    // initializes a Dog object, based on the given name and age
    public Dog(String name, int age) {
        // when the parameter is also "name", you have to use "this.name" to specify the object field
        // here, "name" refers to the given parameter, unless you specify "this.name"
        this.name = name;
        
        if(age <0) {
            System.out.println("Age can't be negative!");
        } else {
            // set the dog's age to the given age
            this.age = age;
        } 
    }
    
    // SETTERS
    
    // sets this Dog's name to the given name
    public void setName(String name) {
        this.name = name;  
    }
    
    // GETTERS 
    
    // returns this Dog's name
    public String getName() {
        // Java secretly passes the object that calls this method in a variable, "this"
        // implicitly calls "this.name" when you refer to fields in your code
        
        return name;
        // does the same thing as: return this.name;
    }
    
    // returns this Dog's age
    public int getAge() {
        grow();
        return age;
    }

    // private helper method for getAge()
    // outside methods can't make the dog grow directly
    private void grow() {
        age = age +1;
        // same as: this.age = this.age +1;
    }
    
    // OTHER METHODS
    
    // not all methods have to be getters or setters
    public void bark() {
        System.out.println("Woof!");
    }

}
