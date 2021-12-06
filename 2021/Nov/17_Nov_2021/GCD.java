/**
 * Link: https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 * Date: 17th Nov 2021
 * Code #2
*/

import java.util.*;

class GCD {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.gcd(a, b));
        }
    }
}

class Solution
{
    public int gcd(int A , int B) 
    { 
        // return recursive(A, B);
        return iterative(A, B);
    } 

    public int recursive(int A, int B) {
        return (B == 0) ? A : recursive(B, A%B);
    }

    public int iterative(int A, int B) {
        if (B == 0) return A;
        
        while (B > 0) {
            A = A % B;
            
            // swap A & B
            int temp = A;
            A = B;
            B = temp;
        }
        
        return A;
    }
}