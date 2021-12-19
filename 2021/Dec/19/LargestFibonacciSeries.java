/**
 * Link: https://practice.geeksforgeeks.org/problems/largest-fibonacci-subsequence2206/1
 * Date: 19 Dec 2021
 * Code #5
*/

import java.util.*;

class LargestFibonacciSeries {
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
            int[] result = s.findFibSubset(arr, n);

            StringBuilder sb = new StringBuilder();

            for (int i : result) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {
    
    public int[] findFibSubset(int arr[], int n)
    {
        Set<Integer> set = new HashSet<>();
        
        int a = 0;
        int b = 1;
        int max = (int)(1e9);
        
        set.add(a);
        set.add(b);
        
        while (b < max) {
            int c = a+b;
            a = b;
            b = c;
            set.add(c);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if (set.contains(i)) {
                list.add(i);
            }
        }
        
        int[] result = new int[list.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
