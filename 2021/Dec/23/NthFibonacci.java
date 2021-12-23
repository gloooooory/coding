/**
 * Link: https://practice.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1#
 * Date: 23 Dec 2021
 * Code #4
*/

import java.util.*;

class NthFibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.fib(n));
        }
        kb.close();
    }
}

class Solution{
    static int fib(int N){
        if (N == 0) return 0;
        
        if (N < 3) return 1;
        
        int a = 1, b = 1;
        int res = a+b;
        
        for (int i = 0; i < N-2; i++) {
            a = b;
            b = res;
            res = (a+b) % 10;
        }
        
        return b;
    }
}
