/**
 * Link: https://practice.geeksforgeeks.org/problems/npr4253/1#
 * Date: 18th Nov 2021
 * Code #2
 * 
 * ===================
 * Approach
 * ===================
 * 
 * Brute Force
 * ===================
 * nPr = (n!) / (n - r)!
 * 
 * Optimized
 * ===================
 * nPr  = n! if (n == r) || (n - r) == 1
 *      = n if (r == 1)
 *      = n * (n - 1) * ... (n - r + 1) if n > r
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/

import java.util.*;

class NPR {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            long r = kb.nextLong();
            System.out.println(Solution.nPr(n, r));
        }
    }
}

class Solution{
    static long nPr(long n, long r){
        if (n == r || (n - r) == 1) return factorial(n);
        
        if (r == 1) return n;
        
        long res = 1;
        
        for (long i = n; i > (n - r); i--) {
            res *= i;
        }
        
        return res;
    }
    
    static long factorial(long n) {
        if (n == 0) return 1;
        
        long res = 1;
        
        while (n > 0) {
            res *= n;
            n--;
        }
        
        return res;
    }
}
