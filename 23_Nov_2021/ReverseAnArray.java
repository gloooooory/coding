/**
 * Link: https://practice.geeksforgeeks.org/problems/reverse-an-array/0#
 * Date: 23rd Nov 2021
 * Code #4
*/

import java.util.*;

class ReverseAnArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            
            for (int i = n-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}