/**
 * Link: https://practice.geeksforgeeks.org/problems/save-ironman0227/1#
 * Date: 07 Dec 2021
 * Code #1
*/

import java.util.*;

class SaveIronMan {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.saveIronman(str) ? "YES" : "NO");
        }
        kb.close();
    }
}

class Solution {
    // Function for finding maximum and value pair
    public static boolean saveIronman (String s) {
        // s = s.replaceAll("[^a-z^A-Z^0-9,]", "");
        // s = s.replaceAll(",", "");
        
        // // System.out.println("s = " + s);
        
        // String rev = (new StringBuilder(s)).reverse().toString();
        // // System.out.println("rev = " + rev);
        
        // return s.equalsIgnoreCase(rev);
        
        s = s.toLowerCase();
        s = s.trim();
        
        if (s.length() == 1) return true;
        
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            
            if (!isAlphaNumeric(a)) {
                i++;
                continue;
            }
            
            if (!isAlphaNumeric(b)) {
                j--;
                continue;
            }
            
            if (a != b) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public static boolean isAlphaNumeric(char a) {
        return ((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'));
    }
}
