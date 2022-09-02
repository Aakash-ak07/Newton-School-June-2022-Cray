// Given an array of N elements. In the array, each element is present twice except for 1 element whose frequency in the array is 1. Hence the length of the array will always be odd.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int findUnique(int arr[], int n)
    {
      
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = res ^ arr[i];
     
        return res;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(findUnique(arr, n) + " ");
    }  
}

// Input :
// 5
// 1 1 2 2 3

// Output:
// 3
