/**
 * Link: https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1
 * Date: 27th Nov 2021
 * Code #2
*/

import java.util.*;

class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int k = kb.nextInt();
            Solution s = new Solution();
            int count = s.countPair(arr, n, k);
            System.out.println(count);
        }
    }
}

class Solution{
    int countPair(int a[], int n, int sum)
    {
        int i = 0, j = n-1;
        
        if (a[i] + a[j] < sum) return -1;
        
        int count = 0;
        
        while (i < j) {
            if (a[i] + a[j] == sum) {
                count++;
                i++;
                j--;
            } else if (a[i] + a[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        
        return (count == 0) ? -1 : count;
    }
}