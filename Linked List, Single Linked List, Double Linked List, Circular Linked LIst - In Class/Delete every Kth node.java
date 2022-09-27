// Given a linked list consisting of N nodes, your task is to delete every kth Node from the circular linked list until only one node is left. Also, print the intermediate lists

// Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input


/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static void printCircularList(Node head)
{
   // System.out.print(head.data);
    Node s=head;
    int k=0;
    while(s!=head || k==0)
    { 
        k++;
        System.out.print(s.data+"->");
        s=s.next;
    }
    System.out.print(s.data);
    System.out.println();
}

static Node deleteK(Node head, int k){
    printCircularList(head);
    int x = 0;
    Node temp = null;
    Node current = head;
    while(current != current.next)
    {
        if(x == k)
        {
            temp.next = current.next;
            x = 0;
            if(current == head) 
                head = current.next;
            
            printCircularList(head);
        }
        temp = current;
        x++;
        current = current.next; 
    }     
    return head;
}
