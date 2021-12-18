/**
 * Link: https://practice.geeksforgeeks.org/problems/in-first-but-second5423/1#
 * Date: 18 Dec 2021
 * Code #1
*/

import java.util.*;

class FindMissingInSecondArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();

            long[] a = new long[n];
            long[] b = new long[m];

            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = kb.nextInt();
            }
            Solution s = new Solution();
            List<Long> list = s.findMissing(a, b, n, m);

            StringBuilder sb = new StringBuilder();

            for (long l : list) {
                sb.append(l + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> list = new ArrayList<>();
        
        Set<Long> set = new HashSet<>();
        
        for (long l : B) {
            set.add(l);
        }
        
        for (long l : A) {
            if (!set.contains(l)) {
                list.add(l);
            }
        }
        
        return list;
    }
}
