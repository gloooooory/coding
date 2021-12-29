/**
 * Link: https://practice.geeksforgeeks.org/problems/circular-linked-list/1#
 * Date: 29 Dec 2021
 * Code #1
*/

import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class CheckCircularLinkedList
{
	Node head;
	
	
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int l = sc.nextInt();
			
			sc.nextLine().trim().split(" ");
			String str[]= sc.nextLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
                
			
			if(l==1 && n>=1)
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next; 
				}
				temp.next = head;
			}
			
			Gfg g = new Gfg();
			boolean b = g.isCircular(head);
			if(b==true)
			System.out.println(1);
			else 
			System.out.println(0);
		t--;
		}
	}
}

// } Driver Code Ends


/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class Gfg
{
    boolean isCircular(Node head)
    {
        if (head == null) return true;
        if (head.next == null) return false;
        
	    Node temp = head;
	    
	    while (temp != null && temp.next != head) {
	        temp = temp.next;
	    }
	    
	    return (temp != null && temp.next == head);
    }
}