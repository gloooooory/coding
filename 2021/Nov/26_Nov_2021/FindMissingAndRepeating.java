/**
 * Link: https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1#
 * Date: 26th Nov 2021
 * Code #4
*/

import java.util.*;

class FindMissingAndRepeating {
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
            int[] result = s.findTwoElement(arr, n);

            System.out.println(result[0] + " " + result[1]);
        }
        kb.close();
    }
}

class Solution {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
        
        for (int i = 0; i < n; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] *= -1;
            } else {
                result[0] = Math.abs(arr[i]);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i+1;
            }
        }
        
        return result;
    }
}