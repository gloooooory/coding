/**
 * Link: https://practice.geeksforgeeks.org/problems/ncr1019/1#
 * Date: 18th Nov 2021
 * Code #3
 * 
 * ===================
 * Approach
 * ===================
 * 
 * Brute Force
 * ===================
 * nCr = n!/(r! * (n-r)!)
 * 
 * Efficient Approach
 * ===================
 * Pascal's triangle
 * 
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 
 * dp[j] = dp[j] + dp[j-1]
*/

import java.util.*;

class nCr {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int r = kb.nextInt();
            System.out.println(Solution.nCr(n, r));
        }
    }
}

class Solution{
    static int nCr(int n, int r)
    {
        int mod = (int)(1e9 + 7);
        
        if (r > n) return 0;
        
        r = Math.min(r, n-r);
        
        int[] dp = new int[r+1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--) {
                dp[j] = ((dp[j] % mod) + (dp[j-1] % mod)) % mod;
            }
        }
        
        return dp[r] % mod;
    }
}