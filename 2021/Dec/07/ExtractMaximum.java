/**
 * Link: https://practice.geeksforgeeks.org/problems/extract-maximum2943/1
 * Date: 07 Dec 2021
 * Code #3
*/

import java.util.*;

class ExtractMaximum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            System.out.println(Solution.extractMaximum(str));
        }
        kb.close();
    }
}

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        int max = -1;
        
        String s = "";
        
        for (char ch : S.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                s = s + ch;
            } else if (s.length() != 0) {
                int temp = Integer.parseInt(s);
                s = "";
                max = Math.max(max, temp);
            }
        }
        
        if (s.length() != 0) {
            int temp = Integer.parseInt(s);
            max = Math.max(max, temp);
        }
        
        return max;
    }    
} 
