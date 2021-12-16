/**
 * Link: https://practice.geeksforgeeks.org/problems/find-distinct-elements2054/1#
 * Date: 16 Dec 2021
 * Code #5
*/

import java.util.*;

class FindDistinctElements {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[][] m = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = kb.nextInt();
                }
            }
            int count = Solution.distinct(m, n);
            System.out.println(count);
        }
        kb.close();
    }
}

class Solution{
    static int distinct(int M[][], int N)
    {
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            Map<Integer, Integer> m = new HashMap<>();
            
            for (int j = 0; j < N; j++) {
                int e = M[i][j];
                
                if (!m.containsKey(e)) {
                    m.put(e, 1);
                    map.put(e, map.getOrDefault(e, 0) + 1);
                }
            }
        }
        
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == N) {
                count++;
            }
        }
        
        return count;
    }
}