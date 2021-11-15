/**
 * Link: https://practice.geeksforgeeks.org/problems/series-ap5310/1
 * Date: 15th Nov 2021
 * Code #3
 */

 import java.util.*;

class SeriesAP {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        while (t-- > 0) {
            int a1 = kb.nextInt();
            int a2 = kb.nextInt();
            int n = kb.nextInt();
            Solution s = new Solution();
            int result = s.nthTermOfAP(a1, a2, n);
            System.out.println(result);
        }
    }
}

class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // An = A1 + (N - 1) * (A2 - A1)
        
        int an = A1 + (N - 1) * (A2 - A1);
        return an;
    }
}