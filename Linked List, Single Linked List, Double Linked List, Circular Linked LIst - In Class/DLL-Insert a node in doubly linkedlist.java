// Given a reference to the head of a sorted doubly-linked list and an integer k, your task is to insert the integer k in your doubly linked-list while maintaining the sort.

/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) {  
    Node newNode = new Node(k);
    if(head == null)
        head = newNode;
    
    else if (head.val >=newNode.val)
    {
        newNode.next = head;
        newNode.next.prev = newNode;
        head = newNode;
    }
    else
    {
        Node temp = head;
        while(temp.next != null && temp.next.val < newNode.val)
            temp = temp.next;
        
        newNode.next = temp.next;

        if(temp.next != null)
            newNode.next = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }
    return head;
}

// Sample Input
// 1
// 4
// 1
// 3
// 4
// 10
// 5

// Sample Output
// 1 3 4 5 10
