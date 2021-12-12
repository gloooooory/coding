/**
 * Link: https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
 * Date: 11 Dec 2021
 * Code #3
*/

import java.util.*;

class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int key = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.search(arr, 0, n-1, key));
        }
        kb.close();
    }
}

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        if (A.length == 1) {
            return A[0] == key ? 0 : -1;
        }
        
        while (l <= h) {
            int mid = l + (h - l) / 2;
            
            if (A[mid] == key) {
                return mid;
            }
            
            if (A[l] < A[mid]) {
                if (key >= A[l] && key < A[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (key >= A[mid] && key <= A[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}