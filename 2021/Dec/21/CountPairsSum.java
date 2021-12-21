/**
 * Link: https://practice.geeksforgeeks.org/problems/count-pairs-sum-in-matrices4332/1
 * Date: 21 Dec 2021
 * Code #4
*/

import java.util.*;

class CountPairsSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int x = kb.nextInt();

            int[][] mat1 = new int[n][n];
            int[][] mat2 = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat1[i][j] = kb.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat2[i][j] = kb.nextInt();
                }
            }
            Solution s = new Solution();
            System.out.println(s.countPairs(mat1, mat2, n, x));
        }
        kb.close();
    }
}

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (check(mat2, n, x - mat1[i][j])) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    boolean check(int[][] arr, int n, int x) {
        int i = 0, j = n-1;
        
        while(i >= 0 && i <= n-1 && j >= 0 && j <= n-1) {
            if (arr[i][j] == x) {
                return true;
            }
            
            if (arr[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
