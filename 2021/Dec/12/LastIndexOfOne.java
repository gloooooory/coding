/**
 * Link: https://practice.geeksforgeeks.org/problems/last-index-of-15847/1
 * Date: 12 Dec 2021
 * Code #5
*/

import java.util.*;

class LastIndexOfOne {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.lastIndex(str));
        }
        kb.close();
    }
}

class Solution {
    public int lastIndex( String s) {
        int i = s.length() - 1;
        
        boolean flag = false;
        
        while (i >= 0 && s.charAt(i) == '0') {
            i--;
            
            flag = true;
            
            if (i >= 0 && s.charAt(i) == '1') {
                break;
            }
        }
        
        return i;
    }
}