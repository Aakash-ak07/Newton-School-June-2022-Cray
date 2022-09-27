// Given a circular linked list consisting of N nodes, your task is to exchange the first and last node of the list.
// Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input

// Constraints:
// 3 <= N <= 1000
// 1 <= Node. data<= 1000

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
public static Node exchangeNodes(Node head) {
    if(head.next.next == head)
    {
        head = head.next;
        return head;
    }
    Node temp = head;
    while(temp.next.next != head)
        temp = temp.next;
    
    temp.next.next = head.next;
    head.next = temp.next;
    temp.next = head;
    head = head.next;
    return head;
}

// Sample Input 1:-
// 3
// 1- >2- >3

// Sample Output 1:-
// 3- >2- >1

// Sample Input 2:-
// 4
// 1- >2- >3- >4

// Sample Output 2:-
// 4- >2- >3- >1
