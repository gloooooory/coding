/**
 * Link: https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1#
 * Date: 28 Dec 2021
 * Code #4
*/

import java.util.*;

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class RemoveDuplicateFromLinkedList
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			RemoveDuplicateFromLinkedList llist = new RemoveDuplicateFromLinkedList(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}// } Driver Code Ends


/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    if (head == null || head.next == null) return head;
	    
	    Node root = head;
	    
	    while (head != null && head.next != null) {
	        if (head.data == head.next.data) {
	            head.next = head.next.next;
	        } else {
	            head = head.next;
	        }
	    }
	    
	    return root;
    }
}
