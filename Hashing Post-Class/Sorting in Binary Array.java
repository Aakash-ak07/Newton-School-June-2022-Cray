// Given a binary array A[] of size N. The task is to arrange an array in increasing order.
// (O(N) time complexity solution)

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void binaryArray (int [] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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
        binaryArray(arr, n);
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

// Input:
// 5
// 1 0 1 1 0

// Output:
// 0 0 1 1 1
