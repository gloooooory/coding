/**
 * Link: https://practice.geeksforgeeks.org/problems/check-for-subsequence4930/1
 * Date: 08 Dec 2021
 * Code #1
*/

import java.util.*;

class CheckForSubsequence {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String a = kb.nextLine();
            String b = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.isSubSequence(a, b) ? 1 : 0);
        }
        kb.close();
    }
}

class Solution{
    boolean isSubSequence(String A, String B){
        if (A.length() > B.length()) return false;
        
        int j = 0;
        for (int i = 0; i < B.length() && j < A.length(); i++) {
            char a = A.charAt(j);
            char b = B.charAt(i);
            
            if (a == b) {
                j++;
            }
        }
        
        return (j == A.length());
    }
}