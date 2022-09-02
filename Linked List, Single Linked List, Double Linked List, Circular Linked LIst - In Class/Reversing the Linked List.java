// Given a linked list of N nodes. The task is to reverse the list by changing links between nodes 
// (i.e if the list is 1->2->3->4 then it becomes 1<-2<-3<-4) and return the head of the modified list.

// 1. using iteration
public static Node ReverseLinkedList(Node head) {
	// return the head of the modified linked list
    Node prev = null;
    Node current = head;
    while(current != null)
    {
        Node temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
    }
    return prev;
}


//2nd method using recursion
public static Node ReverseLinkedList(Node head) {
    if(head == null || head.next == null)
        return head;

    Node newData = ReverseLinkedList (head.next);
    Node dataNext = head.next;
    dataNext.next = head;
    head.next = null;
    return newData;
}

// 3 recursion method
public static Node ReverseLinkedList(Node head) {
    if(head == null || head.next == null)
        return head;

    Node result = ReverseLinkedList(head.next);
    head.next.next = head;

    head.next = null;
    return result;  
}

// Input-1:
// 6
// 1 2 3 4 5 6

// Output-1:
// 6 5 4 3 2 1
// Explanation:
// After reversing the list, elements are as 6->5->4->3->2->1.

// Input-2:
// 5
// 1 2 8 4 5

// Output-2:
// 5 4 8 2 1
