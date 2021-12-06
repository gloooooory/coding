/**
 * Link: https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0#
 * Date: 23rd Nov 2021
 * Code #5
*/

import java.util.*;

class RotateArray {
	public static void main (String[] args) {
	    Scanner kb = new Scanner(System.in);
	    
	    int t = kb.nextInt();
	    
	    while (t-- > 0) {
	        int n = kb.nextInt();
	        int d = kb.nextInt();
	        
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = kb.nextInt();
	        }
	        
	        rotateArray(arr, 0, d-1);
	        rotateArray(arr, d, n-1);
	        rotateArray(arr, 0, n-1);
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i : arr) {
	            sb.append(i + " ");
	        }
	        
	        System.out.println(sb.toString());
	    }
	}
	
	public static void rotateArray(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}
}