/**
 * Link: https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1
 * Date: 24th Nov 2021
 * Code #5
*/

import java.util.*;

class MinimumDistanceBetweenElements {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int x = kb.nextInt();
            int y = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.minDist(arr, n, x, y));
        }
    }
}

class Solution {
    int minDist(int a[], int n, int x, int y) {
        if (x == y) return 0;
        
        int ans = Integer.MAX_VALUE;
        
        int xIdx = -1, yIdx = -1;
        
        for (int i = 0; i < n; i++) {
           if (a[i] == x) {
               xIdx = i;
           }
           
           if (a[i] == y) {
               yIdx = i;
           }
           
           if (xIdx != -1 && yIdx != -1) {
               ans = Math.min(Math.abs(yIdx - xIdx), ans);
           }
        }
        
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}