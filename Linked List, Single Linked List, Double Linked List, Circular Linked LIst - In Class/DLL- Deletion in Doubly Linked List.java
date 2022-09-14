// Given a Doubly linked list consisting of N nodes and given a number K. The task is to delete the Kth node from the end of the linked list.

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

public static Node deleteElement(Node head,int k) {
    Node temp = new Node(-1);
    temp.next = head;

    Node data1 = temp;
    Node data2 = temp;
    for(int i = 0; i < k; i++)
    {
        data1 = data1.next;
    }
    while(data1.next != null)
    {
        data1 = data1.next;
        data2 = data2.next;
    }
    data2.next = data2.next.next;
    if(data2.next != null)
    {
        data2.next.prev = data2;
    }
    return temp.next;
}

// Input:
// 5 3
// 1 2 3 4 5

// Output:
// 1 2 4 5

// Explanation:
// After deleting 3rd node from the end of the linked list, 3 will be deleted and the list will become 1, 2, 4, 5.
