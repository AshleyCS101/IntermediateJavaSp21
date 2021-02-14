package week3;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

/*
 * Converts image into ascii art
 * Doesn't work on transparent images
 * 
 * References:
 * ascii art program: https://codereview.stackexchange.com/questions/241311/ascii-art-generator
 * ascii gradient: http://paulbourke.net/dataformats/asciiart/
 * rgb to greyscale formula: https://www.mathworks.com/help/matlab/ref/rgb2gray.html
 */
public class AsciiArtGenerator {
    private static String[] PICTURES = {
            "gradient.png", "torus.png", "mushroom.png", "mario.png", "link.png", "link2.png", // 0-5
            "kirby.png", "kermit.png", "bmo.png", "mike.png", "dali.png", "hepburn.png"               // 6-11
        };
    
    // all these files are loaded from my computer desktop; if you want to load in your pictures you have to change the filepath
    private static String DEMO_FILE_NAME = "C:\\Users\\Ashley Luty\\Desktop\\" + PICTURES[0];
    
    // ASCII ART CHARACTER GRADIENT
    private static String ASCII_GRADIENT = "@$B%8&WM#oahkbdpq*wmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?+~I<>i!l-_;:,\"^`'.`  ";
    
    // ASCII ART DISPLAY FIELDS    
    // character width of the resulting ascii art
    private static int ART_CHAR_WIDTH = 100;
    // used to adjust the grid used to process the image, because characters printed to console aren't square
    private static double CHAR_HEIGHT_WIDTH_RATIO = 2.25;
    
    // MAIN
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        //BufferedImage img = getImageFromUser(scan);   // to get filename from console input
        
        BufferedImage img = getImageFromFileName(DEMO_FILE_NAME);
              
        printImageAsAsciiArt(img);
        
        scan.close();
    }
    
    // IMAGE PROCESSING METHODS
    
    // prints the image to console, as ascii art
    private static void printImageAsAsciiArt(BufferedImage img){
        int width = img.getWidth();
        int height = img.getHeight();     
        
        // tilePixelWidth is the pixel width of one grid square in the image, which will correspond to a single ascii character
        double tilePixelWidth = ((double) width)/ART_CHAR_WIDTH;
        double tilePixelHeight = tilePixelWidth * CHAR_HEIGHT_WIDTH_RATIO;
        
        // iterate over the image, printing one row at a time
        for(int row = 0; (row*tilePixelHeight) < height; row++) {    //row is current row number
            for(int col = 0; (col*tilePixelWidth) < width; col++) {
                // note that (5,5) in computer coordinates goes 5 right and 5 down
                int currX = (int)(col*tilePixelWidth);   // the current x position (pixels) we're at in the picture
                int currY = (int)(row*tilePixelHeight);  
                                
                int pixelRgb = img.getRGB(currX, currY);    // rgb value of the current pixel
                char asciiSymbol = getAsciiCharFromRgb(pixelRgb);
                System.out.print(asciiSymbol);              
            }
            System.out.println();   // finished printing this row, start a new line 
        }      
    }
    
    // returns the ascii character representing this rgb value
    private static char getAsciiCharFromRgb(int rgb) {
        double grey = getGreyFromRgb(rgb);
        
        // e.g. if grey = 0.5, we want the character halfway through ascii_gradient
        // so multiply grey by the number of characters in ASCII_GRADIENT
        int shadeIndex = (int) (grey * ASCII_GRADIENT.length());    
        
        // get shadeIndex-th character from the ascii gradient
        char result = ASCII_GRADIENT.charAt(shadeIndex);
        return result;
    }
    
    // returns a double grey (0 <= grey < 1) representing the given rgb value in greyscale. 0 is black, 0.999... is white
    private static double getGreyFromRgb(int rgb) {
        // use Color java class to split rgb into its components
        Color color = new Color(rgb);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        
        // to get grey (0-255): compute weighted average of rgb values
        // note that blue multiplier is less than red multiplier because blue is "darker" than red, etc.      
        double grey = (0.2989 * r + 0.5870 * g + 0.1140 * b);   
        
        grey = grey/255.0;  // divide by 255 to get greyscale from 0 to 1 ("normalize")
        return grey;
    }
    
    
    // IMAGE FILE METHODS
    
    // Asks user to input an image filename, and returns the image from the filename
    private static BufferedImage getImageFromUser(Scanner scan) {            
        BufferedImage image = null; // variable storing the image to get from the user
        
        while(image == null) {  // ie while no image was found
            System.out.println("Enter image filename: ");           
            String filename = scan.nextLine();
            
            image = getImageFromFileName(filename);
        }
        
        return image;
    }
    
    // Returns image from the given filename, but returns null if image was not found
    private static BufferedImage getImageFromFileName(String filename) {
        BufferedImage image = null;
        
        try {
            // this call might throw an exception if file name is invalid -> goes to catch block to handle the exception
            image = ImageIO.read(new File(filename));   
        } catch(IOException e) {  
            // IOException happens if program can't find the file; IO stands for input/output
            System.out.println("ERROR: Image file not found.");
        }
        
        return image;
    }  
}