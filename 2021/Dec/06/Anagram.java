/**
 * Link: https://practice.geeksforgeeks.org/problems/anagram-1587115620/1
 * Date: 06 Dec 2021
 * Code #1
*/

import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String a = kb.nextLine();
            String b = kb.nextLine();
            System.out.println(Solution.isAnagram(a, b) ? "YES" : "NO");
        }
        kb.close();
    }
}

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if (a.length() != b.length()) return false;
        
        int[] alphabets = new int[26];
        
        for (int i = 0; i < a.length(); i++) {
            alphabets[a.charAt(i) - 'a']++;
            alphabets[b.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0) return false;
        }
        
        return true;
    }
}