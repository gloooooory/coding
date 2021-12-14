/**
 * Link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 * Date: 14 Dec 2021
 * Code #2
*/

import java.util.*;

class SortArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution.sort012(arr, n);

            StringBuilder sb = new StringBuilder();

            for (int i : arr) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution
{
    public static void sort012(int a[], int n)
    {
        int twos = 0, ones = 0;
        
        for (int i : a) {
            if (i == 1) ones++;
            else if (i == 2) twos++;
        }
        
        int i = n-1;
        while (twos > 0) {
            twos--;
            a[i] = 2;
            i--;
        }
        
        while (ones > 0) {
            ones--;
            a[i] = 1;
            i--;
        }
        
        while (i >= 0) {
            a[i] = 0;
            i--;
        }
    }
}
