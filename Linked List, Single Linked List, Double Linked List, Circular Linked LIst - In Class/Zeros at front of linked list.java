// Given a linked list, the task is to move all 0’s to the front of the linked list. The order of all another element except 0 should be same after rearrangement.


// class Node{
//     int data;
//     Node next;
//     Node(int d){
//         data=d;
//         next=null;
//     }
// }

static public Node moveZeroes(Node head)
{
    if(head == null)    return null;

    Node temp = head.next;
    Node prev = head;
    while(temp != null)
    {
        if(temp.data == 0)
        {
            Node current = temp;
            temp = temp.next;
            prev.next = temp;

            current.next = head;
            head = current;
        }
        else
        {
            prev = temp;
            temp = temp.next;
        }
    } 
    return head;
}


// Input:
// 2
// 10
// 0 4 0 5 0 2 1 0 1 0
// 7
// 1 1 2 3 0 0 0

// Output:
// 0 0 0 0 0 1 1 2 5 4
// 0 0 0 3 2 1 1

// Explanation:
// Testcase 1:
// Original list was 0->4->0->5->0->2->1->0->1->0->NULL.
// After processing list becomes 0->0->0->0->0->4->5->2->1->1->NULL.

// Testcase 2:
// Original list was 1->1->2->3->0->0->0->NULL.
// After processing list becomes 0->0->0->1->1->2->3->NULL.
