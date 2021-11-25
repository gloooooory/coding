/**
 * Link: https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 * Date: 25th Nov 2021
 * Code #3
*/

import java.util.*;

class MajorityElement {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int size = kb.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = kb.nextInt();
            }
            System.out.println(Solution.majorityElement(arr, size));
        }
    }
}

class Solution
{
    static int majorityElement(int a[], int size)
    {
        if (size == 1) return a[0];
        if (size == 2) return (a[0] == a[1]) ? a[0] : -1;
        
        int candidate = a[0], count = 0;
        
        for (int i : a) {
            if (count == 0) {
                candidate = i;
            }
            if (candidate == i) {
                count++;
            } else {
                count--;
            }
        }
        
        int temp = 0;
        for (int i : a) {
            if (i == candidate) {
                temp++;
            }
        }
        
        return (temp > size/2) ? candidate : -1;
    }
}