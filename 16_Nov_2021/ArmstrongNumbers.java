/**
 * Link: https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
 * Date: 16th Nov 2021
 * Code #1
*/

import java.util.*;

class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.armstrongNumber(n));
        }
    }
}

class Solution {
    static String armstrongNumber(int n){
        int cube = 0;
        int temp = n;
        
        while (n != 0) {
            int digit = n % 10;
            cube += Math.pow(digit, 3);
            n /= 10;
        }
        
        if (temp == cube) return "Yes";
        return "No";
    }
}