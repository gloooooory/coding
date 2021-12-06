/**
 * Link: https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1#
 * Date: 18th Nov 2021
 * Code #5
*/

import java.util.*;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            System.out.println(Solution.isPerfectNumber(n));
        }
    }
}

class Solution {
    static int isPerfectNumber(Long N) {
        if (N == 1) return 0;
        
        Set<Long> set = new HashSet<>();
        
        set.add(1l);
        
        long temp = N;
        for(long i = 2; i <= temp; i++) {
            if (N % i == 0) {
                set.add(i);
                set.add(N / i);
                temp = N / i;
            }
        }
        
        long sum = 0;
        
        for (long l : set) {
            sum += l;
        }
        
        return (sum == N) ? 1 : 0;
    }
};