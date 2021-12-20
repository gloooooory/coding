/**
 * Link: https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1#
 * Date: 20 Dec 2021
 * Code #5
*/

import java.util.*;

class CountZeroesInMatrix {
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
            Solution s = new Solution();
            System.out.println(s.countZeros(m, n));
        }
        kb.close();
    }
}

class Solution
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int N)
    {
        int count = 0;
        
        int r = N - 1;
        int c = 0;
        
        while (c < N) {
            
            while (A[r][c] != 0) {
                r--;
                
                if (r < 0) return count;
            }
            
            count += (r + 1);
            c++;
        }
        
        return count;
    }
}