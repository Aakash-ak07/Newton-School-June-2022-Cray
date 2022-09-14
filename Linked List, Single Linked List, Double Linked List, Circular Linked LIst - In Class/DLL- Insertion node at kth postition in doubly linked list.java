// Given a doubly linked list consisting of N nodes and two integers P and K. 
// Your task is to add an element K at the Pth position from the start of the linked list

      // class Node {
      //     Node next;
      //     Node prev;
      //     int val;

      //     Node(int val) {
      //         this.val = val;
      //         next = null;
      //         prev = null;
      //     }
      // }

public static Node insertnew(Node head,int K, int P) {        
    Node temp = new Node(K);
    Node current = head;

    if(P == 1)  
    {
        temp.next = head;
        head.prev = temp;
        head =  temp;
    }
    else
    {
        for(int i = 2; i <= P-1; i++)
        {
            current = current.next;
        }
        temp.next = current.next;
        temp.prev = current;
        current.next = temp;
        if(temp.next != null)
        {
            temp.next.prev = temp;
        }
    }
    return head;
}

// Sample Input:-
// 5 3 2
// 1 3 2 4 5

// Sample Output:-
// 1 3 2 2 4 5
