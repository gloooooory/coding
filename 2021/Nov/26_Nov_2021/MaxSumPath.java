/**
 * Link: https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1#
 * Date: 26th Nov 2021
 * Code #1
*/

import java.util.*;

class MaxSumPath {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int m = kb.nextInt();
            int n = kb.nextInt();
            int[] arr = new int[m];
            int[] brr = new int[n];

            for (int i = 0; i < m; i++) {
                arr[i] = kb.nextInt();
            }

            for (int j = 0; j < n; j++) {
                brr[j] = kb.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.maxPathSum(arr, brr));
        }
    }
}

class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        int m = ar1.length, n = ar2.length;
        
        int sum1 = 0, sum2 = 0;
        
        int i = 0, j = 0;
        int ans = 0;
        
        while (i < m && j < n) {
            if (ar1[i] < ar2[j]) {
                sum1 += ar1[i];
                i++;
            } else if (ar1[i] > ar2[j]) {
                sum2 += ar2[j];
                j++;
            } else {
                ans += Math.max(sum1, sum2) + ar1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        
        while (i < m) {
            sum1 += ar1[i];
            i++;
        }
        
        while (j < n) {
            sum2 += ar2[j];
            j++;
        }
        
        ans += Math.max(sum1, sum2);
        
        return ans;
    }
}