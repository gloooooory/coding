/**
 * Link: https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1#
 * Date: 31 Dec 2021
 * Code #5
*/

//Initial Template for Java
import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
class DeleteNodeInDoublyLinkedList
{
	Node head;
	Node tail;
	
	void addToTheLast(Node node)
	{
		if(head ==  null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			tail.next.prev = tail;
			tail = tail.next;
		}
	}
	
	void printList(Node head)
	{	Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp =  temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			DeleteNodeInDoublyLinkedList list = new DeleteNodeInDoublyLinkedList();
			
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			list.addToTheLast(head);
			
			for(int i=1;i<n;i++)
			{
				int a = sc.nextInt();
				list.addToTheLast(new Node(a));
			}
			a1 = sc.nextInt();
			Solution g = new Solution();
			//System.out.println(list.temp.data);
			Node ptr = g.deleteNode(list.head, a1);
			list.printList(ptr);
			t--;
		}
	}
}


                               // } Driver Code Ends


//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        if(x==1){
            head = head.next;
            return head;
        }
    	Node temp = head;
    	int count = 0;
    	Node curr = temp;
    	while(temp!=null){
    	    count++;
    	    if(count == x-1){
    	        curr = temp;
    	        temp.next = temp.next.next;
    	        continue;
    	    }
    	    
    	    temp = temp.next;
    	    if(temp!=null && count==x){
    	       temp.prev = curr; 
    	       break;
    	    }
    	   
    	}
	    return head;
    }
}
