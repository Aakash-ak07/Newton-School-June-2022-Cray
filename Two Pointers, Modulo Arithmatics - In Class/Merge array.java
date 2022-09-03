// Given two sorted array your task is to merge these two arrays into a single array such that the merged array is also sorted

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void mergeArray (int[] arr1, int[] arr2, int n, int m, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while(i < n)
            arr3[k++] = arr1[i++];
        while(j < m)
            arr3[k++] = arr2[j++];
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        for(int j = 0; j < m; j++)
        {
            arr2[j] = sc.nextInt();
        }

        int[] arr3 = new int[n + m];
        mergeArray(arr1, arr2, n, m, arr3);

        for(int i = 0; i < n+m; i++)
            System.out.print(arr3[i]+" ");
    }
}


// Sample Input:-
// 3 4
// 1 4 7
// 1 3 3 9

// Sample Output:-
// 1 1 3 3 4 7 9
