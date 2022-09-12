// Given an array A[] of size N containing non-negative integers. You have to move all 0's to the end of array while maintaining the relative order of the non-zero elements.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int z = 0; z < n; z++)
            {
                arr[z] = sc.nextInt();
            }
            int j = 0;
            for(int i = 0; i < n; i++)
            {
                if(arr[i] != 0)
                {
                    swap(arr, i, j);
                    j++;
                }
            }
            for(int i = 0; i < n; i++)
                System.out.print(arr[i]+ " ");

            System.out.println("");
        }
    }
}


// Sample Input:
// 2
// 5
// 0 1 0 3 12
// 8
// 0 0 0 0 1 2 3 4

// Sample Output:
// 1 3 12 0 0
// 1 2 3 4 0 0 0 0
