/**
 * Link: https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1#
 * Date: 21st Nov 2021
 * Code #1
*/

import java.util.*;

class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.trailingZeroes(n));
        }
    }
}

class Solution{
    static int trailingZeroes(int N){
        // Brute force approach
        // Calculate the factorial of N
        // Count the number of zeroes
        // Convert the factorial into string & then count zeroes
        // Keep on dividing the number until the last digit is non-zero
        // For 10^9 calculating factorial would be out of range
        
        // Efficient approach
        // Zero comes when we multiply 2 * 5
        // So we just need to count the no. of 2s & 5s
        // 5! = 5 * 4 * 3 * 2 * 1
        // 5 = 1
        // 2 = 3
        // 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
        // 5 = 2
        // 2 - 8
        // 2 zeroes
        
        // No. of zeroes = No. of 5s
        
        int count = 0;
        
        // 25
        // 25, 20, 15, 10, 5
        // 2, 1, 1, 1, 1
        // 6
        for (int i = 5; i <= N; i*=5) {
            count += (N/i);
        }
        
        return count;
    }
}