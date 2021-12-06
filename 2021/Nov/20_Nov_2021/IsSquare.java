/**
 * Link: https://practice.geeksforgeeks.org/problems/is-square1846/1#
 * Date: 20th Nov 2021
 * Code #3
*/

import java.util.*;

class IsSquare {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int x1 = kb.nextInt();
            int y1 = kb.nextInt();
            int x2 = kb.nextInt();
            int y2 = kb.nextInt();
            int x3 = kb.nextInt();
            int y3 = kb.nextInt();
            int x4 = kb.nextInt();
            int y4 = kb.nextInt();
            System.out.println(Solution.isSquare(x1, y1, x2, y2, x3, y3, x4, y4));
        }
    }
}

class Solution {
    static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int d12 = distance(x1, y1, x2, y2);
        int d13 = distance(x1, y1, x3, y3);
        int d14 = distance(x1, y1, x4, y4);
        int d23 = distance(x2, y2, x3, y3);
        int d24 = distance(x2, y2, x4, y4);
        int d34 = distance(x3, y3, x4, y4);
        
        // out of these distances
        // 4 should be equal
        // the remaining unequal ones should be equal
        
        int countSide = 0, countDiagonal = 0;
        int side = 0, diag = 0;
        
        int temp = d12;
        
        int[] arr = new int[]{d12, d13, d14, d23, d24, d34};
        
        for (int i : arr) {
            if (i == temp) {
                countSide++;
                if (side == 0) {
                    side = i;
                } else if (side != i) {
                    return "No";
                }
            }
            else {
                countDiagonal++;
                if (diag == 0) {
                    diag = i;
                } else if (diag != i) {
                    return "No";
                }
            }
        }
        
        return (countSide == 2 && countDiagonal == 4) || (countSide == 4 && countDiagonal == 2) ? "Yes" : "No";
    }
    
    static int distance(int x1, int y1, int x2, int y2) {
        return (Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
};