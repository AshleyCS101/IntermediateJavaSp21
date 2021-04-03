package week8;

public class StringPractice {
    public static void main(String[] args) {
        // VAMPIRIFY (building strings)
        String welcome = "You must welcome use in before we can enter. Bleh!";
        String vampireWelcome = vampirify(welcome);
              
        System.out.println(vampireWelcome);      
        
        // PALINDROME (index pointers)
        String phrase = "Some men interpret nine memos";
        boolean isPalindrome = isPalindrome(phrase);        
        
        System.out.println("\"" + phrase + "\" is a palindrome: " + isPalindrome);
               
        // PANGRAM (frequency)
        String message = "The quick brown fox jumps over the lazy dog.";
        boolean isPangram = isPangram(message);
        
        System.out.println("\"" + message + "\" is a pangram: " + isPangram);
    }
    
    
    // vampires speak with 'w's pronounced as 'v's, so replaces all the 'w's with 'v's, preserving case
    public static String vampirify(String message) {
        String vampireMessage = "";     // store the new message in this string
        
        for(int i =0; i<message.length(); i++) {
            char curr = message.charAt(i);
            
            // if it's a w or W, replace with a v or V
            if(curr == 'w' || curr == 'W') {
                // turn the w into a v, works with both cases (v is one ascii code before w)
                vampireMessage += (char)(curr - 1); 
            } else {
               // not a w, so add the existing character
                vampireMessage += curr;
            }
        }
        
        return vampireMessage;
    }
    
    // returns true if the string is a palindrome, ignoring spaces and case
    public static boolean isPalindrome(String phrase) {
        // remove the spaces and turn to lower case (so case doesn't matter)
        String formattedPhrase = phrase.toLowerCase();
        formattedPhrase = formattedPhrase.replace(" ", ""); // replace any spaces with no space
        
        // have left and right indexes, and move them inward
        int left = 0;
        int right = formattedPhrase.length() -1;    //length-1 because index starts at 0, so last index is length -1
        
        // check if palindrome
        while(left < right) {
            // check if left and right character don't match
            if(formattedPhrase.charAt(left) != formattedPhrase.charAt(right)) {
                return false;
            } else {
                // move the indexes inward
                left++;
                right--;
            }
        }
        
        return true;
    }
    
    // returns true if a String contains all letters of the alphabet
    public static boolean isPangram(String message) {
        // make message lowercase (so case doesn't matter)
        String str = message.toLowerCase();
        
        // create letter frequency table
        boolean[] hasLetter = new boolean[26];  // if contains 'a', hasLetter[0] = true
        
        for(int i =0; i<str.length(); i++) {
            char curr = str.charAt(i);
            
            // if curr is a letter
            if(curr >= 'a' && curr <= 'z') {
                int letterIndex = curr - 'a';       // auto-casts to int
                hasLetter[letterIndex] = true;
            }           
        }
        
        // check if has all letters
        for(boolean b : hasLetter) {
            if(!b) {
                return false;
            }
        }
        
        return true;
    }

}
