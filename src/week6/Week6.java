package week6;

import java.util.Random;

public class Week6 {
    public static final Dog d = new Dog("Dudley", 65);  
    // since reference variables store an address, final means
    // the address can't be changed

    public static void main(String[] args) {
        
//        Dog dog = new Dog("George", 0); // creates a new dog, stores at some address
//        Dog dog2 = new Dog("George", 0);    // stored at different address
        
        // System.out.println(dog == dog2); // prints false
        
        // String equality: compare with .equals
        
//        String f = new String("Hi");
//        String g = new String("Hi");    // look to see if any existing objects match this data, assigns it to that address
//        System.out.println(f== g);
//        System.out.println(f.equals(g));
        
        


        
        
        
//        Vet.feedDog(dog);
//        Vet.feedDog(dog2);
//        
//        System.out.println(dog.getEnergyLevel());
//        System.out.println(dog2.getEnergyLevel());
        
//        int a = 34;
//        a +=1;
//        System.out.println(a);
//        int b = a;  // copies 34, stores 34, not a pointer to a or anything
//        b +=20;
//        System.out.println(b);
//        
//        Vet.feedNumber(a);
//        
//        // primitives are stored and passed by VALUE (copied)
//        System.out.println(a);
        
        
//        String str = "Hi";    
//        String str2 = str;  // copies the ADDRESS
//        
//        str = "Hello";
//        
//        System.out.println(str2);
        
        
        // REFERENCE VARIABLES ------------------------------------
        
        // Null Pointer Exception
        
        // OBJECT EQUALITY
        
        // IMPORTING
        
        Random rand = new Random();
        
        for(int i =0; i<10; i++) {
            //System.out.println(rand.nextInt(100));
        }
        
        System.out.println(Math.PI);
                
        

    }
    
    

}
