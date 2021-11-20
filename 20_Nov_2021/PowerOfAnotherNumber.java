/**
 * Link: https://practice.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number5442/1#
 * Date: 20th Nov 2021
 * Code #4
*/

import java.util.*;

class PowerOfAnotherNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long x = kb.nextLong();
            long y = kb.nextLong();
            System.out.println(Solution.isPowerOfAnother(x, y));
        }
    }
}

class Solution{
    static Long isPowerOfAnother(Long X, Long Y){
        if (X == 1) {
            return (X == Y) ? 1l : 0l;
        }
        
        for (int i = 0; (long)Math.pow(X, i) <= Y; i++) {
            long res = (long)Math.pow(X, i);
            if (res == Y) return 1l;
            else if (res > Y) return 0l;
        }
        
        return 0l;
    }
}
