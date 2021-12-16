/**
 * Link: https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
 * Date: 16 Dec 2021
 * Code #4
*/

import java.util.*;

class CountTheTriplets {
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
            int count = s.countTriplet(arr, n);

            System.out.println(count);
        }
        kb.close();
    }
}

class Solution {
    int countTriplet(int arr[], int n) {
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (map.containsKey(arr[i] + arr[j])) {
                    count++;
                }
            }
        }
        
        return count;
    }
}