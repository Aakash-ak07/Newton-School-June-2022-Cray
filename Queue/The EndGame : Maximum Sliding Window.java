// You are given an array A of size N. You have to print the maximum in every K-sized subarray from the left to the right in the array A.
// More formally, you have to print N - K + 1 integers X1, X2, ..., XN-K+1 such that Xi (1 <= i <= N - K + 1) is the maximum element in the subarray Ai, Ai+1, ..., Ai+K-1.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void maxSlidingWindow (int arr[], int n, int k)
    {
        Deque<Integer> Q = new LinkedList<Integer>();
        int i;
        for(i = 0; i < k; ++i)
        {
            while(!Q.isEmpty() && arr[i] >= arr[Q.peekLast()])
                Q.removeLast();
            
            Q.addLast(i);
        }
        for(i = k; i < n; ++i)
        {
            System.out.print(arr[Q.peek()] + " ");

            while((!Q.isEmpty()) && Q.peekFirst() <= (i - k))
                Q.removeFirst();

            while((!Q.isEmpty()) && arr[i] >= arr[Q.peekLast()])
                Q.removeLast();

            Q.addLast(i);
        }
        System.out.print(arr[Q.peekFirst()]);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        maxSlidingWindow(arr, n, k);
    }
}



// Sample Input:-
// 8
// 1 3 -1 -3 5 3 6 7
// 3

// Sample Output:-
// 3 3 5 5 6 7

// Explanation:-
// Window position Max
// - - - -
// [1 3 -1] -3 5 3 6 7 3
// 1 [3 -1 -3] 5 3 6 7 3
// 1 3 [-1 -3 5] 3 6 7 5
// 1 3 -1 [-3 5 3] 6 7 5
// 1 3 -1 -3 [5 3 6] 7 6
// 1 3 -1 -3 5 [3 6 7] 7

// Sample Input:-
// 1
// 1
// 1

// Sample Output:-
// 1
