/**
 * Link: https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
 * Date: 21 Dec 2021
 * Code #3
*/

import java.util.*;

class RowWithMax1 {
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
            Solution s = new Solution();
            System.out.println(s.rowWithMax1s(matrix, n, m));
        }
        kb.close();
    }
}

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int index = -1;
        int j = m-1;
        
        for (int i = 0; i < n; i++) {
            while (j >= 0) {
                if (arr[i][j] == 1) {
                    j--;
                    index = i;
                } else {
                    break;
                }
            }
        }
        return index;
    }
}
