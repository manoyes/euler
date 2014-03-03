/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler20;

/**
 *
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(40));
    }

    public static long factorial(long i) {
        if (i == 0) return 1;
        return i * factorial (i - 1);
    }
}
