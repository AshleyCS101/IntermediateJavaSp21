package week7;

import java.util.Arrays;

public class Week7 {
    public static void main(String[] args) {
        // ARRAY BASICS ----------------------------------------
        
//        // instantiate array        
//        double[] numbers = new double[4];
//        numbers[0] = 4.2;
//        numbers[2] = 5.6;
//        
//        System.out.println(numbers[1]);
//        
//        boolean[] b = new boolean[5];
//        
//        System.out.println(b[4]);
//
//        // primitives 'default' to certain values
//        // objects 'default' to null
//        
//        String[] strs = new String[4];
//        strs[3] = "Nice";
        

        // ArrayIndexOutOfBoundsException
        
        // length
        //System.out.println(strs.length);
        
        // literal
//        
//        int[] nums = {2, 3, -3, 0};
//        
//        int[] num2 = new int[2];
//        num2[0] = 2;
//        num2[1] = 3;
//        num2[1] = 7;
//        
//        System.out.println(Arrays.toString(nums));
        
        // ARRAY TRAVERSAL
        
        // first n odd numbers in an array
        int n = 25;
        
        int[] odds = new int[n];
        
//        // iterate over each index
//        for(int i = 0; i < odds.length; i++) {  // iterates over elements from 0 to n-1
//            // current element
//            odds[i] = 2*i +1;
//        }
        
        // FOR EACH LOOP ---------------------------------------
//        int odd =1;
//        for(int curr : odds) {
//            curr = odd;
//            odd +=2;
//        }
//        
//        //System.out.println(Arrays.toString(odds));
//        
//        String[] names = {"Bob", "Martha"};
//        
//        for(String name : names) {
//            //name = "SpongeBob";
//            System.out.println(name);
//        }
        
        // for each loops can't alter the array, can't access current index        
        
        // EXERCISES
        
        // swapping elements
//        int[] arr = {2, 3, 0, 2, -3};
//        //{2, 3, -3, 56, 45};
//        int a = 2;
//        int b = 4;
//        
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//        
//        System.out.println(Arrays.toString(arr));
      
    }
    
    
}
