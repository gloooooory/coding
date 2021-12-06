/**
 * Link: https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1#
 * Date: 24th Nov 2021
 * Code #2
*/

import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            int ans = s.remove_duplicate(arr, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ans; i++) {
                sb.append(arr[i] + " ");
            }

            System.out.println(sb.toString());
        }
    }
}

class Solution {
    int remove_duplicate(int A[],int N){
        int count = 1;
        int i = 0, j = 1;
        
        while (j < N) {
            if (A[i] != A[j]) {
                count++;
                A[i+1] = A[j];
                i++;
            }
            j++;
        }
        
        return count;
    }
}