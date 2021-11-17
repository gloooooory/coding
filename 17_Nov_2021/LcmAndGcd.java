/**
 * Link: https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1#
 * Date: 17th Nov 2021
 * Code #3
*/

import java.util.*;

class LcmAndGcd {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            Long a = kb.nextLong();
            Long b = kb.nextLong();
            Solution s = new Solution();
            Long[] arr = s.lcmAndGcd(a, b);
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}

class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long gcdOfAB = gcd(A, B);
        Long lcmOfAB = lcm(A, B, gcdOfAB);
        
        return new Long[] {lcmOfAB, gcdOfAB};
    }
    
    static Long gcd(Long A, Long B) {
        // return (B == 0) ? A : gcd(B, A % B);
        
        if (B == 0) return A;
        
        while (B > 0) {
            A = A % B;
            
            // swap a, b
            Long temp = A;
            A = B;
            B = temp;
        }
        
        return A;
    }
    
    static Long lcm(Long A, Long B, Long gcdAB) {
        return ((A * B) / gcdAB);
    }
};