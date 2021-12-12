/**
 * Link: https://practice.geeksforgeeks.org/problems/missing-number4257/1
 * Date: 12 Dec 2021
 * Code #1
*/

import java.util.*;

class MissingNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            System.out.println(Solution.missingNumber(arr, n));
        }
        kb.close();
    }
}

class Solution {
    
    public static int missingNumber(int A[], int N)
    {
         int sum = 0;
         
         for (int i : A) {
             sum += i;
         }
         
         int sumN = N * (N + 1) / 2;
         
         return sumN - sum;
    }
}