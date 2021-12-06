/**
 * Link: https://practice.geeksforgeeks.org/problems/merge-two-strings2736/1
 * Date: 06 Dec 2021
 * Code #5
*/

import java.util.*;

class MergeTwoStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            String s1 = kb.nextLine();
            String s2 = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.merge(s1, s2));
        }
    }
}

class Solution 
{ 
    String merge(String S1, String S2)
    { 
        StringBuilder sb = new StringBuilder();
        
        int i = 0, j = 0;
        
        while (i < S1.length() && j < S2.length()) {
            sb.append(S1.charAt(i));
            i++;
            sb.append(S2.charAt(j));
            j++;
        }
        
        while(i < S1.length()) {
            sb.append(S1.charAt(i));
            i++;
        }
        
        while(j < S2.length()) {
            sb.append(S2.charAt(j));
            j++;
        }
        
        return sb.toString();
    }
} 