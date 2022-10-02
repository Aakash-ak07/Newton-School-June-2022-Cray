// Given a sorted array arr[] of size N without duplicates, and given a value x. Find the floor of x in given array. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n; i++)
            {
                if(arr[i] <= x)
                    count++;
            }
            if (count >= 1)
                System.out.println(count - 1);
            else
                System.out.println("-1");
        }
    }
}

// Input:
// 3
// 7 0
// 1 2 8 10 11 12 19
// 7 5
// 1 2 8 10 11 12 19
// 7 10
// 1 2 8 10 11 12 19

// Output:
// -1
// 1
// 3

// Explanation:
// Testcase 1: No element less than or equal to 0 is found. So output is "-1".
// Testcase 2: Number less than or equal to 5 is 2, whose index is 1(0-based indexing).
// Testcase 3: Number less than or equal to 10 is 10 and its index is 3.
