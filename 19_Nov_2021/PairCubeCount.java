/**
 * Link: https://practice.geeksforgeeks.org/problems/pair-cube-count4132/1#
 * Date: 19th Nov 2021
 * Code #1
*/

import java.util.*;

class PairCubeCount {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.pairCubeCount(n));
        }
    }
}

class Solution {
    static int pairCubeCount(int N) {
        int count = 0;
        
        // Brute Force Solution
        
        // for (int i = 1; i*i*i <= N; i++) {
        //     int a3 = i*i*i;
        //     for (int j = 0; a3 + j*j*j <= N; j++) {
        //         int b3 = j*j*j;
        //         if (a3 + b3 == N) {
        //             count++;
        //         }
        //     }
        // }
        
        // Optimized
        
        for (int i = 1; i <= (int)Math.cbrt(N); i++) {
            int a3 = i*i*i;
            
            int diff = N - a3;
            int b = (int)Math.cbrt(diff);
            
            if (a3 + b*b*b == N) count++;
        }
        
        return count;
    }
};