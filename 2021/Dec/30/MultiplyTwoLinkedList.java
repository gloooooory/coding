/**
 * Link: https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1#
 * Date: 30 Dec 2021
 * Code #3
*/

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class MultiplyTwoLinkedList {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Node head=null;
			Node phead=null;
			int n=sc.nextInt();
			while(n-->0){
				int n1=sc.nextInt();
				if(head==null)
				head=new Node(n1);
			else{
				addHead(head,n1);
			}
			}
			int m=sc.nextInt();
			while(m-->0){
				int n1=sc.nextInt();
				if(phead==null)
				phead=new Node(n1);
			else{
				addPhead(phead,n1);
			}
			}
		GfG g=new GfG();

System.out.println(g.multiplyTwoLists(head,phead));
		}
	}
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
	public static void addPhead(Node node,int a){
		 if (node == null)
            return;
		if(node.next==null)
		node.next=new Node(a);
	else
		addPhead(node.next,a);
	}
	}
	
	// } Driver Code Ends


/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
       long mod = (long)(1e9 + 7);
       
       long a = 0, b = 0;
       
       while (l1 != null) {
           a = (a * 10 + l1.data) % mod;
           l1 = l1.next;
       }
       
       while (l2 != null) {
           b = (b * 10 + l2.data) % mod;
           l2 = l2.next;
       }
       
       long res = ((a % mod) * (b % mod)) % mod;
       return (res % mod);
   }
}