/**
 * Link: https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list/1#
 * Date: 04 Jan 2022
 * Code #4
*/

import java.util.*;

class ImplementQueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            
            Solution s = new Solution();
            s.
        }
    }
}

import java.util.*;
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class GfG {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends


/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        if (front == null) {
            front = new QueueNode(a);
            rear = front;
        } else {
            rear.next = new QueueNode(a);
            rear = rear.next;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if (front == null || rear == null) return -1;
        int val = front.data;
        
        if (front == rear) {
            front = null;
            rear = null;
            return val;
        }
        
        front = front.next;
        return val;
	}
}
