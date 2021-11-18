/**
 * Link: https://practice.geeksforgeeks.org/problems/largest-prime-factor2601/1#
 * Date: 18th Nov 2021
 * Code #4
*/

import java.util.*;

class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.largestPrimeFactor(n));
        }
    }
}

class Solution{
    static long largestPrimeFactor(int N) {
        int res = 1;
        
        for (int i = 2; i*i <= N; i++) {
            while ((N % i) == 0) {
                res = Math.max(res, i);
                N /= i;
            }
        }
        
        res = Math.max(res, N);
        return res;
    }
}