/**
 * Link: https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1#
 * Date: 24th Nov, 2021
 * Code #1
*/

import java.util.*;

class CountOfSmallerNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            long[] arr = new long[(int)n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextLong();
            }

            long x = kb.nextLong();

            Solution s = new Solution();
            System.out.println(s.countOfElements(arr, n, x));
        }
    }
}

class Solution {
    
    public long countOfElements(long arr[], long n, long x)
    {
        return binarySearch(arr, n, x);
    }
    
    public int binarySearch(long[] arr, long n, long x) {
	    int left = 0, right = (int)n-1;
	    
	    int count = 0;
	    
	    while(left <= right) {
	        int mid = (left + right) / 2;
	        if(arr[mid] <= x) {
	            count = mid + 1;
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    
	    return count;
	}
}