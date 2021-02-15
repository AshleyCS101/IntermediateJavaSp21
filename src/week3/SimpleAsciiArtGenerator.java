package week3;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 * Converts image into ascii art
 * 
 * Related video on dithering (Computerphile): https://www.youtube.com/watch?v=IviNO7iICTM
 *      Used by printers, newspapers, pixel art, etc. to create gradients with few shades
 * References:
 *  ascii art program: https://codereview.stackexchange.com/questions/241311/ascii-art-generator
 *  ascii gradient: http://paulbourke.net/dataformats/asciiart/
 *  rgb to greyscale formula: https://www.mathworks.com/help/matlab/ref/rgb2gray.html
 */
public class SimpleAsciiArtGenerator {
    private static String[] PICTURES = {
            "gradient.png", "torus.png", "mushroom.png", "mario.png", "link.png", "link2.png", // 0-5
            "kirby.png", "kermit.png", "bmo.png", "mike.png", "dali.png", "hepburn.png"               // 6-11
        };
    
    // if you want to load in your pictures you have to change the filepath
    private static String DEMO_FILE_NAME = "C:\\Users\\Ashley Luty\\Desktop\\pics\\" + PICTURES[2];
    
    // ART ADJUSTMENT FIELDS
    private static int ART_CHAR_WIDTH = 60;    // character width of the resulting ascii art
    private static double ART_CONTRAST = 10;    // how much to boost the contrast, 0 = no boost
    
    // ASCII ART DISPLAY FIELDS
    // the order of characters to use, from darkest to lightest
    private static String ASCII_GRADIENT = "@$B%8&WM#oahkbdpq*wmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?+~I<>i!l-_;:,\"^`'.` ";
    // used to adjust the grid used to process the image, because characters printed to console aren't square
    private static double CHAR_HEIGHT_WIDTH_RATIO = 2.3;    
    
    // MAIN ------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        BufferedImage img = getImageFromFileName(DEMO_FILE_NAME);             
        printImageAsAsciiArt(img);
    }
    
    // IMAGE PROCESSING METHODS ----------------------------------------------------------------------------------------
    
    // prints the image to console, as ascii art
    private static void printImageAsAsciiArt(BufferedImage img){
        int imgPixelWidth = img.getWidth(); // original image width, in pixels
        int imgPixelHeight = img.getHeight();     
        
        // tilePixelWidth is the pixel width of one grid square in the image, which will correspond to a single ascii character
        double tilePixelWidth = ((double) imgPixelWidth)/ART_CHAR_WIDTH;
        double tilePixelHeight = tilePixelWidth * CHAR_HEIGHT_WIDTH_RATIO;
        
        // iterate over the image, printing one ascii art row at a time
        for(int row = 0; (row*tilePixelHeight) < imgPixelHeight; row++) {    //row is current row number
            for(int col = 0; (col*tilePixelWidth) < imgPixelWidth; col++) {
                // note that (5,5) in graphics coordinates goes 5 right, and 5 down
                int currX = (int)(col*tilePixelWidth);   // the current x position (pixels) we're at in the picture
                int currY = (int)(row*tilePixelHeight);  
                                
                int pixelRgb = img.getRGB(currX, currY);    // rgb value of the current pixel
                char asciiSymbol = getAsciiCharFromRgb(pixelRgb);
                System.out.print(asciiSymbol);              
            }
            // finished printing this row, start a new line
            System.out.println();    
        }      
    }
    
    // returns the ascii character representing this rgb value
    private static char getAsciiCharFromRgb(int rgb) {
        double grey = getGreyFromRgb(rgb);       
        grey = increaseGreyContrast(grey);              
        
        // e.g. if grey = 0.5, we want to get the character halfway through ASCII_GRADIENT
        //  so multiply grey by the number of characters in ASCII_GRADIENT
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
    
    // takes a grey value (0 to 1) and returns a grey value with increased contrast (0 to 1)
    private static double increaseGreyContrast(double grey) {
        double x = grey;
        double y = x;
        
        // if the contrast should be changed, change it
        if(ART_CONTRAST != 0) {
            // input x into sigmoid (s-curve) function, to make dark greys darker and light greys lighter
            y = 0.5 + (-0.5/(Math.atan(ART_CONTRAST*(-0.5)))) * (Math.atan(ART_CONTRAST*(x - 0.5)));
        }
        
        return y;
    }    
    
    // IMAGE FILE METHODS ----------------------------------------------------------------------------------------------
    
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