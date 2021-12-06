/**
 * Link: https://practice.geeksforgeeks.org/problems/pairs-of-prime-number2612/1
 * Date: 19th Nov 2021
 * Code #6
*/

import java.util.*;

class PairsOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            Solution s = new Solution();
            int[] arr = s.prime_pairs(n);

            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
    }
}

class Solution
{
    public int[] prime_pairs(int n)
    {
        // Find all primes numbers less than equal to 200
        
        List<Integer> primes = getPrimes();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < primes.size(); i++) {
            for (int j = 0; j < primes.size() && primes.get(i) * primes.get(j) <= n; j++) {
                result.add(primes.get(i));
                result.add(primes.get(j));
            }
        }
        
        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
    
    public List<Integer> getPrimes() {
        boolean[] nonPrimes = new boolean[201];
        
        nonPrimes[0] = true;
        nonPrimes[1] = true;
        
        for (int i = 2; i < 201; i++) {
            for (int j = 2*i; j < 201; j+=i) {
                nonPrimes[j] = true;
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i < 201; i++) {
            if (!nonPrimes[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
}