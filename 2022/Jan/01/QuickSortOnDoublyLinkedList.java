/**
 * Link: https://practice.geeksforgeeks.org/problems/quicksort-on-doubly-linked-list/1#
 * Date: 01 Jan 2022
 * Code #4
*/

import java.util.*;
import java.lang.*;

class Node
{
    int data;
	Node next;
	Node prev;
	
	Node(int val)
	{
		data = val;
		next = prev = null;
	} 
}

class QuickSortOnDoublyLinkedList
{
    static Node head;
    
    public static void addToTheLast(Node node)
	{
		if(head == null)
			head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = node;
			node.prev = temp;
			
		}
	}
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
			Node head = new Node(a1);
			addToTheLast(head);
			for(int i = 1; i < n; i++)
			{
			    int a = sc.nextInt();
			    addToTheLast(new Node(a));
			}
			
			quickSort(head);
			printList(head);
			System.out.println();
	    }
	}
	
	public static void quickSort(Node head)
	{
	    Node h = lastNode(head);
	    _quickSort(head, h);
	}
	
	public static Node lastNode(Node node)
	{
	    while(node != null && node.next != null)
	      node = node.next;
	      
	      return node;
	}
	
	public static void _quickSort(Node l, Node h)
	{
	    GfG gfg = new GfG();
	    if (h != null && l != h && l != h.next)
    {
        Node p = gfg.partition(l, h);
        _quickSort(l, p.prev);
        _quickSort(p.next, h);
    }
	}
	
	
	
	public static void printList(Node node)
	{
	    while(node != null)
	    {
	        System.out.print(node.data + "  ");
	        node = node.next;
	    }
	}
}// } Driver Code Ends


class GfG
{
    public static Node partition(Node l, Node h)
    {
        if(l == h) return l;
        else {
            Node tempNode = l, curr = l;
            int pivot = h.data;
            while(tempNode.next != null){
                if (tempNode.data < pivot) {
                    int temp = tempNode.data;
                    tempNode.data = curr.data;
                    curr.data = temp;
                    curr = curr.next;
                }
                tempNode = tempNode.next;
            }
            int temp = h.data;
            h.data = curr.data;
            curr.data = temp;
        
            return curr;
        }
    }
}
