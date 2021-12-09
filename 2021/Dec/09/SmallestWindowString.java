/**
 * Link: https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
 * Date: 10 Dec 2021
 * Code #5
*/

import java.util.*;

class SmallestWindowString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            String s = kb.nextLine();
            String p = kb.nextLine();
            System.out.println(Solution.smallestWindow(s, p));
        }
        kb.close();
    }
}

class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        String ans = "";
        
        Map<Character, Integer> map2 = new HashMap<>();
        
        for (char ch : p.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        
        int count = 0;
        int totalCount = p.length();
        
        Map<Character, Integer> map1 = new HashMap<>();
        int i = -1;
        int j = -1;
        
        while (true) {
            boolean flag1 = false, flag2 = false;
            // acquire
            while (i < s.length() - 1 && count < totalCount) {
                i++;
                char ch = s.charAt(i);
                
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                
                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    count++;
                }
                flag1 = true;
            }
            
            // store & release
            while (j < i && count == totalCount) {
                String temp = s.substring(j+1, i+1);
                
                if (ans.length() == 0 || temp.length() < ans.length()) {
                    ans = temp;
                }
                
                j++;
                char ch = s.charAt(j);
                
                if (map1.get(ch) == 1) {
                    map1.remove(ch);
                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }
                
                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    count--;
                }
                
                flag2 = true;
            }
            
            if (!flag1 && !flag2) {
                break;
            }
        }
        
        return ans.length() == 0 ? "-1" : ans;
    }
}
