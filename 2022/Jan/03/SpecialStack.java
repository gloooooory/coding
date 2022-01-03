/**
 * Link: https://practice.geeksforgeeks.org/problems/special-stack/1#
 * Date: 03 Jan 2022
 * Code #2
*/

import java.util.Scanner;
import java.util.Stack;
class SpecialStack {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    private int min = Integer.MAX_VALUE;
    
	public void push(int a,Stack<Integer> s)
	{
	    if(min > a) {
	        s.push(2 * a - min);
	        min = a;
	    } else {
	        s.push(a);
	    }
	}
	public int pop(Stack<Integer> s)
    {
        int num = s.pop();
        if (num < min) {
            min = 2 * min - num;
        }
        return num;
	}
	public int min(Stack<Integer> s)
    {
        return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
	{
        return (s.size() == n);
	}
	public boolean isEmpty(Stack<Integer>s)
    {
        return s.empty();
	}
}
