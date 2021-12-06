/**
 * Link: https://practice.geeksforgeeks.org/problems/prime-number2314/1#
 * Date: 19th Nov 2021
 * Code #3
*/

import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.isPrime(n));
        }
    }
}

class Solution{
    static int isPrime(int N){
        if (N == 1) return 0;
        if (N == 2) return 1;
        
        for (int i = 2; i*i <= N; i++) {
            if (N % i == 0) return 0;
        }
        return 1;
    }
}