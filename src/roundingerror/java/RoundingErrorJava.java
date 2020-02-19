/*
 * Julianne Wojdak
 * 19/02/2020
 * RoundingError.java
 */

package roundingerror.java;

import javax.swing.*;
/**
 *
 * @author JuWoj8013
 */
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double usernum;
        String myInput;
        
        //Prompts user to enter a number. Converts string to double
        myInput = JOptionPane.showInputDialog("Please enter a number:");
        usernum = Double.parseDouble(myInput);
        
        //Sqaure roots and squares the number inputted by the user
        double sqrt;
        sqrt = Math.sqrt(usernum);
        double square;
        square = sqrt*sqrt;
        
        //Outputs the square of the square of the number
        System.out.println("The square of the square = "+ square);
        
        //Calculates rounding error
        double round;
        round = usernum - square;
        
        //Outputs rounding error
        System.out.println("The round off error = "+ round);
        
    }
    
}
