// Two numbers are represented in Linked List such that each digit corresponds to a node in linked list. Your task is to add these two numbers and return the sum in a linked list.
// Note:-Linked list representaion of a number is from left to right i.e if the number is 123 than in linked list it is represented as 3->2->1

/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

static Node addNumber(Node first, Node second){
  Node temp = new Node(0);
  Node a = first, b = second, current = temp;
  int carry = 0; 
  while(a != null || b != null)
  {
    int x = (a != null) ? a.data : 0;
    int y = (b != null) ? b.data : 0;
    int sum = carry + x + y;
    carry = sum / 10;
    current.next = new Node(sum % 10);
    current = current.next;
    if(a != null) a = a.next;
    if(b != null) b = b.next;
  }
  if(carry > 0)
  current.next = new Node(carry);

  return temp.next;
}

// Sample Input:-
// 1234 45643


// Sample Output:-
// 46877
