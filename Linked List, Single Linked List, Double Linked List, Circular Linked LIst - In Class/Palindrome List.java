// Given a linked list consisting of N nodes, your task is to check if the given list is palindrome or not.
// A palindrome is a string/number that mirrors itself, for example, 21312 reverse is also 21312.

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
public static boolean IsPalindrome(Node head) {
    if(head == null)
        return true;
    
    Node mid = Middle(head);
    Node last = reverse(mid.next);
    Node current = head;
    
    while(last != null)
    {
        if(last.val != current.val)
            return false;
        last = last.next;
        current = current.next;
    }
    return true;
}
public static Node Middle(Node head)
{
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
public static Node reverse(Node head)
{
    if(head == null || head.next == null)
    {
        return head;
    }
    Node newData = reverse (head.next);
    Node dataNext = head.next;
    dataNext.next = head;
    head.next = null;
    return newData;
}

// Sample Input 1:-
// 5
// 1 2 3 2 1

// Sample Output 1:-
// Yes

// Sample Input 2:-
// 3
// 1 2 2

// Sample Output 2:-
// No
