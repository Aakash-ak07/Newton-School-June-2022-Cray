// You are given head which is a reference node to a doubly- linked list of integers and an integer K. Complete the function swapNodes which swaps the values of nodes at distance K from beginning and end. The first node is at distance 1 from beginning.

/*
class Node
{
   int data;
   Node next, prev;
};
*/
static void swapNodes(Node head,int k)
{
    Node temp = new Node();
    Node x = temp, y = temp;
    Node a = head, b = head;
    temp.next = head;

    //find parent - x
    int count = 0;
    while(++count < k)
    {
        x = x.next;
        a = a.next;
    }

    //find parent - y
    while(a.next != null)
    {
        a = a.next;
        y = y.next;
        b = b.next;
    }
    swap(x, y);
    return ;
}

static void swap(Node x, Node y)
{
    //swap parent
    Node a = x.next, b = y.next;
    x.next = b;
    y.next = a;

    //swap child
    Node temp = a.next;
    a.next = b.next;
    b.next = temp;
}


// Sample Input 1:-
// 5 2
// 1 2 3 4 5

// Sample Output 1:-
// 1 4 3 2 5

// Explanation:
// The node at distance 2 from beginning is 2.
// The node at distance 2 from end is 4.
// We will swap 2 and 4.

// Sample Input 2:-
// 3 2
// 1 2 3

// Sample Output 2:-
// 1 2 3

// Explanation:
// The node at distance 2 from beginning is 2.
// The node at distance 2 from end is 2.
// We will swap 2 and 2. So, the linked list remains as it is.
