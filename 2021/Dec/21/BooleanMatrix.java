/**
 * Link: https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1#
 * Date: 21 Dec 2021
 * Code #1
*/

import java.util.*;

class BooleanMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int m = kb.nextInt();
            int n = kb.nextInt();

            int[][] matrix = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = kb.nextInt();
                }
            }
            Solution s = new Solution();
            s.booleanMatrix(matrix);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        int m = matrix.length;
        int n = matrix[0].length;
        
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row.contains(i) || col.contains(j)) {
                    matrix[i][j] = 1;
                }
            }
        }
    }
}
