/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler9;

/**
 *
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            int a_sqrd = a * a;
            for (int b = a + 1; b < 1000; b++) {
                int b_sqrd = b * b;
                for (int c = b + 1; c < 1000; c++) {
                    int c_sqrd = c * c;
                    if (a + b + c == 1000 && a_sqrd + b_sqrd == c_sqrd) {
                        System.out.println("Product: " + a * b * c);
                        System.exit(0);
                    }
                }
            }
        }
    }

}
