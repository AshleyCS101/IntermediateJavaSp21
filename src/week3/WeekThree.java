package week3;

// Methods (and char)

public class WeekThree {
    public static void main(String[] args) {
        /*
         * Warm-Up
         */
        
        // What's the output?
//        int cost = 20;
//        int tax = 2;
//        String itemCostMessage = "Your item costs: " + cost;
//        //String totalCostMessage = "Your total costs: " + cost + tax;
//        String totalCostMessage = "Your total costs: " + (cost + tax);  //22
//        
//        System.out.println(itemCostMessage);
//        System.out.println(totalCostMessage);
        
        /*
         * Homework Review
         */
        
        // prints ordinal number (int n)
        
        // separate the problem from the code
        /*
         * 0th, 1st, 2nd, 3rd, 4th -9th
         * 10th, 11th - 19th (all th)   (special case)
         * 20th, 21st, 22nd, 23rd, 24th - 29th
         * 30+ 
         * 
         * special case for 10-19
         * extract the last digit
         */
        

        /*
         * char
         */
        
//        char letter = 'A';
//        System.out.println(letter);      
        
        // casting    
        
        //System.out.println((char) 100);
        
        // print alphabet
       
//        int startA = (int) 'a';
//        for(int i =0; i < 26; i++) {
//            char letter = (char) (startA + i);
//            System.out.print(letter);
//        }       
        
        // string-primitive concatenation
//        boolean b = 3 <4;
//        String message = "The value is " + b + "hi";
//        
//        System.out.println(message);

        /*
         * Methods
         */   
        
        // scope
        // follow execution order        
        // calling methods in methods
        
//        double avg = getAverage(3,4);   //3.5
//        System.out.println(avg);
//        printAverage(3,4);
//        getAverage(3,4);

    }
    
    // returns the average of the numbers
    public static double getAverage(int num1, int num2) { // num1 = 3, num2 =4
        double avg = ((double) num1 + num2) /2;
        return avg; //3.5
    }
    
    // prints an average of the numbers
    public static void printAverage(int a, int b) {
        double avg = getAverage(b,a);
        System.out.println("Your average; "+ avg);
    }   
}
