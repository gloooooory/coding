/**
 * Link: https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1#
 * Date: 17th Nov 2021
 * Code #1
*/

import java.util.*;

class JumpingNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long X = kb.nextLong();
            System.out.println(Solution.jumpingNums(X));
        }
    }
}

class Solution {
    static long res = 0;
    
    static long jumpingNums(long X) {
        // Time Complexity: O(X)
        // Space Complexity: O(1)
        // return bruteForce(X);

        // Time Complexity: O(k)
        // Space Complexity: O(k)
        // k = Total no. of Jumping numbers <= X
        if (X <= 10) return X;
        
        res = 0;
        for (int i = 1; i <= 10; i++) {
            bfs(X, i);
        }
        
        return res;
    }
    
    static void bfs(long X, long i) {
        Queue<Long> q = new LinkedList<>();
        q.add(i);
        
        while (!q.isEmpty()) {
            long temp = q.poll();
            
            if (temp <= X) {
                res = Math.max(res, temp);
                
                long lastDigit = temp % 10;
                
                if (lastDigit == 0) {
                    long next = temp * 10 + (lastDigit + 1);
                    if (next <= X) {
                        q.add(next);
                    }
                } else if (lastDigit == 9) {
                    long next = temp * 10 + (lastDigit - 1);
                    if (next <= X) {
                        q.add(next);
                    }
                } else {
                    long next = temp * 10 + (lastDigit - 1);
                    if (next <= X) {
                        q.add(next);
                    }
                    
                    next = temp * 10 + (lastDigit + 1);
                    if (next <= X) {
                        q.add(next);
                    }
                }
            }
        }
    }
    
    static long bruteForce(long X) {
        if (isJumpingNumber(X)) return X;
        
        while(X > 10) {
            if (isJumpingNumber(X)) return X;
            X--;
        }
        
        return 0;
    }
    
    static boolean isJumpingNumber(long X) {
        if (X <= 10) return true;
        
        while (X > 0) {
            long temp = X % 10;
            X /= 10;
            
            if (X == 0) break;
            
            if (Math.abs(temp - (X % 10)) != 1) {
                return false;
            }
        }
        
        return true;
    }
};