/**
 * Link: https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1#
 * Date: 26th Dec 2021
 * Code #1
*/

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class DeleteNNodeAfterMNodes
{
    static Node insert(Node head, int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
          head = temp;
          return head;
        }
        else{
                Node t = head;
            while(t.next != null)
            {
                t = t.next;
            }
            t.next = temp;
        }
        return head;
    }
    
    static void printList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
   public static void main (String[] args)throws IOException {
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(read.readLine());
       
       while(t-- > 0)
       {
           int listSize = Integer.parseInt(read.readLine());
           String str[] = read.readLine().trim().split(" ");
           
           int m = Integer.parseInt(str[0]);
           int n = Integer.parseInt(str[1]);
           
           Node head = null;
           str = read.readLine().trim().split(" ");
           for(int i = 0; i < listSize; i++)
           {
               head = insert(head, Integer.parseInt(str[i]));
           }
          new Solution().linkdelete(head, m, n); 
          printList(head); 
          System.out.println();
       }
   } 
}

// } Driver Code Ends


//User function Template for Java

/*
delete n nodes after m nodes
The input list will have at least one element  
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        if (N == 0) {
            return;
        }
        
        if (M == 0) {
            head = null;
            return;
        }
        
        int i = 1, j = 0;
        Node temp = head;
        while (temp != null) {
            while (i < M && temp != null) {
                temp = temp.next;
                i++;
            }
            
            i = 1;
            Node curr = temp;
            while (j <= N && curr != null) {
                curr = curr.next;
                j++;
            }
            j = 0;
            
            if (temp != null) {
                temp.next = curr;
            }
            temp = curr;
        }
    }
}
