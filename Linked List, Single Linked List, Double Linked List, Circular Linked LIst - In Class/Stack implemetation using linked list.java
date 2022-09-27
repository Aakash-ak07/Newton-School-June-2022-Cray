// Your task is to implement a stack using a linked list and perform given queries
// Note:-if stack is already empty than pop operation will do nothing and 0 will be printed as a top element of stack if it is empty.

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

Node top = null;
public void push(int x){
    Node temp = new Node(x);
    temp.next = top;
    top = temp;
}

public void pop(){
    if(top != null)
        top = top.next;
}

public void top(){
    if(top == null)
        System.out.println(0);
    else
        System.out.println(top.val);
}


// Input:
// 7
// push 1
// push 2
// top
// pop
// top
// pop
// top

// Output:
// 2
// 1
// 0
