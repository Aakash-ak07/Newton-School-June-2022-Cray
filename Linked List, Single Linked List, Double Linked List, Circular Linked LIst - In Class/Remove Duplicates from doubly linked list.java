// Given a sorted doubly linked list containing n nodes. Your task is to remove duplicate nodes from the given list.

// Example 1:
// Input
// 1<->2<->2-<->3<->3<->4

// Output:
// 1<->2<->3<->4

// Example 2:
// Input
// 1<->1<->1<->1

// Output
// 1

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
public static Node deleteDuplicates(Node head) {
  if(head == null || head.next == null)
    return head;
  
  Node a, b;
  for(a  = head; a != null; a = a.next)
  {
    b = a.next;
    while(b != null)
    {
      if(a.val == b.val)
      {
        Node temp = b.next;
        head = deleteNode(head, b);
        b = temp;
      }
      else
        b = b.next;
    }
  }
  return head;
}

static Node deleteNode(Node head, Node x)
{
  if(head == null ||x == null)
    return head;
  
  if(head == x)
    head = x.next;
  
  if(x.next != null)
    x.next.prev = x.prev;
  
  if(x.prev != null)
    x.prev.next = x.next;
  
  return head;
}
