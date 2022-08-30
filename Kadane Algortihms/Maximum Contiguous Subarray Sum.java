// Given an array, A of length N, find the contiguous subarray within A which has the largest sum.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
   public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextLong();
            }
            System.out.println (maximumContiguos(arr, n));
        }
    }

    public static long maximumContiguos (long[] arr, long n)
    {
        long maxSum = 0;
        long currentSum = 0;
        for(int i = 0; i < n; i++)
        {
            currentSum += arr[i];
            if(currentSum > maxSum)
                maxSum = currentSum;
            
            if(currentSum < 0)
            currentSum = 0;
        }
        return maxSum;
    }  
}

// Input:
// 1
// 5
// 1 2 3 4 -10

// Output:
// 10
