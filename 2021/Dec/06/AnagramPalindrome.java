/**
 * Link: https://practice.geeksforgeeks.org/problems/anagram-palindrome4720/1#
 * Date: 06 Dec 2021
 * Code #2
*/

import java.util.*;

class AnagramPalindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            int res = s.isPossible(str);

            System.out.println((res == 1) ? "YES" : "NO");
        }
    }
}

class Solution
{
    int isPossible (String S)
    {
        // aabbcc
        // aabcc
        // a
        // aa
        // aba
        // ab
        
        
        if (S.length() == 1) return 1;
        
        int[] alphabets = new int[26];
        
        for (char ch : S.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        
        boolean isEven = (S.length() % 2 == 0);
        int evenCount = 0, oddCount = 0;
        
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        if (isEven && oddCount != 0) {
            return 0;
        }
        
        if (!isEven && oddCount != 1) {
            return 0;
        }
        
        return 1;
    }
}