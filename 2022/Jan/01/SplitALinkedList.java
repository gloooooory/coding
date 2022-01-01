/**
 * Link: https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1#
 * Date: 01 Jan 2022
 * Code #2
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


public class SplitALinkedList
{
    Node head, head1, head2;  // head of lisl
	//Node last = null;
	Node last = null;
  
    /* Linked list Node*/
   
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
     public void addToTheLast(Node node) 
	 {
		
		  if (head == null) 
		  {
			head = node;
			
		  } else 
		  {
			   Node temp = head;
			   while (temp.next != null)
			   temp = temp.next;

		       temp.next = node;
		  }
	 }
  /* Function to print linked list */
    void printList(Node node)
    {
        Node temp = node;
        if(node != null)
        {
			do{
           System.out.print(temp.data+" ");
           temp = temp.next;
			}while (temp != node);
        }  
        System.out.println();
    }
	
	void circular()
	{
		    last = head;
			while (last.next != null)
				last = last.next;
			last.next = head;
			//System.out.println(last);
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
			SplitALinkedList llist = new SplitALinkedList();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
			
			
		     }
			 /*Node x = head;
			 while(x!=null)
			 {
				 System.out.print(x.data+" ");
				 x = x.next;
			 }*/
			llist.circular();
          //int k=sc.nextInt();
         gfg g = new gfg();
         //System.out.println(g.getCount(llist));
		 g.splitList(llist);
		 llist.printList(llist.head1);
		 llist.printList(llist.head2);
        //llist.printList();
		//llist.head = llist.reverse(llist.head);
		//llist.printList();
		
		
        t--;
    }
}
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg {
    // Function  to split a circular LinkedList
	void splitList(SplitALinkedList list) {
        Node head = list.head;
        
        Node mid = findMid(head);
        
        Node last = mid.next;
        
        while(last.next != head){
            last = last.next;
        }
        
        list.head2 = mid.next;
        list.head1 = head;
        last.next = mid.next;
        mid.next = head;
	}
	
	Node findMid(Node head){
        Node slow = head, fast = head;
        
        while(fast.next!=head && fast.next.next!=head){
          slow = slow.next;
          fast = fast.next.next;
        }
        
        return slow;
    }
}
