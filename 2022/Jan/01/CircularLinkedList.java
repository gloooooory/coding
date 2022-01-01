/**
 * Link: https://practice.geeksforgeeks.org/problems/circular-linked-list-traversal/1#
 * Date: 01 Jan 2022
 * Code #1
*/

import java.util.*;

class CircularLinkedList {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            Node head = new Node(0);
            Node curr = head;
            int n = kb.nextInt();

            while (n-- > 0) {
                curr.next = new Node(kb.nextInt());
                curr = curr.next;
            }
            curr.next = head.next;

            Solution s = new Solution();
            s.printList(head.next);
        }
        kb.close();
    }
}

class Solution {
    public void printList(Node head) {
        Node temp = head;
        StringBuilder sb = new StringBuilder();

        sb.append(temp.data + " ");
        temp = temp.next;

        while (temp != head) {
            sb.append(temp.data + " ");
            temp = temp.next;
        }

        System.out.println(sb.toString());
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
