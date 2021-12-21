/**
 * Link: https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1#
 * Date: 21 Dec 2021
 * Code #2
*/

import java.util.*;

class SearchInMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();

            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = kb.nextInt();
                }
            }

            int x = kb.nextInt();
            
            System.out.println(Solution.matSearch(matrix, n, m, x));
        }
        kb.close();
    }
}

class Solution
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int row = 0, col = M - 1;
        
        while (row < N && col >= 0) {
            if (mat[row][col] == X) return 1;
            
            if (mat[row][col] > X) col--;
            else row++;
        }
        
        return 0;
    }
}