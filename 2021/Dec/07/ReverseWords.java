/**
 * Link: https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1#
 * Date: 07 Dec 2021
 * Code #4
*/

import java.util.*;

class ReverseWords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.reverseWords(str));
        }
        kb.close();
    }
}

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] arr = S.split("[.]");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                sb.append(arr[i] + ".");
            } else {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}