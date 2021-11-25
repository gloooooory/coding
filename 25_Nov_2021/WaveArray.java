/**
 * Link: https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1#
 * Date: 25th Nov 2021
 * Code #4
*/

import java.util.*;

class WaveArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution.convertToWave(arr, n);

            StringBuilder sb = new StringBuilder();

            for(int i : arr) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {
    public static void convertToWave(int[] arr, int n) {
        for (int i = 0, j = 1; i < n && j < n; i+=2, j+=2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}