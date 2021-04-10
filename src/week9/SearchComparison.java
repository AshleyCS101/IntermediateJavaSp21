package week9;

public class SearchComparison {
    public static void main(String[] args) {
        int[] billion = new int[1000000000];    // stores a billion 0's
        
        // LINEAR SEARCH: worst-case scenario, linear search checks every element -----------------------------------------  
        System.out.println("LINEAR SEARCH");
        
        // START TIMER
        long startTime = System.nanoTime();
        
        // DO THE SEARCH
        boolean hasElement = linearSearch(billion, 1);
        
        // END TIMER
        long endTime = System.nanoTime();
        
        double millisecondsElapsed = (endTime - startTime)/1000000d;
        System.out.println("The array contains 1: " + hasElement);
        System.out.println("Milliseconds elapsed: " + millisecondsElapsed);
        
        // BINARY SEARCH: only works on SORTED arrays, but much more efficient --------------------------------------------
        
        System.out.println("\nBINARY SEARCH");
        // START TIMER
        startTime = System.nanoTime();
        
        // DO THE SEARCH
        hasElement = binarySearch(billion, 1);
        
        // END TIMER
        endTime = System.nanoTime();
        
        millisecondsElapsed = (endTime - startTime)/1000000d;
        System.out.println("The array contains 1: " + hasElement);
        System.out.println("Milliseconds elapsed: " + millisecondsElapsed);
        
        // remember that as array size increases, binary search times grow much more slowly compared to linear search
               
        
    }
    
    public static boolean linearSearch(int[] arr, int value) {
        int counter =0;
        for(int i=0; i<arr.length; i++) {
            counter++;
            if(arr[i] == value) {
                return true;
            }
        }
        
        System.out.println("Checked " + counter + " elements while searching.");
        
        return false;
    }
    
    public static boolean binarySearch(int[] arr, int value) {
        // left and right indexes
        int l =0;
        int r = arr.length-1;
        
        int counter = 0;
        
        // while there's still a section to examine
        while(l <= r) { 
            // calculate the middle index (note that it's floored bc integer division)
            int m = (l+r)/2;
            
            counter++;
            
            if(value > arr[m]) {
                l = m+1;    
                // move l up past m, because value > arr[m]
            } else if (value < arr[m]) {
                r = m-1;
            } else {
                return true;
            }
        }
        
        System.out.println("Checked " + counter + " elements while searching.");
        
        return false;
    }
}
