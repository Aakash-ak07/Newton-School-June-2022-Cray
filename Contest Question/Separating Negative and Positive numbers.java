// Separate an array of positive and negative integers while maintaining the relative order of the items using merge sort. 
// All positive numbers should come after negative ones, with the relative order remaining the same.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void merge(int [] arr, int l, int m, int r)
    {
        int num1 = m - l + 1;
        int num2 = r - m;

        int left[] = new int[num1];
        int right[] = new int[num2];

        for(int i = 0; i < num1; i++)
            left[i] = arr[l + i];
        
        for(int j = 0; j < num2; ++j)
            right[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
        int k = l;

        while(i < num1 && left[i] <0)
        arr[k++] = left[i++];

        while (j < num2 && right[j] < 0)
            arr[k++] = right[j++];
 
        while (i < num1)
            arr[k++] = left[i++];
 
        while(j < num2)
        {
            arr[k++] = right[j++];
            // j++;
            // k++;
        }
    }
    public static void sort(int arr[], int l, int r)
    {
        if(l < r)
        {
            int m = l + (r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void display(int []arr, int n)
    {
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
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
        sort(arr, 0, n-1);
        display(arr, n);
    }
}


// Sample Input:
// 6
// -1 1 2 -4 -6 5

// Output:
// -1 -4 -6 1 2 5




//method 2 - Using Sliding Window with two pointer technique
// Time Complexity: O(n*window)
// Auxiliary Space: O(1)

public static void rearrangePosNegWithOrder(int[] arr)
   {
       int i = 0, j = 0;
       while (j < arr.length) {
           if (arr[j] >= 0) {
               j++;
           }
           else {
               for (int k = j; k > i; k--) {
                   int temp = arr[k];
                   arr[k] = arr[k - 1];
                   arr[k - 1] = temp;
               }
               i++;
               j++;
           }
       }
   }
