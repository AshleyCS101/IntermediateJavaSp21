package week14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week14 {   
    private enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY        
    }
    
    // hardcoded array of items: maybe takes up too much space?
    private static final Item[] DEFAULT = {
            new Item("apple", 1, "it's an apple"),
            new Item("banana", 1, "another fruit")           
    };
    
    public static void main(String[] args) {
        //  FILE IO ---------------------------------------------------------------------------------------------------

        String h = "\t hello\n";
        System.out.println(h);
        System.out.println(h.trim());
        //System.out.println(Week14.DEFAULT[0].getName());
        
        File f = new File("src/week14/items.txt");    // describes "items.txt" in src folder > week14 folder
        
        try {
            Scanner scan = new Scanner(f);  
            // ^^ may throw FileNotFoundException if file doesn't exist -> breaks to catch block
            
            // read file
            List<Item> fileLines = new ArrayList<>();
            
            while(scan.hasNextLine()) {
                // turn line into item
                String str = scan.nextLine();
                String[] itemvals = str.split(",");
                // str.trim() trims whitespace
                
                fileLines.add(new Item(itemvals[0], Integer.parseInt(itemvals[1]), itemvals[2]));
            }
            
            if(fileLines.size() >=2) {
                // print name of 2nd item
                System.out.println(fileLines.get(1).getName());
            }        
            
        } catch (FileNotFoundException e) {
            // only executes if FileNotFoundException occurs
            System.out.println("Couldn't find file.");  
            
            // possibly leave the method/program
//            return; OR System.exit(0);
        }
        
        
        File file = new File("src/week14/milk.txt");
        try {
            file.createNewFile();   // may throw IOException
            PrintWriter pw = new PrintWriter(file); // may throw FileNotFoundException
            
            // write file         
            pw.print("I like milk.");
            pw.println(" A lot.");
            
            // close file, ensuring everything gets written
            pw.flush();
            pw.close();
            
        } catch (Exception e) { // Catches IOException and FileNotFoundException
            System.out.println("Couldn't do the file thing.");  
            
            // possibly leave the method/program
//            return;
//            System.exit(0);
        }      
        
        // ENUMS stuff -------------------------------------------------------------------------------------------------
//        Day d = Day.valueOf("SATURDAY");
//        
//        if(d == Day.MONDAY) {
//            System.out.println("aw man!");
//        } else if (d == Day.SATURDAY) {
//            System.out.println("yay!");
//        }
//        
//        System.out.println(d.ordinal());
//        
//        Month m = Month.JANUARY;
//        System.out.println(m.toString());
        
        
        // case-switch ------------------------------------------------------------------------------------------------
//        String name = "joe";
//        
//        switch (name) {
//            case "joe":
//                System.out.println("Hello!");
//                //break;
//            case "zephyr":
//                System.out.println("Hey!");
//                break;
//            default:
//                System.out.println("Howdy");       
//        }
               
        
        // debug stepper:       
            // set breakpoints: stop program executing, let you step
            // "step over" methods, or "step into" methods
    } 
}
