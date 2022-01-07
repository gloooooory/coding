/**
 * Link: https://practice.geeksforgeeks.org/problems/swap-all-odd-and-even-bits-1587115621/1#
 * Date: 07 Jan 2022
 * Code #1
*/
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    int even = (n & 0xAAAAAAAA);
	    int odd = (n & 0x55555555);
	    even = even >> 1;
	    odd = odd << 1;
	    int result = (even | odd);
	    return result;
	}
    
}

// { Driver Code Starts.

class SwapBits {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}  // } Driver Code Ends