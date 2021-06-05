package week15;

import java.util.Arrays;

public class Week15 {
    private static int[] arr = {6, 4, 1, 8, 5, 3, 7, 9, 2};
    
    private static int[] kindasorted = {1, 2, 3, 5, 4, 6, 7, 9, 8};

    
    public static void main(String[] args) {
        //doThing(null);        
        selectionSort(arr);
        // arr
        System.out.println(Arrays.toString(arr));

    }
    
    public static void selectionSort(int[] arr) {
        // iterate through the array, find the next smallest element (from i to size -1)
        for(int i =0; i < arr.length; i++) {
            // find next smallest element
            
            int nextMinIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[nextMinIndex]) {
                    nextMinIndex = j;
                }
            }
            
            // swap with arr[i]
            int temp = arr[nextMinIndex];
            arr[nextMinIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void doThing(int[] arr) {
        // can have multiple catch blocks, they are tested in order.
        try {
            // null pointer?
            int i =0;
            
            while(true) {
                // array index exception?
                System.out.println(arr[i]);
                i++;
            }           
        } catch (ArrayIndexOutOfBoundsException a) { // "unchecked exceptions"
            System.out.println("Index error!");
        } catch (NullPointerException n) {  // "unchecked exceptions"
            System.out.println("Null pointer!");
        }
        
    }
}
