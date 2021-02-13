package week2;

// Review, and Strings
public class WeekTwo {
    public static void modWarmUp(int n) {
        for(int i = 0; i < 40; i++) {
            int r = i % n;
            System.out.println(r);
        }
    }
    
    public static void main(String[] args) {           
        /*
         *  Modulus ------------------------------------------------
         */
        
        // What is the output of this function call?
        //modWarmUp(7);   
        
       
        // Casting
        
        // casting
//        int n = (int) 47.5; // stores 47
//        
//        double d = n;
        
        // loop
        
//        int p = 5;
//        while(p < 10) {
//            System.out.println(p);
//            //need an update, or else you'll get an infinite loop
//            p += 2;
//        }
        


        /*
         * FOR LOOPS
         */
        
        // What's the output?
//        for (int i = 0; i < 5; i++){    // i: 0 to 4
//           for (int j = i; j <5; j++) { // j: runs from i, to 4
//               System.out.print(i); // prints i, some number of times
//               // i never changes
//           }
//           System.out.println();
//        }
        
        
        
        
        /*
         * STRINGS ------------------------------------------------
         */
        
        
//        String dave = "Dave?";
//        String davey = dave;      // davey stores address of dave, not dave
//        dave = "David";   // dave now stores address of "David"
//        System.out.println(dave);     // prints "David"
//        System.out.println(davey);    // prints "Dave?": still stores address of "Dave?", even though dave variable changed

        // concatenation
//        String str1 = 3 + "hi"; // 3 -> "3", and concatenate
//        String str2 = (3 + 5) + "hi"; // 8 + "hi" -> "8hi"    // use parentheses for clarity
        
//        
//        System.out.println(str2);
        
//        String str3 = "My name is \"Ashley\"";  // the escape \" refers to " (quote character)
//        System.out.println("Hello\nworld");
        
//        String str = "hi";
//        String s = new String("hi");  // forces a different address
//        
//        System.out.println(str);  // prints "hi"
//        System.out.println(s);    // prints "hi"
//        System.out.println(s == str);         // prints "false": compares addresses, which are different
//        System.out.println(s.equals(str));    // prints "true": .equals() compares the data, not the addresses
        
        

        
        // Escape Sequences: backslash and a character (e.g. "\n")
            // denotes special characters
        
        // What's the output?
        //System.out.println("They said it was \"butter\".\nIt's not butter.");
        //System.out.println("/\\______/\\\n|.\t.|\t-hey\n\\____[]__/");
 
    }
}
