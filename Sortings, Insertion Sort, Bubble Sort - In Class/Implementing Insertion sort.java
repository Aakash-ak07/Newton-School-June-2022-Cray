// Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void insertSort (int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            insertSort(arr);
        }
    }
}


// Input:
// 2
// 5
// 4 1 3 9 7
// 10
// 10 9 8 7 6 5 4 3 2 1

// Output:
// 1 3 4 7 9
// 1 2 3 4 5 6 7 8 9 10

// Explanation:
// Testcase 1: The array after perfoming insertion sort: 1 3 4 7 9.
// Testcase 2: The array after performing insertion sort: 1 2 3 4 5 6 7 8 9 10.
