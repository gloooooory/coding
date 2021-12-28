/**
 * Link: https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1#
 * Date: 28 Dec 2021
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

class PalindromeLinkedList
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			PalindromeLinkedList llist = new PalindromeLinkedList();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}



// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {   
        if (head == null || head.next == null) return true;
        
        if (head.next.next == null) {
            return head.data == head.next.data;
        }
        
        Node mid = middle(head);
        
        int len = length(head);
        
        Node rev = reverse((len % 2 == 0) ? mid : mid.next);
        
        while (head != null && rev != null) {
            if (head.data != rev.data) return false;
            head = head.next;
            rev = rev.next;
        }
        
        return true;
    }
    
    Node middle(Node head) {
        Node slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    Node reverse(Node head) {
        Node prev = null, curr = head;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    int length(Node head) {
        int count = 0;
        
        while (head != null) {
            count++;
            head = head.next;
        }
        
        return count;
    }
}
