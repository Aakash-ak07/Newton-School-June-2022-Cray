// Given an array, sort the array in reverse order by simply swapping its adjacent elements.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void swap (int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort (int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr);
    }
}


// Sample Input:
// 6
// 3 1 2 7 9 87

// Sample Output:
// 87 9 7 3 2 1
