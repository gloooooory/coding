/**
 * Link: https://practice.geeksforgeeks.org/problems/find-k-th-character-in-string3841/1#
 * Date: 09 Dec 2021
 * Code #4
*/

import java.util.*;

class KthCharacterInString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int m = kb.nextInt();
            int n = kb.nextInt();
            int k = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.kthCharacter(m, n, k));
        }
        kb.close();
    }
}

class Solution {
    char kthCharacter(int m, int n, int k) {
        // code here
        // 101
        // 10 01 10
        // 10 01 01 10 10 01
        
        String binary = Integer.toBinaryString(m);
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : binary.toCharArray()) {
                if (ch == '0') {
                    sb.append("01");
                } else {
                    sb.append("10");
                }
            }
            binary = sb.toString();
        }
        
        return binary.charAt(k-1);
    }
}