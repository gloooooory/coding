/**
 * Link: https://practice.geeksforgeeks.org/problems/day-of-the-week1637/1#
 * Date: 22nd Nov 2021
 * Code #3
*/

import java.util.*;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int d = kb.nextInt();
            int m = kb.nextInt();
            int y = kb.nextInt();
            System.out.println(Solution.getDayOfWeek(d, m, y));
        }
    }
}

class Solution {
    static String getDayOfWeek(int d, int m, int y) {
        String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Tomohiko Sakamoto Algorithm
        int[] t = new int[] { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        
        if (m < 3) y--;
        int day = (y + (y/4) - (y/100) + (y/400) + (t[m-1] + d)) % 7;
        return days[day];
    }
};