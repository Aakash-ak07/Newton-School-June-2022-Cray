// Given an sorted array Arr[] of size N, containing both negative and positive integers, you need to print the squared sorted output.
// Note: Try using two pointer approach

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void sqrtSorted (int [] arr, int n)
    {
        int left = 0, right = n-1;

        int [] result = new int [n];  
        for(int i = n - 1; i >= 0; i--)   //i --> index no.
        {
            if (Math.abs(arr[left]) > arr[right])
            {
                result[i] = arr[left] * arr[left];
                left++;
            }
            else 
            {
                result[i] = arr[right] * arr[right];
                right--;
            }
        }
        for(int k = 0; k < n; k++)
        {
            arr[k] = result[k];
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            sqrtSorted(arr, n);
            // System.out.println();
            for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

// Input:
// 1
// 5
// -7 -2 3 4 6

// Output:
// 4 9 16 36 49
