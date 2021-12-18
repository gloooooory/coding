/**
 * Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1
 * Date: 18 Dec 2021
 * Code #2
*/

import java.util.*;

class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            int ans = s.firstNonRepeating(arr, n);

            System.out.println(ans);
        }
        kb.close();
    }
}

class Solution {
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        int ans = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i : arr) {
            if (map.get(i) == 1) {
                ans = i;
                break;
            }
        }
        
        return ans;
    }  
    
}
