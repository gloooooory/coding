/**
 * Link: https://practice.geeksforgeeks.org/problems/merge-sort/1
 * Date: 15 Dec 2021
 * Code #2
*/

import java.util.*;

class MergeSort {
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
            s.mergeSort(arr, 0, n-1);

            StringBuilder sb = new StringBuilder();

            for (int i : arr) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int n1 = m - l + 1;
         int n2 = r - m;
         
         int[] a = new int[n1];
         int[] b = new int[n2];
         
         for (int i = 0; i < n1; i++) {
             a[i] = arr[i+l];
         }
         
         for (int i = 0; i < n2; i++) {
             b[i] = arr[i+m+1];
         }
         
         int i = 0, j = 0, k = l;
         
         while (i < n1 && j < n2) {
             if (a[i] <= b[j]) {
                 arr[k] = a[i];
                 i++;
             } else {
                 arr[k] = b[j];
                 j++;
             }
             k++;
         }
         
         while (i < n1) {
             arr[k] = a[i];
             i++;
             k++;
         }
         
         while (j < n2) {
             arr[k] = b[j];
             k++;
             j++;
         }
    }
    
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            int mid = l + (r - l)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            
            merge(arr, l, mid, r);
        }
    }
}
