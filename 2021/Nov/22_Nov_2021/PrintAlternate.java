/**
 * Link: https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1#
 * Date: 22nd Nov 2021
 * Code #5
*/

import java.util.*;

class PrintAlternate {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution.print(arr, n);
        }
    }
}

class Solution
{
    public static void print(int arr[], int n)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i+=2) {
            sb.append(arr[i] + " ");
        }
        System.out.print(sb.toString());
    }
}