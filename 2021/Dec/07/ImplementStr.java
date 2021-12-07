/**
 * Link: https://practice.geeksforgeeks.org/problems/implement-strstr/1#
 * Date: 07 Dec 2021
 * Code #5
*/

import java.util.*;

class ImplementStr {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String s = kb.nextLine();
            String x = kb.nextLine();
            Solution solution = new Solution();
            System.out.println(solution.strstr(s, x));
        }
        kb.close();
    }
}

class Solution
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
        if (s.length() < x.length()) return -1;
        
        int i = 0, j = x.length();
        
        for (i = 0; i+j <= s.length(); i++) {
            if (s.substring(i, i+j).equals(x)) {
                return i;
            }
        }
        return -1;
    }
}
