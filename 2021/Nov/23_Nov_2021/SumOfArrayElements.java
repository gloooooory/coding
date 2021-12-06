/**
 * Link: https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1#
 * Date: 23rd Nov 2021
 * Code #3
*/

import java.util.*;

class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            System.out.println(Solution.sumElement(arr, n));
        }
    }
}

class Solution
{
    public static int sumElement(int arr[], int n)
    {
        int sum = 0;
        
        for (int i : arr) {
            sum += i;
        }
        
        return sum;
    }
}
