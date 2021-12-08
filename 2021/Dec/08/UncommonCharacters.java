/**
 * Link: https://practice.geeksforgeeks.org/problems/uncommon-characters4932/1#
 * Date: 08 Dec 2021
 * Code #4
*/

import java.io.*;
import java.util.*;
class UncommonCharacters {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String A = sc.next();
            String B = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.UncommonChars(A, B));
        }
    }
}// } Driver Code Ends

class Solution {
    String UncommonChars(String A, String B) {
        int[] a = new int[26];
        int[] b = new int[26];
        
        for (int i = 0; i < A.length(); i++) {
            a[A.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < B.length(); i++) {
            b[B.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0 && b[i] == 0 || a[i] == 0 && b[i] != 0) {
                sb.append(String.valueOf((char)(Math.abs(i) + 'a')));
            }
        }
        
        return sb.toString().isEmpty() ? "-1" : sb.toString();
    }
}