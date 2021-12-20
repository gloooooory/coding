/**
 * Link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1#
 * Date: 20 Dec 2021
 * Code #3
*/

import java.util.*;

class SpiralMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int r = kb.nextInt();
            int c = kb.nextInt();

            int[][] m = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    m[i][j] = kb.nextInt();
                }
            }
            ArrayList<Integer> list = Solution.spirallyTraverse(m, r, c);

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
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = r*c;
        
        int i = 0, j = 0, x = 0, y = 0;
        
        while (count > 0) {
            
            while (j < c-y) {
                list.add(matrix[i][j]);
                j++;
                
                count--;
            }
            
            if (count <= 0) break;
            
            i++;
            j--;
            
            while (i >= 0 && i < r-x) {
                list.add(matrix[i][j]);
                i++;
                
                count--;
            }
            
            if (count <= 0) break;
            
            i--;
            j--;
            
            while (j >= y) {
                list.add(matrix[i][j]);
                j--;
                
                count--;
            }
            
            if (count <= 0) break;
            
            j++;
            i--;
            x++;
            y++;
            
            while (i >= x) {
                list.add(matrix[i][j]);
                i--;
                
                count--;
            }
            
            if (count <= 0) break;
            
            i++;
            j++;
        }
        
        return list;
    }
}
