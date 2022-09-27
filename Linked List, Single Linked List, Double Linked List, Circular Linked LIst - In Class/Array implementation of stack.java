// Your task is to implement a stack using an array and perform given queries
// Note: Description of each query is given in the input and output format


/*
    int top=-1; // index of current top
    int a[] // array which contain element of stack 
*/
// function to add element in the stack
//x=element to be added
//size=maximum size of array
void push(int x,int size)
{
    if(top == size - 1)
    {
        System.out.println("Stack overflow");
        return;   
    }
    top++;
    a[top] = x;
}

// Function to pop element from stack
void pop()
{
    if(top == -1)
    {
        System.out.println("Stack underflow");
    }
    else
    {
        top--;
    }   
}

void top()
{
     if(top == -1)
    {
        System.out.println("Empty stack");
    }
    else
    {
        System.out.println(a[top]);
    }   
}

// Sample Input:-
// 6 3
// pop
// push 3
// push 2
// push 4
// push 6
// top

// Sample Output:-
// Stack underflow
// Stack overflow
// 4
