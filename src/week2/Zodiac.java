package week2;

import java.util.Scanner;

public class Zodiac {
    // "class constant" to avoid magic numbers (labels with a relevant variable name, so we know what "4" represents)
    // also makes it easier to change the value if needed
    private static final int MIN_RAT_YEAR = 4; // 4 AD was the year of the rat
    
    // "class constant" for animals in the zodiac
    private static final int NUMBER_OF_ANIMALS = 12;
    
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--- ZODIAC TELLER ---");
        System.out.println("Enter your birth year: ");
        
        int year = scan.nextInt(); 
        
        printZodiacAnimal(year);
        
        scan.close();
    }
    
    public static void printZodiacAnimal(int year) {
        // Special error case:
        // in Java specifically, mod of negative numbers gives negative numbers, which we don't want
        // so if you're born in 2400 BC you're out of luck
        if(year < MIN_RAT_YEAR) {
            System.out.println("Given year is too small.");
        }
        
        // figure out which animal using mod 12
        int animalIndex = (year - MIN_RAT_YEAR) % NUMBER_OF_ANIMALS;
        String animal = "";
        
        if(animalIndex == 0) {
            animal = "rat";
        } else if(animalIndex == 1) {
            animal = "ox";
        } else if(animalIndex == 2) {
            animal = "tiger";
        } else if(animalIndex == 3) {
            animal = "rabbit";
        } else if(animalIndex == 4) {
            animal = "dragon";
        } else if(animalIndex == 5) {
           animal = "snake";
        } else if(animalIndex == 6) {
            animal = "horse";
        } else if(animalIndex == 7) {
            animal = "goat";
        } else if(animalIndex == 8) {
            animal = "monkey";
        } else if(animalIndex == 9) {
            animal = "rooster";
        } else if(animalIndex == 10) {
            animal = "dog";
        } else if(animalIndex == 11) {   //remember: remainder goes from 0 to 11, not up to 12
            animal = "pig";
        }
        
        System.out.println(year + " is the year of the " + animal + "!");
    }
    
    // EXTRA: 2 alternate ways to write the method. This is material we haven't covered yet :D -------------------------
    
    
    // Using Case-Switch block
    public static void printZodiacAnimalWithCaseSwitch(int year) {        
        if(year < MIN_RAT_YEAR) {
            System.out.println("Given year is too small.");
        }
        
        int animalIndex = (year - MIN_RAT_YEAR) % NUMBER_OF_ANIMALS;
        String animal = "";
        
        // Use "case-switch," which is useful when an if/else uses specific cases (like here).
        // It's good to be aware of just in case you need it
        
        switch( animalIndex ) { // switch( *the value you're checking cases against* )
            case 0:
                animal = "rat";
                // use "break" to leave the case/switch block
                // otherwise java checks the next cases too
                break;  
            case 1:
                animal = "ox";
                break;           
            case 2:
                animal = "tiger";
                break;
            case 3:
                animal = "rabbit";
                break;  
            case 4:
                animal = "dragon";
                break;
            case 5:
                animal = "snake";
                break;           
            case 6:
                animal = "horse";
                break;
            case 7:
                animal = "goat";
                break; 
            case 8:
                animal = "monkey";
                break;
            case 9:
                animal = "rooster";
                break;           
            case 10:
                animal = "dog";
                break;
            case 11:
                animal = "pig";
                break; 
            default:
                // "default" branch runs if none of the cases are met
                break;
        }
        
        System.out.println(year + " is the year of the " + animal + "!");
    }
    
    // Uses an array, which we'll learn later
    public static void printZodiacAnimalWithArray(int year) {
        if(year < MIN_RAT_YEAR) {
            System.out.println("Given year is too small.");
        }
        
        // create an array of Strings, storing all animal names
        String[] zodiacAnimals = {
        //place:  0,    1,      2,       3,       4,         5,   etc.
                "rat", "ox", "tiger", "rabbit", "dragon", "snake", 
                "horse", "goat", "monkey", "rooster", "dog", "pig"
            };
        
        int animalIndex = (year - MIN_RAT_YEAR) % NUMBER_OF_ANIMALS;
        
        // access the animal at the "animalIndex"th place in the animals array
        String animal = zodiacAnimals[animalIndex];
        
        System.out.println(year + " is the year of the " + animal + "!");   
    }
}
