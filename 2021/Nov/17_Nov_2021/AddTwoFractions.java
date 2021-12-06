/**
 * Link: https://practice.geeksforgeeks.org/problems/add-two-fractions/1
 * Date: 17th Nov 2021
 * Code #4
*/

import java.util.*;

class AddTwoFractions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int num1 = kb.nextInt();
            int den1 = kb.nextInt();
            int num2 = kb.nextInt();
            int den2 = kb.nextInt();
            Solution s = new Solution();
            s.addFraction(num1, den1, num2, den2);
        }
    }
}

class Solution
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        int den = lcm(den1, den2);
        int num = (num1 * (den / den1)) + (num2 * (den / den2));
        
        int resultGcd = gcd(num, den);
        num /= resultGcd;
        den /= resultGcd;
        
        System.out.println(num + "/" + den);
    }
    
    int lcm(int a, int b) {
        return ((a * b) / gcd(a, b));
    }
    
    int gcd(int a, int b) {
        // return (b == 0) ? a : gcd(b, a%b);
        
        if (b == 0) return a;
        
        while (b > 0) {
            a = a % b;
            
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}