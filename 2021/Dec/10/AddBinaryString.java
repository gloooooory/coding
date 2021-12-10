/**
 * Link: https://practice.geeksforgeeks.org/problems/add-binary-strings3805/1#
 * Date: 10 Dec 2021
 * Code #1
*/

import java.util.*;

class AddBinaryString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            String a = kb.nextLine();
            String b = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.addBinary(a, b));
        }
        kb.close();
    }
}

class Solution {
    String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        
        if (A.length() < B.length()) {
            A = appendZero(A, B) + A;
        } else if (B.length() < A.length()) {
            B = appendZero(B, A) + B;
        }
        
        int carry = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            
            if (a == '1' && b == '1') {
                if (carry == 1) {
                    sb.append("1");
                    carry = 1;
                } else {
                    sb.append("0");
                    carry = 1;
                }
            } else if (a == '1' && b == '0' || a == '0' && b == '1') {
                if (carry == 1) {
                    sb.append("0");
                    carry = 1;
                } else {
                    sb.append("1");
                    carry = 0;
                }
            } else {
                if (carry == 1) {
                    sb.append("1");
                    carry = 0;
                } else {
                    sb.append("0");
                }
            }
        }
        
        if (carry == 1) {
            sb.append("1");
        }
        
        String temp = sb.reverse().toString();
        
        int j = -1;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                j = i;
                break;
            }
        }
        
        if (j != -1) {
            return temp.substring(j);
        }
        
        return "0";
    }
    
    String appendZero(String small, String large) {
        int d = large.length() - small.length();
            
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < d; i++) {
            temp.append("0");
    }
        
        return temp.toString();
    }
}
