/**
 * Link: https://practice.geeksforgeeks.org/problems/find-transition-point/1
 * Date: 12 Dec 2021
 * Code #4
*/

import java.util.*;

class FindTransitionPoint {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt(0);
            }
            Solution s = new Solution();
            System.out.println(s.transitionPoint(arr, n));
        }
        kb.close();
    }
}

class Solution {
    int transitionPoint(int arr[], int n) {
        int l = 0, h = n-1;
        
        if (arr[h] == 0) {
            return -1;
        }
        
        if (arr[l] == 1) {
            return l;
        }
        
        int mid = l + (h - l) / 2;
        
        while (arr[mid] == 0) {
            if (arr[mid] == 0) {
                l = mid+1;
            } else {
                h = mid;
            }
            
            mid = l + (h - l) / 2;
        }
        
        while (mid > 0 && arr[mid] == 1) {
            if (mid > 0 && arr[mid - 1] == 1) {
                mid--;
            } else {
                break;
            }
        }
        
        return mid;
    }
}