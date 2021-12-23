/**
 * Link: https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
 * Date: 23 Dec 2021
 * Code #3
*/

import java.util.*;

class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int rev = reverse(n);
            Solution s = new Solution();
            System.out.println(s.power(n, rev));
        }
        kb.close();
    }

    public static int reverse(int n) {
        int temp = n;
        int res = 0;

        while (temp != 0) {
            res = res * 10;
            res += (temp % 10);
            temp /= 10;
        }

        return res;
    }
}

class Solution
{
    static long mod = (long)(1e9 + 7);
    
    long power(int N, int R)
    {
        long p = binaryPower(N, R, mod);
        return p;
    }
    
    long binaryPower(int n, int r, long mod) {
        if (r == 0) {
            return 1;
        }
        
        long res = binaryPower(n, r/2, mod);
        
        if (r % 2 != 0) {
            res = ((res % mod) * (res % mod)) % mod;
            res = ((res % mod) * (n % mod)) % mod;
        } else {
            res = ((res % mod) * (res % mod)) % mod;
        }
        
        return res;
    }
}
