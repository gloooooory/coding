/**
 * Link: https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1#
 * Date: 02 Jan 2022
 * Code #3
*/

import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class ImplementStackUsingLinkedList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}
// } Driver Code Ends


class MyStack 
{
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        
        return val;
    }
}
