/**
 * Link: https://practice.geeksforgeeks.org/problems/remove-every-kth-node/1
 * Date: 25th Dec 2021
 * Code #5
*/

import java.util.*;

class Node
{
	Node next;
	int data;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class RemoveEveryKthNode
{
	Node head;	
	
	void addToTheLast(Node node)
	{
		if(head == null)
		head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		} }	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();		 
		 while(t>0)
         {
			int n = sc.nextInt();
			RemoveEveryKthNode list = new RemoveEveryKthNode();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				list.addToTheLast(new Node(a));
			}
			int k = sc.nextInt();					  
			//System.out.println(list.head.data+" "+ k);
			list.head = new GfG().delete(list.head,k); 
			Node temp = list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+ " ");
			    temp = temp.next;
			}
			System.out.println();
			t--;
		}
	}
}// } Driver Code Ends


/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    if (k == 0) return head;
        if (k == 1) return null;
        
        int i = 1;
        Node temp = head;
        while (temp.next != null) {
            i++;
            if (i % k == 0)
            temp.next = temp.next.next;
            else
            temp = temp.next;
        }
        return head;	 
    }
}