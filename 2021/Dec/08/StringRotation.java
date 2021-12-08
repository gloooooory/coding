/**
 * Link: https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1#
 * Date: 08 Dec 2021
 * Code #2
*/

import java.util.*;

class StringRotation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String a = kb.nextLine();
            String b = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.areRotations(a, b) ? 1 : 0);
        }
    }
}

class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        if (s1.length() != s2.length()) return false;
        
        String t1 = s1 + s1;
        String t2 = s2 + s2;
        
        return (t1.contains(s2) && t2.contains(s1));
    }
    
}