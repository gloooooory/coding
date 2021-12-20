/**
 * Link: https://practice.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
 * Date: 20 Dec 2021
 * Code #2
*/

import java.util.*;

class MatrixInSnakePattern {
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
            ArrayList<Integer> list = Solution.snakePattern(m);

            StringBuilder sb = new StringBuilder();

            for (int i : list) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            int j;
            
            if (i % 2 == 0) {
                j = 0;
                while (j < n) {
                    list.add(matrix[i][j]);
                    j++;
                }
            } else {
                j = n-1;
                while (j >= 0) {
                    list.add(matrix[i][j]);
                    j--;
                }
            }
        }
        
        return list;
    }
}
