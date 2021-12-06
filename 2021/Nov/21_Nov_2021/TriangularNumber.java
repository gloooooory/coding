/**
 * Link: https://practice.geeksforgeeks.org/problems/triangular-number2850/1#
 * Date: 21st Nov 2021
 * Code #4
*/

import java.util.*;

class TriangularNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            Solution.triangularNumber(n);
        }
    }
}

class Solution {
    int isTriangular(int N){
        int i = 1, j = 2;
        
        while (i < N) {
            i = i + j;
            j++;
        }
        
        return (i == N) ? 1 : 0;
    }
}