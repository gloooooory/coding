/**
 * Link: https://practice.geeksforgeeks.org/problems/count-squares3649/1
 * Date: 20th Nov 2021
 * Code #1
*/

import java.util.*;

class CountSquares {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.countSquares(n));
        }
    }
}

class Solution {
    static int countSquares(int N) {
        int count = 0;
        
        for (int i = 1; i*i < N; i++) {
            count++;
        }
        
        return count;
    }
}