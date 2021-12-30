/**
 * Link: https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#
 * Date: 30 Dec 2021
 * Code #2
*/

import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class Add1ToLinkedList
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    {
        if (head == null) return head;
        
        Node rev = reverse(head);
        Node curr = rev;
        Node prev = null;
        
        int carry = 1;
        
        do {
            int sum = curr.data + carry;
            if (sum < 10) {
                carry = 0;
                curr.data = sum;
                break;
            } else {
                carry = sum / 10;
                sum = sum % 10;
                curr.data = sum;
                prev = curr;
                curr = curr.next;
            }
        } while(carry != 0 && curr != null);
        
        if (carry != 0) {
            if (curr != null) {
                curr.next = new Node(carry);
                curr = curr.next;
            } else {
                prev.next = new Node(carry);
            }
            carry = 0;
        }
        
        // printList(rev);
        return reverse(rev);
    }
    
    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        
        Node curr = head.next, prev = head;
        prev.next = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
