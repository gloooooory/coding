/**
 * Link: https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1
 * Date: 17 Dec 2021
 * Code #5
*/

import java.util.*;

class FirstElementToOccurKTimes {
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
            int res = s.firstElementKTime(arr, n, k);

            System.out.println(res);
        }
        kb.close();
    }
}

class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            
            if (map.get(i) == k) {
                return i;
            }
        }
        
        return -1;
    } 
}
