/**
 * Link: https://practice.geeksforgeeks.org/problems/flood-fill-algorithm1856/1#
 * Date: 23 Dec 2021
 * Code #1
*/

import java.util.*;

class FloodFill {
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

            int sr = kb.nextInt();
            int sc = kb.nextInt();
            int newColor = kb.nextInt();

            Solution s = new Solution();
            s.floodFill(matrix, sr, sc, newColor);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
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
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        boolean[][] visited = new boolean[image.length][image[0].length];
        
        int color = image[sr][sc];
        
        fill(image, sr, sc, newColor, visited, color);
        
        return image;
    }
    
    public void fill(int[][] image, int r, int c, int newColor, boolean[][] visited, int color) {
        image[r][c] = newColor;
        visited[r][c] = true;
        
        if (r-1 >= 0 && image[r-1][c] == color && !visited[r-1][c]) {
            fill(image, r-1, c, newColor, visited, color);
        }
        
        if (r+1 < image.length && image[r+1][c] == color && !visited[r+1][c]) {
            fill(image, r+1, c, newColor, visited, color);
        }
        
        if (c-1 >= 0 && image[r][c-1] == color && !visited[r][c-1]) {
            fill(image, r, c-1, newColor, visited, color);
        }
        
        if (c+1 < image[0].length && image[r][c+1] == color && !visited[r][c+1]) {
            fill(image, r, c+1, newColor, visited, color);
        }
    }
}