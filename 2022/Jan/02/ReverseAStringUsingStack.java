/**
 * Link: https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1#
 * Date: 02 Jan 2022
 * Code #5
*/
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class ReverseAStringUsingStack {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        Stack<Character> stack = new Stack<>();
        
        for(char ch : S.toCharArray()) {
            stack.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }

}
