/**
 * Link: https://practice.geeksforgeeks.org/problems/number-of-open-doors1552/1#
 * Date: 21st Nov 2021
 * Code #3
*/

import java.util.*;

class OpenDoors {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            System.out.println(Solution.noOfOpenDoors(n));
        }
    }
}

class Solution {
    static int noOfOpenDoors(Long N) {
        // 1 2 3 4 5 6 7 8 9 10
        // o o o o o o o o o o 1
        // o c o c o c o c o c 2
        // o c c c o o o c c c 3
        // o c c o o o o o c c 4
        // o c c o c o o o c o 5
        // o c c o c c o o c o 6
        // o c c o c c c o c o 7
        // o c c o c c c c c o 8
        // o c c o c c c c o o 9 
        // o c c o c c c c o c 10
        
        // Open doors = 1, 4, 9
        // Squares <= 10
        // squares <= N
        
        // int count = 0;
        
        // for (long i = 1; i*i <= N; i++) {
        //     count++;
        // }
        
        // return count;
        
        return (int)(Math.sqrt(N));
    }
};