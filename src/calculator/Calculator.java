/*
 * Calculate the Volume of a Cylinder
 */

package calculator;

import java.util.Scanner ;
/**
 *
 * @author TaDah5199
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration area
        Scanner keyedInput = new Scanner(System.in);
        double height;
        double radius;
        double volume;
        final double pi = 3.141592653589793238462643;
        
        System.out.println("Please Enter the Height of the Cylinder: ");
        height = keyedInput.nextDouble();
        
        System.out.println("Please Enter the Radius of the Cylinder: ");
        radius = keyedInput.nextDouble();
        
        volume = height * radius * radius * pi;
        System.out.println("\nIf the height of the cylinder is " + height + " units.");
        System.out.println("\nAnd if the radius of the cylinder is " + radius + " units.");
        System.out.println("\nThen the volume of the cylinder is " + volume + " units cubed." ); 
        System.out.println("\nPlease donate to my paypal and follow me on twitch.");
    }
    
}
