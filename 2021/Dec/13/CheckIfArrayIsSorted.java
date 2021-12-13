/**
 * Link: https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
 * Date: 13 Dec 2021
 * Code #5
*/

import java.util.*;

class CheckIfArrayIsSorted {
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
            System.out.println(s.arraySortedOrNot(arr, n) ? 1 : 0);
        }
        kb.close();
    }
}

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        if (n <= 1) return true;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i-1] < 0) return false;
        }
        return true;
    }
}