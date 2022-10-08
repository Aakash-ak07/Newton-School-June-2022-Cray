// You are given head which is a reference node to a doubly- linked list of integers. Complete the function sortedInsertion which inserts value in sorted doubly linked list such that the list is sorted after insertion.

/*
class Node
{
   int data;
   Node next, prev;
};
*/
static Node sortedInsertion(Node head, Node newNode)
{
   if(head == null)
      head = newNode;
   
   //if found in head
   else if(head.data >= newNode.data)
   {
      newNode.next = head;
      newNode.next.prev = newNode;
      head = newNode;
   }
   else
   {
      Node temp = head;
      while(temp.next != null && temp.next.data < newNode.data)
      {
         temp = temp.next;
      }
      newNode.next = temp.next;
      if(temp.next != null)
      {
         newNode.next.prev = newNode;     //if temp is not the last Node
      }
      temp.next = newNode;
      newNode.prev = temp;
   }
   return head;
}


// Sample Input 1:-
// 3 2
// 1 2 3

// Sample Output 1:-
// 1 2 2 3

// Explanation:
// We will add 2 at index 2. So, our list is sorted and we successfully inserted the value 2.

// Sample Input 2:-
// 2 0
// 1 2

// Sample Output 2:-
// 0 1 2

// Explanation:
// We will insert 0 at index 0. So, our list is sorted and we successfully inserted the value 0.
