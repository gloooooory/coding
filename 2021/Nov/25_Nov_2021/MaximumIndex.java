/**
 * Link: https://practice.geeksforgeeks.org/problems/maximum-index-1587115620/1#
 * Date: 25th Nov 2021
 * Code #5
*/

import java.util.*;

class MaximumIndex {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            System.out.println(Solution.maxIndexDiff(arr, n));
        }
        kb.close();
    }
}

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        // 0 1  2  3 4 5  6  7  8
        // 34 8 10 3 2 80 30 33 1
        // 34 8 8  3 2 2  2  2  1
        // 80 80 80 80 80 33 33 1
        
        // Create min array, max array
        // while min element < max element
        // j++
        // store result in diff
        
        if (N == 1) return 0;
        if (N == 2) return (A[0] < A[1] ? 1 : 0);
        
        int[] min = new int[N];
        int[] max = new int[N];
        
        min[0] = A[0];
        for (int i = 1; i < N; i++) {
            min[i] = Math.min(min[i-1], A[i]);
        }
        
        max[N-1] = A[N-1];
        for (int i = N-2; i >= 0; i--) {
            max[i] = Math.max(max[i+1], A[i]);
        }
        
        int i = 0, j = 0;
        int res = 0;
        
        while (i < N && j < N) {
            if (min[i] <= max[j]) {
                res = Math.max(j - i, res);
                j++;
            } else {
                i++;
            }
        }
        
        return res;
        
    }
}
