/**
 * Link: https://practice.geeksforgeeks.org/problems/square-root/1#
 * Date: 12 Dec 2021
 * Code #3
*/

import java.util.*;

class SquareRoot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long x = kb.nextLong();
            Solution s = new Solution();
            System.out.println(s.floorSqrt(x));
        }
        kb.close();
    }
}

class Solution
{
     long floorSqrt(long x)
	 {
		long l = 1;
		long h = x;
		long m = l + (h - l) / 2;
		
		while (m*m < x) {
		    
		    if (m * m > x) {
		        h = m;
		    } else if (m * m < x) {
		        l = m+1;
		    } else {
		        break;
		    }
		    
		    m = l + (h - l) / 2;
		}
		
		while (m * m > x) {
		    m--;
		}
		
		return m;
	 }
}
