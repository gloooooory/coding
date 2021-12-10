/**
 * Link: https://practice.geeksforgeeks.org/problems/searching-a-number0324/1
 * Date: 10 Dec 2021
 * Code #4
*/

import java.util.*;

class SearchingANumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.search(arr, n, k));
        }
    }
}

class Solution {
    public int search(int arr[], int n, int k) {
        int index = -1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                index = i+1;
                break;
            }
        }
        
        return index;
    }
}