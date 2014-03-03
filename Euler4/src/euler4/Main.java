/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler4;

/**
 *
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Largest Palindrome: " + getLargestPalindromeProduct(999, 999));
    }

    public static int getLargestPalindromeProduct(int i, int j) {
        char[] s = Integer.toString(i * j).toCharArray();
        if (isPalindrome(s, 0, s.length - 1)) return i * j;
        return Math.max(getLargestPalindromeProduct(i-1, j), getLargestPalindromeProduct(i, j-1));

    }

    public static boolean isPalindrome(char[] cand, int s, int e) {
        if (s >= e || cand.length < 2) return true;
        
        if (cand[s] == cand[e]) {
            return isPalindrome(cand, s + 1, e - 1);
        } else {
            return false;
        }
    }
}
