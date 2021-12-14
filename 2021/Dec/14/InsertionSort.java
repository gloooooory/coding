/**
 * Link: https://practice.geeksforgeeks.org/problems/insertion-sort/1
 * Date: 14 Dec 2021
 * Code #4
*/

import java.util.*;

class InsertionSort {
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
            s.insertionSort(arr, n);

            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {
    
  static void insert(int arr[],int i) {
       int key = arr[i];
       int j = i-1;
       
       while (j >= 0 && arr[j] > key) {
           arr[j+1] = arr[j];
           j--;
       }
       
       arr[j+1] = key;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n) {
      for (int i = 1; i < n; i++) {
          insert(arr, i);
      }
  }
}