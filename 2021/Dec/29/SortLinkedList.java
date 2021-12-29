/**
 * Link: https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1#
 * Date: 29 Dec 2021
 * Code #2
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class SortLinkedList
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node curr = head;
        
        int zeroes = 0, ones = 0, twos = 0;
        
        while (curr != null) {
            switch (curr.data) {
                case 0:
                    zeroes++;
                break;
                case 1:
                    ones++;
                break;
                case 2:
                    twos++;
                break;
            }
            curr = curr.next;
        }
        
        curr = head;
        while (zeroes > 0) {
            zeroes--;
            curr.data = 0;
            curr = curr.next;
        }
        
        while (ones > 0) {
            ones--;
            curr.data = 1;
            curr = curr.next;
        }
        
        while (twos > 0) {
            twos--;
            curr.data = 2;
            curr = curr.next;
        }
        
        return head;
    }
}
