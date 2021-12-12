/**
 * Link: https://practice.geeksforgeeks.org/problems/missing-element-of-ap2228/1
 * Date: 12 Dec 2021
 * Code #2
*/

import java.util.*;

class MissingElementOfAP {
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
            System.out.println(s.findMissing(arr, n));
        }
        kb.close();
    }
}

class Solution {
    int findMissing(int[] arr, int n) {
        
        if (n == 2) {
            return (arr[0] + arr[1]) / 2;
        }
        
        int d1 = arr[1] - arr[0];
        int d2 = arr[n-1] - arr[n-2];
        
        int d = d1 < 0 ? Math.max(d1, d2) : Math.min(d1, d2);
        
        for (int i = 1; i < n; i++) {
            int next = arr[i-1] + d;
            if (next != arr[i]) {
                return next;
            }
        }
        
        return -1;
    }
}
