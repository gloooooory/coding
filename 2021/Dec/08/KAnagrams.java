/**
 * Link: https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1#
 * Date: 08 Dec 2021
 * Code #3
*/

import java.util.*;

class KAnagrams {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String s1 = kb.nextLine();
            String s2 = kb.nextLine();
            int k = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.areKAnagrams(s1, s2, k) ? "1" : "0");
        }
        kb.close();
    }
}

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        if (s1.length() != s2.length()) return false;
        
        int[] alphabets = new int[26];
        
        for (char ch : s1.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        
        for (char ch : s2.toCharArray()) {
            alphabets[ch - 'a']--;
        }
        
        int count = 0;
        for (int i : alphabets) {
            count += Math.abs(i);
        }
        
        return ((count/2) <= k);
    }
}