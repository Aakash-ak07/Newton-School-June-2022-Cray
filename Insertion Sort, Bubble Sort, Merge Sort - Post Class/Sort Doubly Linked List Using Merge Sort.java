// The head of the doubly linked list will be given to you, and you must sort it using merge sort.

Node mergeSort(Node node, int n) {
  if(node.next == null)
      return node;
   
   Node mid = findMid(node);
   Node head = mid.next;
   mid.next = null;
   Node temp = mergeSort(node, n);
   Node temp2 = mergeSort(head, n);
   Node tempHead = merge(temp, temp2);

   return tempHead;
}

static Node merge(Node head1, Node head2)
{
   Node merged = new Node(-1);
   Node temp = merged;
   // while head1 is not null and head2
   // is not null
   while(head1 != null && head2 != null)
   {
      if(head1.data < head2.data)
      {
         temp.next = head1;
         head1 = head1.next;
      }
      else
      {
         temp.next = head2;
         head2 = head2.next;
      }
      temp = temp.next;
   }
   while(head1 != null)
   {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
   }
   while(head2 != null)
   {
      temp.next = head2;
      head2 =head2.next;
      temp = temp.next;
   }
   return merged.next;
}

static Node findMid(Node head)
{
   Node slow = head, fast = head.next;
   while(fast != null && fast.next != null)
   {
      slow = slow.next;
      fast = fast.next.next;
   }
   return slow;
}
static void display (Node head)
{
   while(head != null)
   {
      System.out.print(head.next + " ");
      head = head.next;
   }
}


// Sample Input:
// 5
// 3 2 1 3 2
// Output:
// 1 2 2 3 3
