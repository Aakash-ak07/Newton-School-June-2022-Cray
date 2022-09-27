// Given two sorted linked list of size s1 and s2(sizes may or may not be same), your task is to merge them such that resultant list is also sorted.

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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
    Node temp = new Node(0);
    Node current = temp;
    while(head1 != null && head2 != null)
    {
        if(head1.val <= head2.val)
        {
            current.next = head1;
            head1 = head1.next; 
        }
        else
        {
            current.next = head2;
            head2 = head2.next; 
        }
        current = current.next;
    }
    current.next = head1 != null ? head1 : head2;
    return temp.next;
}


// Sample Input:
// 5 6
// 1 2 3 4 5
// 3 4 6 8 9 10

// Sample Output:
// 1 2 3 3 4 4 5 6 8 9 10
