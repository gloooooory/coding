/**
 * Link: https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/1
 * Date: 06 Dec 2021
 * Code #4
*/

import java.util.*;

class SortStringDescending {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.reverseSort(str));
        }
    }
}

class Solution 
{ 
    String reverseSort(String str) 
    { 
        if (str.length() == 1) return str;
        
        int[] alphabets = new int[26];
        
        for (char ch : str.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 25; i >= 0; i--) {
            while (alphabets[i] != 0) {
                sb.append((char)(i + 'a'));
                alphabets[i]--;
            }
        }
        
        return sb.toString();
    }
} 