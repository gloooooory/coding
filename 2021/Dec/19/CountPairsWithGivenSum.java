/**
 * Link: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1#
 * Date: 19 Dec 2021
 * Code #2
*/

import java.util.*;

class CountPairsWithGivenSum {
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
            int count = s.getPairsCount(arr, n, k);

            System.out.println(count);
        }
        kb.close();
    }
}

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i : arr) {
            if (map.containsKey(k - i)) {
                count += map.get(k - i);
            }
            
            if (k - i == i) {
                count--;
            }
        }
        
        count /= 2;
        
        return count;
    }
}
