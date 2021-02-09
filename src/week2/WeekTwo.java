package week2;

import java.util.Scanner;

// Strings and char

public class WeekTwo {
    public static void main(String[] args) {
        // fyi
//        Scanner scan = new Scanner(System.in);
//        if(scan.nextFloat() == 1.0f) {
//            System.out.println("Yay");
//        }
        
        // Warm Ups
        modWarmUp(7);   // What is the output of this function call?
        
        // Zodiac function
    }
    
    public static void modWarmUp(int n) {
        for(int i = 0; i < 40; i++) {
            int r = i % n;
            System.out.println(r);
        }
    }
    
    //System.out.println(i + " % " + n + " is " + r);

}
