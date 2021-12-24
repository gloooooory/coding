/**
 * Link: https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1#
 * Date: 24 Dec 2021
 * Code #5
*/

import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
}

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int count = 0;
        
        while (head != null) {
            count++;
            head = head.next;
        }
        
        return count;
    }
}
    

// { Driver Code Starts.
class CountNodesOfLinkedList {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution ob = new Solution();
            System.out.println(ob.getCount(head));
        }
    }
   
    
    
    
}

  // } Driver Code Ends