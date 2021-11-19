/**
 * Link: https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
 * Date: 19th Nov 2021
 * Code #4
*/

import java.util.*;

class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            List<Integer> list = Solution.sieveOfEratosthenes(n);

            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
    }
}

class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        ArrayList<Integer> list = new ArrayList<>();
        
        if (N == 1) return list;
        
        boolean[] nonPrimes = new boolean[N+1];
        nonPrimes[0] = true;
        nonPrimes[1] = true;
        
        for (int i = 2; i <= N; i++) {
            for (int j = 2*i; j <= N; j = j+=i) {
                nonPrimes[j] = true;
            }
        }
        
        for (int i = 0; i <= N; i++) {
            if (!nonPrimes[i]) {
                list.add(i);
            }
        }
        
        return list;
    }
}