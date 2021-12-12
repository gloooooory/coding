/**
 * Link: https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1#
 * Date: 11 Dec 2021
 * Code #5
*/

import java.util.*;

class FloorInSortedArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int x = kb.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            System.out.println(Solution.findFloor(arr, n, x));
        }
        kb.close();
    }
}

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        if (arr[0] > x) return -1;
        if (arr[n-1] < x) return n-1;
        
        int index = Arrays.binarySearch(arr, x);
        
        if (index < 0) {
            index = ~index;
        }
        
        while (arr[index] < x) {
            index++;
        }
        
        while (arr[index] > x) {
            index--;
        }
        
        return index;
    }
    
}
