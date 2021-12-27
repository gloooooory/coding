/**
 * Link: https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
 * Date: 27 Dec 2021
 * Code #2
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
class InsertInSortedList {
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
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        Node newNode = new Node(key);
        
        if (head1 == null) return newNode;
        
        Node curr = head1;
        
        if (key <= head1.data) {
            newNode.next = head1;
            return newNode;
        }
        
        Node prev = head1;
        
        while (curr != null && key > curr.data) {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = newNode;
        newNode.next = curr;
        
        return head1;
    }
}