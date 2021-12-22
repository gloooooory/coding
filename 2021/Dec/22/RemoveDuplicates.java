/**
 * Link: https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates0744/1
 * Date: 22 Dec 2021
 * Code #5
*/

import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.remove(str));
        }
        kb.close();
    }
}

class Solution{
    String remove(String s) {
        String res = s;
        String temp = "";
        
        while (temp.length() != res.length()) {
            temp = res;
            res = removeUtil(res);
        }
        return res;
    }
    
    String removeUtil(String s) {
        int n = s.length();
        int i = 0;
        StringBuilder res = new StringBuilder();
        
        while (i < n) {
            if (i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                while (i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                    i++;
                }
            } else {
                res.append(String.valueOf(s.charAt(i)));
            }
            i++;
        }
        return res.toString();
    }
}
