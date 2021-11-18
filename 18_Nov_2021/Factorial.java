/**
 * Link: https://practice.geeksforgeeks.org/problems/factorial5739/1
 * Date: 18th Nov 2021
 * Code #1
*/

import java.util.*;

class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.factorial(n));
        }
    }
}

class Solution{
    static long factorial(int N){
        // recursive
        // iterative
        
        if (N == 0) return 1;
        
        return N * factorial(N - 1);
    }
}