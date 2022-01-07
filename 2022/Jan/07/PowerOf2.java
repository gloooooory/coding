/**
 * Link: https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1
 * Date: 07 Jan 2022
 * Code #2
*/

import java.util.*;

class PowerOf2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            Solution s = new Solution();
            boolean result = s.isPowerOfTwo(n);

            System.out.println((result) ? "YES" : "NO");
        }
        kb.close();
    }
}

class Solution {
    public boolean isPowerOfTwo(long n) {
        if (n == 0) return false;
        
        return (n & (n-1)) == 0;
    }
}