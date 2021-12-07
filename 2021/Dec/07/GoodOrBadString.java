/**
 * Link: https://practice.geeksforgeeks.org/problems/good-or-bad-string1417/1#
 * Date: 07 Dec 2021
 * Code #2
*/

import java.util.*;

class GoodOrBadString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.isGoodorBad(str));
        }
    }
}

class Solution {
    static int isGoodorBad(String S) {
        int vowelCount = 0, consonantCount = 0;
        
        for (char ch : S.toCharArray()) {
            if (isVowel(ch)) {
                consonantCount = 0;
                vowelCount++;
            } else if (ch == '?') {
                vowelCount++;
                consonantCount++;
            } else {
                vowelCount = 0;
                consonantCount++;
            }
            
            if (vowelCount > 5 || consonantCount > 3) return 0;
        }
        
        return 1;
    }
    
    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}