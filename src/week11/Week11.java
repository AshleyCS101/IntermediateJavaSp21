package week11;

import java.util.*;

public class Week11 {
    public static void main(String[] args) {        
        // WARM UP 1: Will this compile? --------------------------------------------------------------------------------
//        ArrayList<String> arrList = new ArrayList<>();      // LinkedList
//        System.out.println(arrList);
//        
//        List<String> list = new List<>();   // a List describes a class, but you can't instantiate a List (no implementation)
//        System.out.println(list);

        
        // WARM UP 2: Why might the following code not work? -------------------------------------------------------------
//        String str1 = "I'm feeling happy";
//        
//        char y = 'y';
//        String str2 = "I'm feeling happ" + y;       // can concatenate string with any primitive
//        
//        // Check if the strings are equal
//        System.out.println("The strings are equal (reference): " + (str1 == str2)); 
//        System.out.println("The strings are equal (value): " + (str1.equals(str2)));   // if str1 is null, you can't call .equals
//        System.out.println(str1);
//        System.out.println(str2);
        
        // == compares the value of primitives
        // == compares the addresses of objects (equal if they're referring to the EXACT same object)
        
        // GOBLINS -------------------------------------------------------------------------------------------------
        
        Goblin g = new Goblin();
        g.attack();
        
        FireGoblin f = new FireGoblin();    // reuse code
        f.attack();
        
        GoblinSwarm swarm = new GoblinSwarm(50);    // polymorphism (treat subclass like its superclass)
        swarm.attack();

    }
}
