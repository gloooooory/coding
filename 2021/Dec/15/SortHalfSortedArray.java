/**
 * Link: https://practice.geeksforgeeks.org/problems/sort-the-half-sorted2157/1#
 * Date: 15 Dec 2021
 * Code #3
*/

import java.util.*;

class SortHalfSortedArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution.sortHalves(arr, n);

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
    public static void sortHalves (int arr[], int n)
    {
        int index = 0;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) {
                index = i;
                break;
            }
        }
        
        int[] a = new int[index];
        int[] b = new int[n - index];
        
        for (int i = 0; i < index; i++) {
            a[i] = arr[i];
        }
        
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i+index];
        }
        
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        
        while (i < a.length) {
            arr[k] = a[i];
            k++;
            i++;
        }
        
        while (j < b.length) {
            arr[k] = b[j];
            k++;
            j++;
        }
        
    }
}