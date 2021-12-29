/**
 * Link: https://practice.geeksforgeeks.org/problems/find-length-of-loop/1#
 * Date: 29 Dec 2021
 * Code #4
*/

// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

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

class FindLengthOfLoop
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}
// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        if (head == null || head.next == null) return 0;
        
        Node slow = head, fast = head;
        boolean isLoop = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                isLoop = true;
                break;
            }
        }
        
        // 1 -> 2 -> 3 -> 4 
        //      |         |
        //       _________
        
        if (isLoop) {
            slow = head;
            
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            
            Node loopNode = slow;
            
            int count = 1;
            
            while (fast.next != loopNode) {
                count++;
                fast = fast.next;
            }
            return count;
        }
        
        return 0;
    }
}