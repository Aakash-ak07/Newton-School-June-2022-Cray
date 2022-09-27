// Given a singly linked list and an element K, your task is to insert the element at the tail of the linked list.

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
    Node temp = new Node(k);
    Node current = head;
    while(current.next != null)
    {
        current = current.next;
    }
    current.next = temp;
    return head;
}

// Sample Input:-
// 5 2
// 1 2 3 4 5

// Sample Output:
// 1 2 3 4 5 2
