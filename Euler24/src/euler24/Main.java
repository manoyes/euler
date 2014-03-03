/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler24;

import java.util.ArrayList;

/**
 *
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Long> digits = new ArrayList<Long>();

        // Get the list of digits
        for (long i = 0; i < 10; i++) {
            digits.add(i);
        }

        long number = 0;        // Number to be calculated
        int index = 0;          // Current digit
        int place = 9201928;    // Lexicographic position of number to find
        int currentPlace = 0;   // Current position

        if (factorial(digits.size()) < place) {
            System.err.println("Place does not exist");
        } else {

            while (!digits.isEmpty()) {
                while (index < digits.size() &&
                       (currentPlace + factorial(digits.size() - 1)) < place) {
                    currentPlace += factorial(digits.size() - 1);
                    index++;
                }

                number += digits.remove(index);

                if (digits.size() > 0) {
                    number *= 10;
                }
                
                index = 0;
            }

            System.out.println("Number: " + number);
        }
    }

    public static int factorial(int index) {
        if (index == 0) {
            return 1;
        }
        return index * (factorial(index - 1));
    }
}
