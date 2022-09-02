// Given a singly linked list, delete middle node of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
// If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. 
// For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
// In case of a single node return the head of a linked list containing only 1 node which has value -1

public static Node deleteMiddleElement(Node head) {
	if(head == null || head.next == null)
        return null;
    
    Node slow, fast, prev;
    slow = fast = prev = head;

    while(fast != null && fast.next != null)
    {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    prev.next = slow.next;
    return head;
}



// Sample Input 1:
// 5
// 1 2 3 4 5

// Sample Output:
// 1 2 4 5
// Explanation: After deleting middle of the linked list, 3 will be deleted and the list will be as 1, 2, 4, 5.

// Sample Input 2:
// 6
// 1 2 3 4 5 6

// Sample Output:-
// 1 2 3 5 6
