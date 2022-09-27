// Given an array A of N integers, For each i (1 ≤ i ≤ N) your task is to find the value of x+y,
// where x is the largest number less than i such that A[x]>A[i] and (A[x] is the element present at position x.)
// y is the smallest number greater than i such that A[y]>A[i]
// If there is no x < i such that A[x] > A[i], then take x=−1. Similarly, if there is no y>i such that A[y]>A[i], then take y=−1.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Pair{
    long first;
	long second;
	Pair(long first, long second)
    {
		this.first = first;
		this.second = second;
	}
}
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Pair> st = new Stack<>();
        Stack<Pair> st2 = new Stack<>();
        long arr[] = new long[n];
        long arr2[] = new long[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
            while(!(st.empty()))
            {
                if(st.peek().first > arr[i])
                    break;
                st.pop();
            }
            if(st.empty())
                arr2[i] = -1l;

            else
                arr2[i] = st.peek().second + 1;

            Pair p = new Pair(arr[i], i);
            st.push(p);
        }
        for(int i = n-1; i >= 0; i--)
        {
            while(!(st2.empty()))
            {  
                if(st2.peek().first > arr[i])
                    break;
                st2.pop();
            } 
            if(st2.empty())
                arr2[i] += -1;

            else
                arr2[i] += st2.peek().second + 1;

            Pair p = new Pair(arr[i], i);
            st2.push(p);
        }
        for(int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");
    }
}

// Sample Input
// 5
// 5 4 1 3 2

// Sample Output
// -2 0 6 1 3

// Explanation:-
// For element 5:- x=-1(No element exist greater than 5 in left), y=-1 (No element exist greater than 5 in right)
// For element 4:- x=1, y=-1
// For element 1:- x=2, y=4
// For element 3:- x=2, y=-1
// For element 2:- x=4, y=-1

// Sample Input
// 5
// 6 4 6 8 2

// Sample Output
// 3 4 3 -2 3
