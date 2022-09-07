//You are given a Singly linked list and an integer K. Your task is to insert the integer K at the head of the given linked list

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
    
    Node add = new Node(k);
    add.next = head;
    head = add; 

    return head;
}


// Sample Input:-
// 5 2
// 1 2 3 4 5

// Sample Output:
// 2 1 2 3 4 5
