// You are given a Doubly linked list and an integer K . Your task is to insert the integer K at the head of the given linked list

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
    Node temp = new Node(k);
    temp.next = head;
    head.prev = temp;
    head = temp;

    return head; 
}

// Sample Input:-
// 5 2
// 1 2 3 4 5

// Sample Output:
// 2 1 2 3 4 5
