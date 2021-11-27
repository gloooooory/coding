/**
 * Link: https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
 * Date: 27th Nov 2021
 * Code #1
*/

import java.util.*;

class TrappingRainWater {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            long result = Solution.trappingWater(arr, n);
            System.out.println(result);
        }
        kb.close();
    }
}

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // waterTrapper = min(leftMax, rightMax) - cH;
        
        long waterTrapped = 0;
        
        // 3 0 0 2 0 4
        // 3 3 3 3 3 4
        // 4 4 4 4 4 4
        // min(3,4) - 3 = 3 - 3 = 0
        // min(3,4) - 0 = 3 - 0 = 3
        // min(3,4) - 0 = 3 - 0 = 3
        // min(3,4) - 2 = 3 - 2 = 1
        // min(3,4) - 0 = 3 - 0 = 3
        // min(4,4) - 4 = 4 - 4 = 0
        // 10
        
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        
        rightMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        
        for (int i = 0; i < n; i++) {
            waterTrapped += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }
        
        return waterTrapped;
    } 
}


