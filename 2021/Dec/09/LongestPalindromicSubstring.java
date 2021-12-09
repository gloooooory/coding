/**
 * Link: https://practice.geeksforgeeks.org/problems/longest-palindromic-substring-in-linear-time/1#
 * Date: 09 Dec 2021
 * Code #3
*/

import java.util.*;

class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.longestPalindromicSubstring(str));
        }
    }
}

class Solution
{
    static String longestPalindromicSubstring(String text)
    {
        if (text.length() == 1) return text;
        
        int start = 0, end = 0;
        int len = -1;
        String res = "";
        
        for (int i = 0; i < text.length(); i++) {
            int len1 = expandFromMiddle(text, i, i);
            int len2 = expandFromMiddle(text, i, i+1);
            len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - ((len - 1)/2);
                end = i + (len/2);
                
                String temp = text.substring(start, end+1);
                if (temp.length() > res.length()) {
                    res = temp;
                }
            }
        }
        
        String temp = text.substring(start, end+1);
        if (temp.length() > res.length()) {
            res = temp;
        }
        
        return res;
    }
    
    static int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) return 0;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}
