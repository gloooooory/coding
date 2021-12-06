/**
 * Link: https://practice.geeksforgeeks.org/problems/last-two-digit-fibonacci3353/1#
 * Date: 22nd Nov, 2021
 * Code #1
*/

import java.util.*;

class LastTwoDigitFibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            Solution s = new Solution();
            System.out.println(s.fibonacciDigits(n));
        }
    }
}

class Solution{
    int fibonacciDigits(long N){
        int[] arr = new int[300];
        arr[1] = 1;
        arr[2] = 1;
        
        for (int i = 3; i < 300; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 100;
        }
        
        return arr[(int)(N%300)];
    }
}