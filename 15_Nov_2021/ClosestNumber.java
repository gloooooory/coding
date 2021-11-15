/**
 * Link: https://practice.geeksforgeeks.org/problems/closest-number5728/1
 * Date: 15th Nov 2021
 * Code #5
 */

import java.util.*;

class ClosestNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.closestNumber(n, m));
        }
    }
}

class Solution {
    static int closestNumber(int N , int M) {
        int q = N / M;
        
        int n1 = M * q;
        
        int n2 = 0;
        
        if (N * M > 0) {
            n2 = M * (q+1);
        } else {
            n2 = M * (q-1);
        }
        
        if (Math.abs(n1 - N) < Math.abs(n2 - N)) {
            return n1;
        }
        return n2;
    }
};