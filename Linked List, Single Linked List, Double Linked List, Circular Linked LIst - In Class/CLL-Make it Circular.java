// Given a singly linked list consisting of N Nodes, your task is to convert it into a circular linked list.
// Note:- For custom input you will get 1 if your code is correct else you get a 0.
  
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

public static Node MakeCircular(Node head) {
    Node temp = head;
    while(temp.next != null)
    {
        temp = temp.next;
    }
    temp.next = head;
    return head;
}

// Sample Input 1:-
// 1- >2- >3

// Sample Output 1:-
// 1- >2- >3- >1

// Sample Input 2:-
// 1- >3- >2

// Sample Output 2:-
// 1- >3- >2- >1
