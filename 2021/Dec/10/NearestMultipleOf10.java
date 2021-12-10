/**
 * Link: https://practice.geeksforgeeks.org/problems/nearest-multiple-of-102437/1#
 * Date: 10 Dec 2021
 * Code #3
*/

import java.util.*;

class NearestMultipleOf10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String n = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.roundToNearest(n));
        }
    }
}

class Solution{
    
  
    String roundToNearest(String N)
    {
        char[] arr = N.toCharArray();
        
        char ch = arr[N.length() - 1];
        
        if (ch == '0') {
            return N;
        } else if (ch >= '1' && ch <= '5') {
            arr[N.length() - 1] = '0';
            return new String(arr);
        } else {
            arr[N.length() - 1] = '0';
            
            for (int i = N.length() - 2; i >= 0; i--) {
                if (arr[i] == '9') {
                    arr[i] = '0';
                } else {
                    int temp = arr[i] - '0' + 1;
                    arr[i] = (char)('0' + temp);
                    break;
                }
            }
        }
        
        String s1 = new String(arr);
        
        if (s1.charAt(0) == '0') {
            s1 = "1" + s1;
        }
        
        return s1;
    }
}