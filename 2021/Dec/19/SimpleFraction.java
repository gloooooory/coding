/**
 * Link: https://practice.geeksforgeeks.org/problems/a-simple-fraction0921/1
 * Date: 19 Dec 2021
 * Code #4
*/

import java.util.*;

class SimpleFraction {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.fractionToDecimal(n, m));
        }
        kb.close();
    }
}

class Solution
{
    public String fractionToDecimal(int numerator, int denominator)
    {
        StringBuilder sb = new StringBuilder();
        
        int remainderIndex;
        
        sb.append(String.valueOf(numerator/denominator));
        int remainder = numerator % denominator;
        
        if (remainder != 0) {
            sb.append(".");
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = sb.length();
        
        while (remainder != 0 && !map.containsKey(remainder)) {
            map.put(remainder, n);
            numerator = remainder * 10;
            sb.append(String.valueOf(numerator / denominator));
            remainder = numerator % denominator;
            n = n + 1;
        }
        
        String s = sb.toString();
        
        if (remainder != 0) {
            remainderIndex = map.get(remainder);
            s = s.substring(0, remainderIndex) + "(" + s.substring(remainderIndex) + ")";
        }
        
        return s;
    }
}
