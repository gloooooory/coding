/**
 * Link: https://practice.geeksforgeeks.org/problems/facing-the-sun2126/1#
 * Date: 10 Dec 2021
 * Code #5
*/

import java.util.*;

class FacingTheSun {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.countBuildings(arr, n));
        }
        kb.close();
    }
}

class Solution {
    int countBuildings(int h[], int n) {
        int count = 1;
        
        int first = h[0];
        
        for (int i = 1; i < n; i++) {
            if (h[i] > first) {
                first = h[i];
                count++;
            }
        }
        
        return count;
    }
}