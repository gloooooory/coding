/**
 * Link: https://practice.geeksforgeeks.org/problems/reverse-digit0316/1
 * Date: 16th Nov 2021
 * Code #3
*/

import java.util.*;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            Solution s = new Solution();
            System.out.println(s.reverse_digit(n));
        }
    }
}

class Solution
{
    public long reverse_digit(long n)
    {
        long rev = 0;
        
        while (n != 0) {
            rev *= 10;
            rev += (n % 10);
            n /= 10;
        }
        
        return rev;
    }
}