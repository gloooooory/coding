/**
 * Link: https://practice.geeksforgeeks.org/problems/angle-between-hour-and-minute-hand0545/1#
 * Date: 21st Nov 2021
 * Code #2
*/

import java.util.*;

class AngleBetweenHourAndMinute {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int h = kb.nextInt();
            int m = kb.nextInt();
            System.out.println(Solution.getAngle(h, m));
        }
    }
}

class Solution {
    static int getAngle(int H , int M) {
        // Hand     Duration    Deg
        // hh       1h          30
        // mm       1h          360
        // hh       1min        0.5
        // mm       1min        6
        
        // Example: 3:30
        // hh = 3h + 30min
        // hh = 3*30 + 30*0.5
        // hh = 90 + 15
        // hh = 105
        
        // mm = 30min
        // mm = 30*6
        // mm = 180
        
        // diff = Math.abs(hh - mm)
        // diff = 75
        // ans = Math.min(75, 360 - 75)
        // ans = 75
        
        double hh = H*30 + M*0.5;
        double mm = M*6;
        double diff = Math.abs(hh - mm);
        
        int ans = (int)Math.min(diff, 360 - diff);
        return ans;
    }
};