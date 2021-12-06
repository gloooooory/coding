/**
 * Link: https://practice.geeksforgeeks.org/problems/nth-even-fibonacci-number1119/1#
 * Date: 21st Nov 2021
 * Code #5
*/

import java.util.*;
import java.math.BigInteger;

class NthFibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.nthEvenFibonacci(n));
        }
    }

}
class Solution {
    static long nthEvenFibonacci(long n){
        long m = 1000000007;

        BigInteger mod = new BigInteger("1000000007");
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");
        
        while (n > 0) {
            c = a.add(b);
            a = b;
            b = c;
            
            if (c.mod(new BigInteger("2")).compareTo(new BigInteger("0")) == 0) {
                n--;
            }
        }

        BigInteger res = c.mod(mod);

        long ans = Long.parseLong(res.toString());
        
        return ans;
    }
}
