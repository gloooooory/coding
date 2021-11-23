/**
 * Link: https://practice.geeksforgeeks.org/problems/second-largest3735/1#
 * Date: 23rd Nov 2021
 * Code #2
*/

import java.util.*;

class SecondLargest {
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
            System.out.println(s.printSecondLargest(arr, n));
        }
    }
}

class Solution {
    int printSecondLargest(int arr[], int n) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        
        for(int i : arr) {
            if (i >= max) {
                if (i != max) {
                    secondMax = max;
                }
                max = i;
            } else if (i > secondMax) {
                secondMax = i;
            }
        }
        
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }
}