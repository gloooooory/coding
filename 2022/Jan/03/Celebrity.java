/**
 * Link: https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1#
 * Date: 03 Jan 2022
 * Code #3
*/

import java.io.*;
import java.util.*; 

class Celebrity {
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        int start = 0, end = n-1;
        
        while (start != end) {
            if (M[start][end] == 0) {
                end--;
            } else {
                start++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != start && (M[start][i] == 1 || M[i][start] == 0)) {
                return -1;
            }
        }
        
    	return start;
    }
}
