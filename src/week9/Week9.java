package week9;

import java.util.ArrayList;
import java.util.List;

public class Week9 {
    public static void main(String[] args) {
        // Warm-up: search comparison
        
        // ArrayList
        List<String> names = new ArrayList<>();
        
        names.add("Jonah"); // index 0
        names.add("Pikachu");   // index 1
        names.add("Bulbasaur");   // index 2
//        
//        names.set(1, "Samuel");
//        
//        System.out.println(names);  // implicitly calls names.toString() method
//        
//        names.add(1, "Charmander");
//        
//        System.out.println(names);
//        
//        String charie = names.remove(1);
//        
//        System.out.println(charie);
//        
//        // traverse with for loop or for each
//        for(int i =0; i< names.size(); i++) {
//            // add a :) at the end of each string
//            String name = names.get(i);
//            names.set(i, name + " :)");
//        }
//        
//        System.out.println(names);
//        
//        for(String name : names) {
//            // add a :) at the end of each string
//            System.out.println(name + " :)");
//        }
        
       
        // remove every element (without using clear)
        
        System.out.println(names);
        
        // BAD! Be careful if you edit the List and accesss indexes; indexes may change
//        for(int i=0; i <names.size(); i++) {
//            System.out.println("i is " + i + " in " +names);
//            names.remove(i);
//        }
//        
//        while(names.size() >0) {
//            System.out.println(names);
//            names.remove(0);
//        }
//       
//       System.out.println(names);
       
       // Integer list
       
       List<Integer> numbers = new ArrayList<>();
       numbers.add(5);
       numbers.add(4);
       System.out.println(numbers);
       numbers.set(0, numbers.get(0) +1);   // Integer
       
       System.out.println(numbers);
       
       System.out.println(Integer.MAX_VALUE +1);
       // "integer overflow": if you go past max int value, it wraps around to negative values
    }
}
