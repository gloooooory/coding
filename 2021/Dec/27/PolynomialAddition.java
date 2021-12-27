/**
 * Link: https://practice.geeksforgeeks.org/problems/polynomial-addition/1#
 * Date: 27 Dec 2021
 * Code #1
*/

import java.util.Scanner;
import java.io.*;
class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class PolynomialAddition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node start1=null,cur1=null,start2=null,cur2=null;
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start1==null)
                {
                    start1=ptr;
                    cur1=ptr;
                }
                else{
                    cur1.next=ptr;
                    cur1=ptr;
                }
            }
            n=sc.nextInt();
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start2==null)
                {
                    start2=ptr;
                    cur2=ptr;
                }
                else{
                    cur2.next=ptr;
                    cur2=ptr;
                }
            }
            Solution obj=new Solution();
            Node sum = obj.addPolynomial(start1,start2);
            for(Node ptr=sum ; ptr != null; ptr=ptr.next  )
            {
                // printing polynomial
                System.out.print(ptr.coeff + "x^" + ptr.pow);
                if(ptr.next != null)
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

//Print the polynomial formed by adding both LL in the function itself.
class Solution
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        if (p1 == null) return p2;
        if (p2 == null) return p1;
        
        Node node = new Node(0, 0);
        Node head = node;
        
        while (p1 != null && p2 != null) {
            if (p1.pow == p2.pow) {
                node.next = new Node(p1.coeff + p2.coeff, p1.pow);
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.pow > p2.pow) {
                node.next = new Node(p1.coeff, p1.pow);
                p1 = p1.next;
            } else {
                node.next = new Node(p2.coeff, p2.pow);
                p2 = p2.next;
            }
            node = node.next;
        }
        
        while (p1 != null) {
            node.next = p1;
            node = node.next;
            p1 = p1.next;
        }
        
        while (p2 != null) {
            node.next = p2;
            node = node.next;
            p2 = p2.next;
        }
        
        return head.next;
    }
}