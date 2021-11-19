/**
 * Link: https://practice.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n4404/1
 * Date: 19th Nov 2021
 * Code #5
*/

import java.util.*;

class SumOfAllPrimeNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            Solution s = new Solution();
            long sum = s.prime_sum(n);
            System.out.println(sum);
        }
    }
}

class Solution
{
    public long prime_Sum(int n)
    {
        if (n == 1) return 0l;
        
        long sum = 0;
        
        boolean[] nonPrimes = new boolean[n+1];
        
        nonPrimes[0] = true;
        nonPrimes[1] = true;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2*i; j <= n; j+=i) {
                nonPrimes[j] = true;
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (!nonPrimes[i]) {
                sum += i;
            }
        }
        
        return sum;
    }
}