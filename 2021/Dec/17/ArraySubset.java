/**
 * Link: https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
 * Date: 17 Dec 2021
 * Code #1
*/

import java.util.*;

class ArraySubset {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextInt();
            long[] a1 = new long[(int)(n)];

            for (int i = 0; i < n; i++) {
                a1[i] = kb.nextLong();
            }

            long m = kb.nextInt();
            long[] a2 = new long[(int)(m)];

            for (int i = 0; i < m; i++) {
                a2[i] = kb.nextLong();
            }

            Solution s = new Solution();
            System.out.println(s.isSubset(a1, a2, n, m));
        }
        kb.close();
    }
}

class Solution {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Set<Long> set = new HashSet<>();
        
        for (long l : a2) {
            set.add(l);
        }
        
        int count = 0;
        
        for (long l : a1) {
            if (set.contains(l)) {
                count++;
            }
        }
        
        String ans = "No";
        if (count == a2.length) {
            ans = "Yes";
        }
        
        return ans;
    }
}