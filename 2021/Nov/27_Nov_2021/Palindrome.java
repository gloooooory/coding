/**
 * Link: https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
 * Date: 27th Nov 2021
 * Code #5
*/

import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String s = kb.nextLine();
            Solution solution = new Solution();
            System.out.println(solution.isPalindrome(s));
        }
    }
}

class Solution {
    int isPalindrome(String S) {
        if (S.length() == 1) return 1;
        
        int i = 0, j = S.length() - 1;
        
        while (i < j) {
            if (S.charAt(i) != S.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }
        
        return 1;
    }
};