/**
 * Link: https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1#
 * Date: 09 Dec 2021
 * Code #1
*/

import java.util.*;

class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            System.out.println(Solution.nonrepeatingCharacter(str));
        }
    }
}

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int[] alphabets = new int[26];
        
        for (char ch : S.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        
        char res = '$';
        
        for (char ch : S.toCharArray()) {
            if (alphabets[ch - 'a'] == 1) {
                res = ch;
                break;
            }
        }
        return res;
    }
}
