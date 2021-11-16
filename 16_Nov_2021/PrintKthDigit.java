/**
 * Link: https://practice.geeksforgeeks.org/problems/print-the-kth-digit3520/1#
 * Date: 16th Nov 2021
 * Code #4
*/

import java.util.*;

class PrintKthDigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int k = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.kthDigit(a, b, k));
        }
    }
}

class Solution{
    static long kthDigit(int A,int B,int K){
        long p = power(A, B);
        
        long result = 0;
        
        while (K-- > 0) {
            result = p % 10;
            p /= 10;
        }
        
        return result;
    }
    
    static long power(long a, long b) {
        long result = 1;
        
        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a;
            }
            
            a = a * a;
            b = b >> 1;
        }
        
        return result;
    }
}