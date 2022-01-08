/**
 * Link: https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1#
 * Date: 08 Jan 2022
 * Code #4
*/

import java.io.*;
import java.util.*;

class EquilibriumPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        if (n == 1) return 1;
        if (n == 2) return -1;
        
        int i = 0, j = n-1;
        long leftSum = arr[i], rightSum = arr[j];
        
        while (j - i > 1) {
            if (leftSum > rightSum) {
                j--;
                if (j >= 0)
                rightSum += arr[j];
            } else {
                i++;
                if (i < n)
                leftSum += arr[i];
            } 
            
            if (leftSum == rightSum && j - i == 2) {
                return (i+j)/2 + 1;
            }
        }
        
        return -1;
    }
}
