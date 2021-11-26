/**
 * Link: https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1#
 * Date: 26th Nov 2021
 * Code #2
*/

import java.util.*;

class ProductArrayPuzzle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            long[] result = Solution.productExceptSelf(arr, n);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < result.length; i++) {
                sb.append(result[i] + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        if (n == 1) return new long[]{1};
	    
        long pr = 1;
        long[] p = new long[n];
        
        int zero = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                pr *= nums[i];
            } else {
                zero++;
            }
        }
        
        if (zero > 1) return p;
        else if (zero == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    p[i] = pr;
                }
            }
            return p;
        } 
        
        for (int i = 0; i < n; i++) {
            p[i] = pr / nums[i];
        }
        
        return p;
	} 
} 
