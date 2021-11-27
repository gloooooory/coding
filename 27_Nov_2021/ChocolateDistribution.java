/**
 * Link: https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1#
 * Date: 27th Nov 2021
 * Code #3
*/

import java.util.*;

class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            ArrayList<Long> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(kb.nextLong());
            }

            long m = kb.nextLong();
            Solution s = new Solution();
            long ans = s.findMinDiff(arr, n, m);
            System.out.println(ans);
        }
        kb.close();
    }
}

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        
        long min = Long.MAX_VALUE;
        
        for(int i = 0; i + m - 1 < n; i++) {
            long x = a.get(i);
            long y = a.get((int)(i + m - 1));
            
            min = Math.min(min, y-x);
        }
        
        return min;
    }
}