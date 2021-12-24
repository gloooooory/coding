/**
 * Link: https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
 * Date: 24 Dec 2021
 * Code #3
*/

import java.util.*;

class CountInversions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextLong();
            }
            System.out.println(Solution.inversionCount(arr, n));
        }
        kb.close();
    }
}

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0, (int)(N-1));
    }
    
    static long mergeSort(long[] arr, int low, int high) {
        long res = 0;
        
        if (low < high) {
            int mid = low + (high - low) / 2;
            
            res += mergeSort(arr, low, mid);
            res += mergeSort(arr, mid+1, high);
            res += merge(arr, low, mid, high);
        }
        
        return res;
    }
    
    static long merge(long[] arr, int low, int mid, int high) {
        long res = 0;
        
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        long[] left = new long[n1];
        long[] right = new long[n2];
        
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + i + 1];
        }
        
        int i = 0, j = 0, k = low;
        
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
                res += (n1 - i);
            }
        }
        
        while (i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        
        while (j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }
        
        return res;
    }    
}
