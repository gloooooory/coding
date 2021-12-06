/**
 * Link: https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1
 * Date: 16th Nov 2021
 * Code #2
*/

import java.util.*;

class SumOfDigitPalindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.isDigitSumPalindrome(n));
        }
    }
}

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum = digitSum(N);
        
        return isPalindrome(sum) ? 1 : 0;
    }
    
    int digitSum(int n) {
        int sum = 0;
        
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        
        return sum;
    }
    
    boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        
        while (n != 0) {
            rev *= 10;
            rev += (n % 10);
            n /= 10;
        }
        
        return (rev == temp);
    }
}