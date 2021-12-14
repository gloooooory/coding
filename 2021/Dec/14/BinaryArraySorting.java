/**
 * Link: https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
 * Date: 14 Dec 2021
 * Code #1
*/

import java.util.*;

class BinaryArraySorting {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution.binSort(arr, n);

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
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        int count = 0;
        for (int i : A) {
            if (i == 1) {
                count++;
            }
        }
        int i = N - 1;
        while (count > 0) {
            A[i] = 1;
            count--;
            i--;
        }
        
        while (i >= 0) {
            A[i] = 0;
            i--;
        }
    }
}
