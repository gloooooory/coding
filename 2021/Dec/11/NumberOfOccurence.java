/**
 * Link: https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * Date: 11 Dec 2021
 * Code #2
*/

import java.util.*;

class NumberOfOccurence {
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
            System.out.println(s.count(arr, n, x));
        }
        kb.close();
    }
}

class Solution {
    int count(int[] arr, int n, int x) {
        if (n == 1) {
            return (arr[0] == x) ? 1 : 0;
        }
        
        int c = 0;
        
        if (arr[0] == x && arr[n-1] == x) {
            return n;
        }
        
        if (x < arr[0] || x > arr[n-1]) {
            return 0;
        }
        
        int index = Arrays.binarySearch(arr, x);
        
        if (index < 0) {
            return 0;
        } else {
            int left = index, right = index + 1;
            
            while(left >= 0 && arr[left] == x) {
                c++;
                left--;
            }
            
            while(right < n && arr[right] == x) {
                c++;
                right++;
            }
        }
        return c;
    }
}