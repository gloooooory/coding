/**
 * Link: https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1
 * Date: 17 Dec 2021
 * Code #4
*/

import java.util.*;

class CheckTwoArrays {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = kb.nextLong();
            }

            long[] b = new long[n];
            
            for (int i = 0; i < n; i++) {
                b[i] = kb.nextLong();
            }

            Solution s = new Solution();
            boolean res = s.check(a, b, n);

            System.out.println((res ? "1" : "0"));
        }
        kb.close();
    }
}

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        Map<Long, Integer> map = new HashMap<>();
        
        for (long l : A) {
            map.put(l, map.getOrDefault(l, 0) + 1);
        }
        
        for (long l : B) {
            if (map.containsKey(l)) {
                int v = map.get(l);
                if (v == 1) {
                    map.remove(l);
                } else {
                    map.put(l, map.get(l) - 1);
                }
            } else {
                return false;
            }
        }
        
        return true;
    }
}
