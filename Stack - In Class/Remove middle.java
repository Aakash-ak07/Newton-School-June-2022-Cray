// Given push(), pop() and empty() operations of the stack of size N, remove the middle element of stack.
// Note:
// 1. Please do not use any other data structure.
// 2. Middle - ceil(stack_size/2)

public static Stack<Integer> deleteMid(Stack<Integer> s, int N)
{
    return midDeleteHelper(s, N, 0);
}

public static Stack<Integer>midDeleteHelper(Stack<Integer>s, int n, int count)
{
    if(count == n/2)
    {
        s.pop();
        return s;
    }
    int x = s.peek();
    s.pop();
    count++;

    s = midDeleteHelper(s, n, count);
    s.push(x);
    return s;
}


// Sample Input:
// 5
// 1 2 3 4 5

// Sample Output:-
// 1 2 4 5

// Sample Input:-
// 7
// 1 2 3 4 5 6 7

// Sample Output:-
// 1 2 3 5 6 7
