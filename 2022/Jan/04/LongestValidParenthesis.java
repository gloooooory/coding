/**
 * Link: https://practice.geeksforgeeks.org/problems/longest-valid-parentheses5657/1
 * Date: 04 Jan 2022
 * Code #3
*/

//Initial Template for Java

import java.io.*;
import java.util.*;

class LongestValidParenthesis {
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String str){
        int res = 0;
        int open = 0;
        int close = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            
            if (open == close) {
                res = Math.max(res, 2 * open);
            } else if (close > open) {
                open = close = 0;
            }
        }
        open = close = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            
            if (open == close) {
                res = Math.max(res, 2 * open);
            } else if (open > close) {
                open = close = 0;
            }
        }
        return res;
    }
}