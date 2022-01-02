/**
 * Link: https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#
 * Date: 02 Jan 2022
 * Code #4
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class ParenthesisChecker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        boolean res = true;
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : x.toCharArray()) {
            switch(ch) {
                case '{': 
                    stack.push('}');
                break;
                case '[':
                    stack.push(']');
                break;
                case '(':
                    stack.push(')');
                break;
                case '}': case ']': case ')':
                    if (stack.empty()) return false;
                    
                    char temp = stack.pop();
                    if (temp != ch) {
                        return false;
                    }
                break;
            }
        }
        
        if (!stack.empty()) return false;
        
        return res;
    }
}
