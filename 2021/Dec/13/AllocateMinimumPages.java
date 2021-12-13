/**
 * Link: https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1#
 * Date: 13 Dec 2021
 * Code #2
*/

import java.util.*;

class AllocateMinimumPages {
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
            System.out.println(Solution.findPages(arr, n, k));
        }
        kb.close();
    }
}

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m)
    {
        int sum = 0;
        if (m == 1) {
            for (int i : a) sum += i;
            return sum;
        } else if (m > n) {
            return -1;
        } else if (m == n) {
            //return min
            sum = Integer.MIN_VALUE;
            for (int i : a) sum = Math.max(sum, i);
            return sum;
        }
        
        int max = Integer.MIN_VALUE;
        int mid = 0, index = 0;
        
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
            sum += a[i];
        }
        
        int start = max, end = sum;
        int ans = -1;
        
        while(start <= end) {
            mid = start + (end - start) / 2;
            
            if (isValid(a, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    
    public static boolean isValid(int[] a, int n, int m, int mid) {
        int student = 1;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > mid) {
                student++;
                sum = a[i];
            }
            
            if (student > m) {
                return false;
            }
        }
        return true;
    }
}
