/**
 * Link: https://practice.geeksforgeeks.org/problems/squares-in-a-matrix5716/1
 * Date: 22nd Nov 2021
 * Code #2
*/

import java.util.*;

class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int m = kb.nextInt();
            int n = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.squaresInMatrix(m, n));
        }
    }
}

class Solution {
    static long squaresInMatrix(int m, int n) {
        long ans = 0;
        
        while (m > 0 && n > 0) {
            ans += m*n;
            m--;
            n--;
        }
        return ans;
    }
};