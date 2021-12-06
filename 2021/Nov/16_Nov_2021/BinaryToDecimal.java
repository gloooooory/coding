/**
 * Link: https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1#
 * Date: 16th Nov 2021
 * Code #5
*/

import java.util.*;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.binary_to_decimal(str));
        }
    }
}

class Solution
{
    public int binary_to_decimal(String str)
    {
        // Built in Integer parsing method:
        // return Integer.parseInt(str, 2);
        
        int[] arr = new int[17];
        arr[0] = 1;
        
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 2 * arr[i-1];
        }
        
        int decimal = 0;
        
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--, j++) {
            char ch = str.charAt(i);
            
            if (ch == '1') {
                decimal += arr[j];
            }
        }
        
        return decimal;
    }
}