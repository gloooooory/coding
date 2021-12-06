/**
 * Link: https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1#
 * Date: 23rd Nov 2021
 * Code #1
*/

import java.util.*;

class MinMaxArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            long n = kb.nextLong();
            long[] arr = new long[(int)n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextLong();
            }

            Pair p = Solution.getMinMax(arr, n);
            System.out.println(p.first + " " + p.second);
        }
    }
}

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for (long i : a) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        return new Pair(min, max);
    }
}

class Pair {  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}