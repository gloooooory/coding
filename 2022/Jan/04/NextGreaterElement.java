/**
 * Link: https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
 * Date: 04 Jan 2022
 * Code #1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class NextGreaterElement {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}

// } Driver Code Ends
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        long[] result = new long[n];
        result[n-1] = -1;
        
        if (n == 1) return result;
        
        Stack<Long> stack = new Stack<>();
        
        for (int i = n-1; i >= 0; i--) {
            if (stack.empty()) {
                result[i] = -1;
                stack.push(arr[i]);
                continue;
            }
            
            if (arr[i] < stack.peek()) {
                result[i] = stack.peek();
                stack.push(arr[i]);
            } else {
                while (!stack.empty() && arr[i] >= stack.peek()) {
                    stack.pop();
                }
                
                if (!stack.empty() && arr[i] < stack.peek()) {
                    result[i] = stack.peek();
                    stack.push(arr[i]);
                }
                
                if (stack.empty()) {
                    result[i] = -1;
                    stack.push(arr[i]);
                }
            }
        }
        return result;
    } 
}
