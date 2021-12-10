/**
 * Link: https://practice.geeksforgeeks.org/problems/multiply-two-strings/1#
 * Date: 10 Dec 2021
 * Code #2
*/

import java.util.*;
import java.math.*;

class MultiplyTwoStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String s1 = kb.nextLine();
            String s2 = kb.nextLine();
            Solution s = new Solution();
            System.out.println(s.multiplyStrings(s1, s2));
        }
        kb.close();
    }
}

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        return new BigInteger(s1).multiply(new BigInteger(s2)).toString();
    }
}