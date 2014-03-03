/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            final int grid_size = 20;
            int[][] grid = new int[grid_size][grid_size];
            int product = 0;
            int numTerms = 4;
            Scanner sc = new Scanner(new File(args[0]));

            for (int i = 0; i < grid_size; i++) {
                for (int j = 0; j < grid_size; j++) {
                    grid[i][j] = sc.nextInt();
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
// Horizontals
            for (int j = 0; j < grid_size; j++) {
                for (int i = 0; i < grid_size; i++) {
                    try {
                        product = Math.max(grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j], product);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                    }
                }
            }
            // Verticals
            for (int j = 0; j < grid_size; j++) {
                for (int i = 0; i < grid_size; i++) {
                    try {
                        product = Math.max(grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3], product);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                    }
                }
            }
            // Diagonals
            for (int j = 0; j < grid_size; j++) {
                for (int i = 0; i < grid_size; i++) {
                    try {
                        product = Math.max(grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3], product);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                    }
                }
            }
            System.out.println("Max Product: " + product);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
