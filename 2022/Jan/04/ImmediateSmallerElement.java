/**
 * Link: https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1#
 * Date: 04 Jan 2022
 * Code #2
*/

import java.util.*;
import java.io.*;

public class ImmediateSmallerElement {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().immediateSmaller(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void immediateSmaller(int arr[], int n) {
        for (int i = 0; i+1 < n; i++) {
            arr[i] = arr[i] <= arr[i+1] ? -1 : arr[i+1];
        }
        arr[n-1] = -1;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i : arr) {
            sb.append(i + " ");
        }
    }
}