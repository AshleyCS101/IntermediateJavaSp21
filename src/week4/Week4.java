package week4;

public class Week4 {
    public static void main(String[] args) {   
        
        Dog myDog = new Dog("Rascal", 5);
        // myDog stores an object of type Dog, with name "Rascal" and age 5
        
        Dog dog1 = new Dog("Dollie", 9);
        // dog1 stores an object of type Dog, with name "Dollie" and age 9
        
        
        // call methods on an object with '.' dot operator
        dog1.bark();
        
        // different objects can store different data
        System.out.println(myDog.getName());    // prints "Rascal"
        System.out.println(dog1.getName());     // prints "Dollie"
        
        // Changing an object's data     
        System.out.println(dog1.getName()); // prints "Dollie"
        
        dog1.setName("Doll");   
        // now dog1 has the name "Doll"
        
        System.out.println(dog1.getName()); // prints "Doll"
        
        
        // ------------------------------------------------------------------------------------


        // Warm-up: what's the output?
//        System.out.println(getBirthdayMessage("Julie", 3));
   
        // variable scope: exists between closest enclosing brackets, after initialized
        
    }
    
    public static String getBirthdayMessage(String name, int age) {
        return "Happy " + getOrdinalForm(age) + " birthday, " + name + "!";
    }
    
    // returns a String representing the ordinal form of a given int
    private static String getOrdinalForm(int n) {
        String suffix = "th";
        int lastTwo = n %100;        
        if(lastTwo <10 || lastTwo >=20) {
            int lastDigit = n %10;          
            if(lastDigit == 1) {
                suffix = "st";
            } else if (lastDigit == 2) {
                suffix = "nd";
            } else if (lastDigit == 3) {
                suffix = "rd";
            }
        }          
        return n + suffix;
    }
}
