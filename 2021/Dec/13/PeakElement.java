/**
 * Link: https://practice.geeksforgeeks.org/problems/peak-element/1
 * Date: 13 Dec 2021
 * Code #1
*/

import java.util.*;

class PeakElement {
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
            System.out.println(s.peakElement(arr, n));
        }
        kb.close();
    }
}

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int ans = -1;
       if (n == 1) {
           return 0;
       }
       
       for (int i = 0; i < n; i++) {
           if (i == 0) {
               if (i+1 < n) {
                   if (arr[i] >= arr[i+1]) {
                       return i;
                   }
               }
           } else if (i == n-1) {
               if (arr[i] >= arr[i-1]) {
                   return i;
               }
           } else {
               if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                   return i;
               }
           }
       }
       
       return ans;
    }
}