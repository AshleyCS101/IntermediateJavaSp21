package week8;

import java.util.Arrays;
import java.util.Random;

public class Week8 {
    
    public static void main(String[] args) {       
        // WARM-UP
//        int[] c = {1, 2, 3};
//                
//        // what gets printed?
//        warmUp(c);  // 3af
//        System.out.println(Arrays.toString(c)); // [5, 2, 3]
//        
//        warmerUp(c);
//        System.out.println(Arrays.toString(c)); // [0]      // [5,2,3]
        
        // MULTIDIMENSIONAL ARRAYS
        
        double[][] studentSats = {
                {1400}, // student 0
                {1500, 1540},
                {1346, 1490, 1500},
        };
        
        double[] studentSatAvg = new double[studentSats.length];
        
        for(int i=0; i <studentSats.length; i++) {
            // i is the index of current student
            double[] scores = studentSats[i];
            
            double avg = 0;
            for(double score : scores) {
                avg += score;
            }
            avg = avg/scores.length;
            
            studentSatAvg[i] = avg;
        }
        
//        System.out.println(Arrays.toString(studentSatAvg));

        // hide a potato, then find it
        
        // create a row by col boolean array, and randomly hide a potato in it (set an element to true)
        int rows = 3;
        int cols = 5;
        
        boolean[][] potatoField = new boolean[rows][cols];  // 5 row, 13 col 2d array
        
        Random rand = new Random();
        
        int randRowIndex = rand.nextInt(potatoField.length); // 0, 1, 2
        int randColIndex = rand.nextInt(potatoField[0].length);
        
        potatoField[randRowIndex][randColIndex] = true;
        
//        for(boolean[] potatoRow : potatoField) {
//            System.out.println(Arrays.toString(potatoRow));
//        }
                
        // STRING METHODS
        
//        String input = "flopsy, wopsy       , cotton tail , peter";
//        
//        // split method to separate by commas
//        String[] names = input.split(",");
//        
//        for(int i =0; i < names.length; i++) {
//            names[i] = names[i].trim();
//        }
//        
//        System.out.println(Arrays.toString(names));
//        
//        // strings are immutable, don't change, there's no setChar()       
//        // 3e2 -> "hELLO"
//        
//        String h = "hELLO";
//        String lower = h.toLowerCase();
//        
//        System.out.println(h.toLowerCase());
//        System.out.println(lower);
        
    }
    
    public static void warmUp(int[] arr) {
        // arr = 3af -> [5,2,3]
        arr[0] = 5;
        
        // arr = 3af -> [0,2,3]
    }
    
    public static void warmerUp(int[] arr) {
        // arr = 3af
        arr = new int[]{0};
        // d32 -> [0]
        // arr -> d32       only the address arr is pointing to changes. The address c points to is the same
    }

    public static boolean binarySearch(int[] arr, int value) {
        // left and right indexes
        int l =0;
        int r = arr.length-1;
        
        // while there's still a section to examine
        while(l <= r) { 
            // calculate the middle index (note that it's floored bc integer division)
            int m = (l+r)/2;
            
            if(value > arr[m]) {
                l = m+1;    
                // move l up past m, because value > arr[m]
            } else if (value < arr[m]) {
                r = m-1;
            } else {
                return true;
            }
        }
        
        return false;
    }
    
}
