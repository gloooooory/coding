/**
 * Link: https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
 * Date: 15 Dec 2021
 * Code #5
*/

import java.util.*;

class TripletSumInArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int x = kb.nextInt();
            Solution s = new Solution();
            boolean res = s.find3Numbers(arr, n, x);
            System.out.println((res ? "1" : "0"));
        }
        kb.close();
    }
}

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        
        for (int i = 0; i < n; i++) {
            int l = i+1;
            int h = n-1;
            
            while (l < h) {
                int sum = A[i] + A[l] + A[h];
                
                if (sum == X) {
                    return true;
                } else if (sum < X) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        
        return false;
    }
}
