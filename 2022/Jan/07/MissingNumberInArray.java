/**
 * Link: https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#
 * Date: 07 Jan 2022
 * Code #4
*/

// Initial Template for Java

import java.io.*;
import java.util.*;

class MissingNumberInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }
        
        for (int i : array) {
            xor = xor ^ i;
        }
        
        return xor;
    }
}