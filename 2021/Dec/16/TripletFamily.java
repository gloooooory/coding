/**
 * Link: https://practice.geeksforgeeks.org/problems/triplet-family/1#
 * Date: 16 Dec 2021
 * Code #3
*/

import java.util.*;

class TripletFamily {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            ArrayList<Integer> list = Solution.findTriplet(arr, n);

            int res = -1;

            if (list.size() == 3) {
                int a = list.get(0);
                int b = list.get(1);
                int c = list.get(2);

                if (a+b == c || a+c == b || b+c == a) {
                    res = 1;
                }
            }

            System.out.println(res);
        }
        kb.close();
    }
}

class Solution {
    public static ArrayList<Integer> findTriplet(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (map.containsKey(arr[i] + arr[j])) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[i] + arr[j]);
                    return list;
                }
            }
        }
        
        return list;
    }
}
