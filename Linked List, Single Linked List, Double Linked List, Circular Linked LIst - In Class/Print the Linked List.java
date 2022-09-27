// Given a linked list consisting of N nodes, your task is to traverse the list and print its elements.

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
public static void printList(Node head) {
    Node temp = head;
    while(temp != null)
    {
        System.out.print(temp.val + " ");
        temp = temp.next;
    }  
}

// Sample input
// 5
// 2 4 5 6 7

// Sample output
// 2 4 5 6 7

// Sample Input
// 4
// 1 2 3 5

// Sample output
// 1 2 3 5
