/**
 * Link: https://practice.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1
 * Date: 01 Jan 2022
 * Code #3
*/

import java.util.*;

class Node
{
    int data;
    Node next, prev;
    
    Node(int item)
    {
        data = item;
        next = prev = null;
    }
}

class InsertInSortedList
{
    public static boolean isChecked(Node head)
    {
        int lengthF=0;
        int lengthB=0;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            lengthF++;
        }
        
        while(temp.prev!=null)
        {
            temp=temp.prev;
            lengthB++;
        }
        
        return lengthF==lengthB? true:false;
    }
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        
	        Node head=null, tail=null;
	        
	        for (int i = 0;i < n;i++)
	        {
	            int a = sc.nextInt();
	            if (head==null) 
	            {
	                head = new Node(a);
	                tail = head;
	            }
	            else
	            {
	                tail.next=new Node(a);
	                tail.next.prev=tail;
	                tail = tail.next;
	            }
	        }
	        
	        int x = sc.nextInt();
	        GfG gfg = new GfG();
	         head =  gfg.sortedInsert(head, x);
	         
	        if(isChecked(head))
	        printList(head);
	        else
	        System.out.print("The node has not been inserted correctly. Please fix the prev and next pointers");
	        System.out.println();
	    }
	}
	
	public static void printList(Node head)
	{
	    Node temp = head;
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	}
}
// } Driver Code Ends


/*class of the node of the DLL is as
class Node {
	int data;
    Node prev, next;
    Node(int item)
    {data = item;
        next = prev = null;
    }
}
*/
// function should insert a new node in sorted way in
// a sorted doubly linked list
class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        Node n=new Node(x);
        if(head.data>x) {
            n.next=head;
            head.prev=n;
            head=n;
            return head;
        } else {
            int count=0; //insert at mid
            Node ite=head.next;
            Node prev1=head;
            
            while (ite!=null) {
                if(ite.data>=x) {
                    prev1.next=n;
                    n.prev=prev1;
                    n.next=ite;
                    ite.prev=n;
                    count++;
                    break;
                }
                prev1=ite;
                ite=ite.next;
            }
            
            if(count==0) {
                prev1.next=n;
                n.prev=prev1;
            }
        }
        return head;
    }
}