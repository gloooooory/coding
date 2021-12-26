/**
 * Link: https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1#
 * Date: 26th Dec 2021
 * Code #3
*/

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class RearrangeLinkedList {
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          Node evenHead = head.next;
          
          Node node = head;
          Node evenNode = evenHead;
          
          while (node != null && node.next != null && evenNode != null && evenNode.next != null) {
              node.next = node.next.next;
              evenNode.next = evenNode.next.next;
              
              node = node.next;
              evenNode = evenNode.next;
          }
          
          node.next = evenHead;
     }
}
