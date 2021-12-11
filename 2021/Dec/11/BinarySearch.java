/**
 * Link: https://practice.geeksforgeeks.org/problems/binary-search/1
 * Date: 11 Dec 2021
 * Code #1
*/

import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int k = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.binarySearch(arr, n, k));
        }
        kb.close();
    }
}

class Solution {
    int binarySearch(int arr[], int n, int k){
        int left = 0;
        int right = n-1;
        
        if (k < arr[left] || k > arr[right]) return -1; 
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[left] == k) {
                return left;
            }
            
            if (arr[right] == k) {
                return right;
            }
            
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                left = mid;
                continue;
            } else {
                right = mid - 1;
                continue;
            }
        }
        
        return -1;
    }
}