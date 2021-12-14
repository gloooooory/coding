/**
 * Link: https://practice.geeksforgeeks.org/problems/bubble-sort/1
 * Date: 14 Dec 2021
 * Code #3
*/

import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution.bubbleSort(arr, n);

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
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}