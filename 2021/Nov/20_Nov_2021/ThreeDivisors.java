/**
 * Link: https://practice.geeksforgeeks.org/problems/3-divisors3942/1#
 * Date: 20th Nov 2021
 * Code #2
*/

import java.util.*;

class ThreeDivisors {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            ArrayList<Long> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                list.add(kb.nextLong());
            }
            ArrayList<Integer> result = Solution.threeDivisors(list, n);

            for (int l : result) {
                System.out.println(l);
            }
        }
    }
}

class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        ArrayList<Integer> list = new ArrayList<>();
        
        ArrayList<Long> primes = getPrimes((int)(1e6 + 1));
        
        for (int i = 0; i < q; i++) {
            long n = query.get(i);
            list.add(solve(n, primes));
        }
        
        return list;
    }
    
    static int solve(long n, ArrayList<Long> primes) {
        int count = 0;
        
        for (long l : primes) {
            if (l*l <= n) count++;
            else break;
        }
        
        return count;
    }
    
    static ArrayList<Long> getPrimes(int n) {
        ArrayList<Long> list = new ArrayList<>();
        
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
                list.add((long)i);
            }
        }
        
        return list;
    }
}