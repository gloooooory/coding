/**
 * Link: https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1#
 * Date: 22 Dec 2021
 * Code #3
*/

import java.util.*;

class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.toh(n, 1, 3, 2));
        }
        kb.close();
    }
}

class Solution {

    public long toh(int N, int from, int to, int aux) {
        long moves = 0;
        if (N == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return moves+1;
        }
        
        moves += toh(N-1, from, aux, to);
        
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        moves += toh(N-1, aux, to, from);
        return moves+1;
    }
}
