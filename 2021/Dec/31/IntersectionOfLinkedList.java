/**
 * Link: https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1
 * Date: 31 Dec 2021
 * Code #2
*/

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class IntersectionOfLinkedList
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        Node res = new Node(0);
        Node head = res;
        
        Set<Integer> set = new HashSet<>();
        
        Node curr = head2;
        
        while (curr != null) {
            set.add(curr.data);
            curr = curr.next;
        }
        
        while (head1 != null) {
            if (set.contains(head1.data)) {
                res.next = new Node(head1.data);
                res = res.next;
            }
            head1 = head1.next;
        }
        
        return head.next;
    }
}
