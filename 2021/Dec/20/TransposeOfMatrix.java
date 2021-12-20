/**
 * Link: https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1#
 * Date: 20 Dec 2021
 * Code #1
*/

import java.util.*;

class TransposeOfMatrix {
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
            Solution.transpose(m, n);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(m[i][j] + " ");
                }
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}
