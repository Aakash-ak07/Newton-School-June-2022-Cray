// Given an integer array arr[] of size N and an element X. The task is to find and print the indices of the given element if it is present in array if not then print “Not found” without quotes.
// Note: The elements may be present more than once.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t >= 1)
        {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int [] arr = new int[N];

            for(int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }
            boolean findPosX = false;
            for (int i = 0; i < N; i++)
            {
                if (arr[i] == X)
                {
                    System.out.print(i + " ");
                    findPosX = true;
                }
            }
            if(! findPosX)
            {
                System.out.print("Not found");
            }
            System.out.println();
            t--;
        }
    }
}

// Input:
// 2
// 5 6
// 2 3 6 5 6
// 4 3
// 2 4 6 5

// Output:
// 2 4
// Not found
