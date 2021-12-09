/**
 * Link: https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1#
 * Date: 09 Dec 2021
 * Code #2
*/

import java.util.*;

class LongestDistinctSubstring {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            System.out.println(Solution.longestSubstrDistinctChars(str));
        }
    }
}

class Solution{
    static int longestSubstrDistinctChars(String S){
        if (S.length() == 1) return 1;
        
        Map<Character, Integer> map = new HashMap<>();
        
        int i = 0, j = 1, max = -1;
        
        while (i < S.length() && j < S.length()) {
            char a = S.charAt(i);
            char b = S.charAt(j);
            
            if (!map.containsKey(a)) {
                map.put(a, i);
            }
            
            if (!map.containsKey(b)) {
                map.put(b, j);
                j++;
            } else {
                max = Math.max(max, j - i);
                i = map.get(b) + 1;
                map = new HashMap<>();
                j = i+1;
            }
        }
        
        max = Math.max(max, j - i);
        return max;
    }
}