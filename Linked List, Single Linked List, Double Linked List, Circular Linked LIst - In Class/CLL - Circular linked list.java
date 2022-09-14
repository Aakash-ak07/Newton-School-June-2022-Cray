//Given a linked list consisting of N nodes, your task is to check if the given list is circular or not.


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

public static int check(Node head) {
    Node current = head;
    while(current.next != head || current.next != null)
    {
        current = current.next;
        if(current.next == head)
            return 1;
    }
    return 0;
}


// Sample Input 1:-
// 3 0
// 1 2 3

// Sample Output 1:-
// 0

// Explanation:-
// 1->2->3

// Sample Input 2:-
// 3 1
// 1 2 3

// Sample Output 2:-
// 1

// Explanation:-
// 1->2->3->1.......
