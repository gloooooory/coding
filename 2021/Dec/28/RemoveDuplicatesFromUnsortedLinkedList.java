/**
 * Link: https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1#
 * Date: 28 Dec 2021
 * Code #5
*/

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class RemoveDuplicatesFromUnsortedLinkedList
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
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
       
        
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		  
		 while(t>0)
         {
			int n = sc.nextInt();
			RemoveDuplicatesFromUnsortedLinkedList llist = new RemoveDuplicatesFromUnsortedLinkedList();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }
}
// } Driver Code Ends


/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        if (head == null || head.next == null) return head;
        
        Set<Integer> set = new HashSet<>();
         
        Node temp = head;
        Node curr = head.next;
        
        set.add(temp.data);
        while (curr != null) {
            if (!set.contains(curr.data)) {
                temp.next = curr;
                temp = curr;
                set.add(curr.data);
            }
            curr = curr.next;
        }
        
        temp.next = null;
        return head;
    }
}
