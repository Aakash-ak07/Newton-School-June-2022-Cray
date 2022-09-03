//Given an N size array of unique inyegers, your task is to print the array in a wave form, i. e a1 >= a2 <= a3 >= a4 <= a5.. . 
// print the lexicographically smallest array possible.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void swap (int [] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void waveArray (int [] arr, int n)
    {
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i += 2)
        {
            swap(arr , i, i + 1);
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
        waveArray(arr, n);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}

// Sample Input :-
// 5
// 2 1 3 5 4

// Sample Output:-
// 2 1 4 3 5
