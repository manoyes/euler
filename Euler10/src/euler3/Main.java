
package euler3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val = 2000000;
        System.out.println("Prime sum: " + getPrimesSumUpTo(val));
    }


    public static long getPrimesSumUpTo(int val) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        LinkedList<Integer> candidates = new LinkedList<Integer>();
        
        int cand;
        int cand_root;
        long sum = 2 + 3;

        primes.add(2);
        primes.add(3);

        for (int i = 1; 6 * i - 1 <= val; i++) {
            candidates.add(6 * i - 1);
            candidates.add(6 * i + 1);
        }

        while (!candidates.isEmpty()) {
            
            cand = candidates.removeFirst();
            cand_root = (int)Math.sqrt(cand) + 1;

            boolean isPrime = true;
            
            for (Integer p : primes) {
                if (cand % p == 0) {
                    isPrime = false;
                    break;
                } else if (p > cand_root) {
                    break;
                }
            }

            if (isPrime) {
                primes.add(cand);
                sum += cand;
            }
        }
        
        return sum;
    }
}
