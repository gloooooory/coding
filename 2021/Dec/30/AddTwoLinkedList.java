/**
 * Link: https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
 * Date: 30 Dec 2021
 * Code #1
*/

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class AddTwoLinkedList {
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    
    static Node addTwoLists(Node first, Node second){
        if (first == null) return second;
        if (second == null) return first;
        
        Node revFirst = reverse(first);
        Node revSecond = reverse(second);

        Node curr = null, result = new Node(0);
        
        int carry = 0;
        
        while (revFirst != null && revSecond != null) {
            int sum = revFirst.data + revSecond.data + carry;
            carry = 0;
            
            if (sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            
            if (curr == null) {
                curr = new Node(sum);
                result = curr;
            } else {
                curr.next = new Node(sum);
                curr = curr.next;
            }
            
            revFirst = revFirst.next;
            revSecond = revSecond.next;
        }
        
        while (revFirst != null) {
            int sum = revFirst.data + carry;
            carry = 0;
            
            if (sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            
            if (curr == null) {
                curr = new Node(sum);
                result = curr;
            } else {
                curr.next = new Node(sum);
                curr = curr.next;
            }
            
            revFirst = revFirst.next;
        }
        
        while (revSecond != null) {
            int sum = revSecond.data + carry;
            carry = 0;
            
            if (sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }
            
            if (curr == null) {
                curr = new Node(sum);
                result = curr;
            } else {
                curr.next = new Node(sum);
                curr = curr.next;
            }
            
            revSecond = revSecond.next;
        }
        
        if (carry > 0) {
            curr.next = new Node(carry);
            carry = 0;
            curr = curr.next;
        }
        
        Node res = reverse(result);
        return res;
    }
    
    static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        
        Node prev = head, curr = head.next;
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
