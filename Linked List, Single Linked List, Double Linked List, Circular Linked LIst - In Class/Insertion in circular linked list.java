// Given a circular linked list consisting of N nodes and an integer K, your task is to add the integer K at the end of the list.

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

public static Node Insertion(Node head, int K){
    Node temp = head;
    while(temp.next != head)
    {
        temp = temp.next;
    }

    Node data = new Node(K);
    temp.next = data;
    data.next = head;
    return head;
}

// Sample Input 1:-
// 3
// 1- >2- >3
// 4

// Sample Output 1:-
// 1- >2- >3- >4
