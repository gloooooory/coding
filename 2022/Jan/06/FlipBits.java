/**
 * Link: https://practice.geeksforgeeks.org/problems/flip-bits0240/1#
 * Date: 06 Jan 2022
 * Code #2
*/

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class FlipBits {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        int msf=0,meh=0;
        for(int i=0;i<n;i++){
            meh += (a[i] != 0)?-1:1;
    
            if(meh>msf){
                msf=meh;
            }
            
            if(meh<0){
                meh=0;
            }
        }
        
        for(int i=0;i<n;i++){
            if(a[i] != 0) msf++;
        }
        
        return msf;
    }
}
