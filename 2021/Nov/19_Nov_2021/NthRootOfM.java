/**
 * Link: https://practice.geeksforgeeks.org/problems/find-nth-root-of-m5843/1#
 * Date: 19th Nov 2021
 * Code #2
*/

import java.util.*;

class NthRootOfM {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.NthRoot(n, m));
        }
    }
}

class Solution
{
    public int NthRoot(int n, int m)
    {
        for (int i = 1; (int)Math.pow(i, n) <= m; i++) {
            if ((int)Math.pow(i, n) == m) return i;
        }
        return -1;
    }
}