/**
 * Link: https://practice.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1#
 * Date: 25th Nov 2021
 * Code #1
*/

import java.util.*;

class SortedSubsequenceOfSizeThree {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(kb.nextInt());
            }
            Solution s = new Solution();
            ArrayList<Integer> result = s.find3Numbers(list, n);

            int out = 0;
            if (result.isEmpty() || !result.isEmpty() && result.size() != 3) {
                out = 0;
            }

            if (result.get(0) < result.get(1) && result.get(1) < result.get(2) && isSubsequence(list, result, n, result.size())) {
                out = 1;
            }

            System.out.println(out);
        }
    }

    public static boolean isSubsequence(ArrayList<Integer> v1, ArrayList<Integer> v2, int n, int m) {
        if (m == 0) return true;
        if (n == 0) return false;

        if (v1.get(n-1).equals(v2.get(m-1))) {
            return isSubsequence(v1, v2, n-1, m-1);
        }

        return isSubsequence(v1, v2, n-1, m);
    }
}

class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        if (n < 3) return result;
        
        int[] min = new int[n];
        int[] max = new int[n];
        
        // arr: 1 2 1 1 3
        // min: 1 1 1 1 1
        // max: 3 3 3 3 3
        
        min[0] = arr.get(0);
        
        for (int i = 1; i < n; i++) {
            min[i] = Math.min(min[i-1], arr.get(i));
        }
        
        max[n-1] = arr.get(n-1);
        
        for (int i = n-2; i > 0; i--) {
            max[i] = Math.max(max[i+1], arr.get(i));
        }
        
        for (int i = 0; i < n; i++) {
            int e = arr.get(i);
            if (min[i] < e && e < max[i]) {
                result.add(min[i]);
                result.add(e);
                result.add(max[i]);
                break;
            }
        }
        
        return result;
    }
}
