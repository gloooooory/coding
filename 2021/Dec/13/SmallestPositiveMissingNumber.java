/**
 * Link: https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
 * Date: 13 Dec 2021
 * Code #4
*/

import java.util.*;

class SmallestPossibleMissingNumber {
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
    }
}

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        Map<Integer, Boolean> map = new HashMap<>();
        
        for (int i : arr) {
            if (i > 0) {
                map.put(i, true);
            }
        }
        
        for (int i = 1; i <= (int)(1e6); i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        
        return -1;
    }
}