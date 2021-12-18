/**
 * Link: https://practice.geeksforgeeks.org/problems/key-pair5616/1
 * Date: 18 Dec 2021
 * Code #5
*/

import java.util.*;

class KeyPair {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int x = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            boolean res = s.hasArrayTwoCandidates(arr, n, x);

            System.out.println((res ? "Yes" : "No"));
        }

        kb.close();
    }
}

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        boolean result = false;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i : arr) {
            int diff = x - i;
            
            if (diff == i) {
                if (map.get(i) > 1) return true;
            } else {
                if (map.containsKey(diff)) {
                    return true;
                }
            }
        }
        
        return result;
    }
}
