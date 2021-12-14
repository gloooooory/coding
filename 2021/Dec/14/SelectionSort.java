/**
 * Link: https://practice.geeksforgeeks.org/problems/selection-sort/1#
 * Date: 14 Dec 2021
 * Code #5
*/

import java.util.*;

class SelectionSort {
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
            s.selectionSort(arr, n);

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
	int  select(int arr[], int i)
	{
        int index = i;
        int min = arr[i];
        
        for (int j = i+1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                index = j;
            }
        }
        
        return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for (int i = 0; i < n; i++) {
	        int index = select(arr, i);
	        
	        int temp = arr[index];
	        arr[index] = arr[i];
	        arr[i] = temp;
	    }
	}
}