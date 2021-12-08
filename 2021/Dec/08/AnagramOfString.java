/**
 * Link: https://practice.geeksforgeeks.org/problems/anagram-of-string/1#
 * Date: 08 Dec 2021
 * Code #5
*/

import java.util.*;

class AnagramOfString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String s = kb.nextLine();
            String s1 = kb.nextLine();
            Solution solution = new Solution();
            System.out.println(solution.remAnagrams(s, s1));
        }
        kb.close();
    }
}

class Solution
{
	public int remAnagrams(String s,String s1) {
        int[] alphabets = new int[26];
        
        for (char ch : s.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        
        for (char ch : s1.toCharArray()) {
            alphabets[ch - 'a']--;
        }
        
        int count = 0;
        
        for (int i = 0; i < alphabets.length; i++) {
            count += Math.abs(alphabets[i]);
        }
        
        return count;
    }
}