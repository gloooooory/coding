/**
 * Link: https://practice.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1#
 * Date: 19 Dec 2021
 * Code #1
*/

import java.util.*;

class CountDistinctPairs {
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
            System.out.println(s.totalPairs(arr, k));
        }
        kb.close();
    }
}

class Solution
{
    public int totalPairs(int[] nums, int k)
    {
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        Set<String> set = new HashSet<>();
        
        for (int i : nums) {
            if (k != 0) {
                if (map.containsKey(i) && map.containsKey(i+k)) {
                    set.add(i + ", " + i+k);
                }
            } else if (map.containsKey(i)) {
                if (map.get(i) >= 2) {
                    set.add(i + ", " + i);
                }
            }
        }
        
        count = set.size();
        
        return count;
    }
}
