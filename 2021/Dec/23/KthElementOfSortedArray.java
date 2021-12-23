/**
 * Link: https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1#
 * Date: 23 Dec 2021
 * Code #5
*/

import java.util.*;

class KthElementOfSortedArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            int k = kb.nextInt();

            int[] arr = new int[n];
            int[] brr = new int[m];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            for (int i = 0; i < m; i++) {
                brr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.kthElement(arr, brr, n, m, k));
        }
        kb.close();
    }
}

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int res = -1;
        
        int i = 0, j = 0;
        
        while (k > 0 && i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                res = arr1[i];
                i++;
            } else {
                res = arr2[j];
                j++;
            }
            
            k--;
        }
        
        while (k > 0 && i < n) {
            res = arr1[i];
            k--;
            i++;
        }
        
        while (k > 0 && j < m) {
            res = arr2[j];
            k--;
            j++;
        }
        
        return res;
    }
}
