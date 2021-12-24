/**
 * Link: https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/1
 * Date: 24 Dec 2021
 * Code #2
*/

import java.util.*;

class ThePaintersPartition {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.minTime(arr, n, k));
        }
        kb.close();
    }
}

class Solution{
    static long minTime(int[] arr,int n,int k){
        if (n == 0) return 0;
        if (k == 0) return Long.MIN_VALUE;
        
        long minUnitsToPaint = arr[0];
        long maxUnitsToPaint = 0;
        
        for (int i : arr) {
            minUnitsToPaint = Math.max(minUnitsToPaint, i);
            maxUnitsToPaint += i;
        }
        
        long l = minUnitsToPaint;
        long h = maxUnitsToPaint;
        
        long ans = 0;
        
        while (l <= h) {
            long mid = l + (h - l)/2;
            
            if (isValid(n, arr, k, mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return ans;
    }
    
    static boolean isValid(int n, int[] arr, long requiredPainter, long workToBeDone) {
        long totalPaintersAcquired = 1;
        long workPerPainter = 0;
        
        
        for (int i : arr) {
            workPerPainter += i;
            
            if (totalPaintersAcquired > requiredPainter) {
                return false;
            }
            
            if (workPerPainter > workToBeDone) {
                totalPaintersAcquired++;
                workPerPainter = i;
            }
        }
        
        if (totalPaintersAcquired > requiredPainter) {
            return false;
        }
        return true;
    }
}
