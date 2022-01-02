/**
 * Link: https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1
 * Date: 02 Jan 2022
 * Code #1
*/

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}

public class RotateDoublyLinkedList {
    
    static void display(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		       
		    //Entering the data
		    Node head = new Node(sc.nextInt());
		    Node ptr = head, curr = null;
		    
		    //Entering the rest of the list
		    for(int i=0; i<n-1; i++){
		        int d = sc.nextInt();
		        curr = new Node(d);
		        ptr.next = curr;
		        ptr = curr;
		    }
            
            Gfg obj = new Gfg();
            display(obj.rotateP(head, p));
		}
	}

}
// } Driver Code Ends


//User function Template for Java

/*
class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}
*/

class Gfg {
    Node rotateP (Node head, int p){
        Node tail = head;
        int count = 0;
        
        Node limit = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        for (int i = 1; i < p; i++) {
            limit = limit.next;
        }
        
        tail.next = head;
        head.prev = tail;
        head = limit.next;
        head.prev = null;
        limit.next = null;
        
        return head;
    }
}
