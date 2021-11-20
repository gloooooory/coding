/**
 * Link: https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1
 * Date: 20th Nov 2021
 * Code #5
*/

import java.util.*;

class OverlappingRectangles {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int[] p = new int[2];
            int[] q = new int[2];
            int[] r = new int[2];
            int[] s = new int[2];

            p[0] = kb.nextInt();
            p[1] = kb.nextInt();
            q[0] = kb.nextInt();
            q[1] = kb.nextInt();
            r[0] = kb.nextInt();
            r[1] = kb.nextInt();
            s[0] = kb.nextInt();
            s[1] = kb.nextInt();
            Solution solution = new Solution();
            System.out.println(solution.doOverlap(p, q, r, s));
        }
    }
}

class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        
        if (L1[0] > R2[0] || R1[0] < L2[0]) return 0;
        if (R2[1] > L1[1] || R1[1] > L2[1]) return 0;
        
        return 1;
    }
};