/**
 * Link: https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1#
 * Date: 02 Jan 2022
 * Code #2
*/

import java.util.*;

import java.io.*;
import java.lang.*;

class OperationsOnStack {

	public static void main(String args[])throws IOException
	{
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(read.readLine());
         
		 while(t>0)
		 {
			MyStack obj = new MyStack();
			int Q = Integer.parseInt(read.readLine());
			int k = 0;
			String str[] = read.readLine().trim().split(" ");
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = Integer.parseInt(str[k++]);
				if(QueryType == 1)
				{
					int a = Integer.parseInt(str[k++]);
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}



// } Driver Code Ends




class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    if (top+1 < 1000) {
	        top++;
	        arr[top] = a;
	    }
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        if (top != -1) {
            int val = arr[top];
            top--;
            return val;
        }
        return -1;
	}
}