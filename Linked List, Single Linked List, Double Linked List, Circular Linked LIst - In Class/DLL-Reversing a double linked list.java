// Given a double linked list with consisting of N nodes, your task is to reverse the linked list and return the head of the modified list.

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
public static Node Reverse(Node head) {
  Node data1 = head;
  Node data2 = data1.next;

  data1.next = null;
  data1.prev = null;
  while(data2 != null)
  {
    data2.prev = data2.next;
    data2.next = data1;
    data1 = data2;
    data2 = data2.prev;
  }
  head = data1;
  return head;
}


// Input:
// 6
// 1 2 3 4 5 6

// Output:
// 6 5 4 3 2 1

// Explanation:
// After reversing the list, elements are as 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> 1.
