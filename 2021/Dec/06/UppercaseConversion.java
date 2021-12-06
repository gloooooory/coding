/**
 * Link: https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1
 * Date: 06 Dec 2021
 * Code #3
*/

import java.util.*;

class UppercaseConversion {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.transform(str));
        }
        kb.close();
    }
}

class Solution
{
    public String transform(String s)
    {
        String[] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for (String w : words) {
            if (w.length() > 0) {
                String temp = Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
                sb.append(temp);
            }
        }
        
        return sb.toString();
    }
}