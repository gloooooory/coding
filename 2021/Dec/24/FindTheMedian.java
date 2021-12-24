/**
 * Link: https://practice.geeksforgeeks.org/problems/find-the-median0527/1#
 * Date: 24 Dec 2021
 * Code #1
*/

import java.util.*;

class FindTheMedian {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.findMedian(arr));
        }
        kb.close();
    }
}

class Solution
{
    public int findMedian(int[] v)
    {
        if (v.length == 1) {
            return v[0];
        }
        
        Arrays.sort(v);
        
        boolean isEven = v.length % 2 == 0;
        
        if (isEven) {
            int mid = v.length / 2;
            
            return (v[mid - 1] + v[mid]) / 2;
        }
        
        int mid = v.length / 2;
        return v[mid];
    }
}
