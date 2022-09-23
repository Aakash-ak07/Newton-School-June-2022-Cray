// Given an array A of size N, the task is to find the nearest greater element G[i] for every element of A[i] such that the element has index greater than i, If no such element exists, output -1.
// More formally:
// G[i] for an element A[i] = an element A[j] such that
// j is minimum possible AND
// j > i AND
// A[j] > A[i]

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && arr[st.peek()] < arr[i])
                arr[st.pop()] = arr[i];
            st.push(i);
        }
        while(!st.isEmpty())
        {
            arr[st.pop()]=-1;
        }
        for(int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    }
}


// Sample Input
// 4
// 1 3 2 4

// Sample Output
// 3 4 4 -1

// Sample Input
// 4
// 4 3 2 1

// Sample Output
// -1 -1 -1 -1
