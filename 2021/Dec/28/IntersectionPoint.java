/**
 * Link: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1#
 * Date: 28 Dec 2021
 * Code #3
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
	
 class IntersectionPoint
{
    Node head = null;  
	Node tail = null;

public void addToTheLast(Node node) 
{

  if (head == null) {
   head = node;
   tail = head;
  } else {
   //Node temp = head;
   //while (temp.next != null)
    //temp = temp.next;

   //temp.next = node;
   tail.next=node;
   tail = node;
  }
}

  /* Function to print linked list */
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
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			IntersectionPoint llist1 = new IntersectionPoint();
		    IntersectionPoint llist2 = new IntersectionPoint();
			IntersectionPoint llist3 = new IntersectionPoint();
			
				int a1=sc.nextInt();
				Node head1= new Node(a1);
				Node tail1= head1;
				
				for (int i = 1; i < n1; i++) 
				{
					int a = sc.nextInt(); 
					tail1.next = (new Node(a));
					tail1= tail1.next;
				}
			
			
				int b1=sc.nextInt();
				Node head2 = new Node(b1);
				Node tail2 = head2;
				for (int i = 1; i < n2; i++) 
				{
					int b = sc.nextInt();  
					tail2.next = (new Node(b));
					tail2= tail2.next;
				}
				
				int c1=sc.nextInt();
				Node head3= new Node(c1);
				tail1.next = head3;
				tail2.next = head3;
				Node tail3=head3;
				for (int i = 1; i < n3; i++) 
				{
					int c = sc.nextInt();   
					tail3.next = (new Node(c));
					tail3= tail3.next;
				}
				
				Intersect obj = new Intersect();
				System.out.println(obj.intersectPoint(head1, head2));
			t--;			
         }
    }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
	    if (head1 == null || head2 == null) {
	        return -1;
	    }
	    
	    Node tail = getTail(head1);
	    tail.next = head2;
	    
	    Node meetingPoint = cycleNode(head1);
	    
	    return meetingPoint == null ? -1 : meetingPoint.data;
	}
	
	Node intersection(Node head) {
	    if (head == null || head.next == null) {
	        return head;
	    }
	    
	    Node slow = head, fast = head;
	    
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	        
	        if (slow == fast) break;
	    }
	    
	    return fast;
	}
	
	Node cycleNode(Node head) {
	    Node meet = intersection(head);
	    if (meet == null || meet.next == null) {
	        return null;
	    }
	    
	    Node slow = head, fast = meet;
	    while (slow != fast) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    
	    return slow;
	}
	
	Node getTail(Node head) {
	    Node node = head;
	    
	    while (node.next != null) {
	        node = node.next;
	    }
	    
	    return node;
	}
}
