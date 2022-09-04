// Given an array Arr, of N integers find the sum of max(A[i], A[j]) for all i, j such that i < j.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        } 

        Arrays.sort(arr);
        long count = 0;
        for(int i = arr.length-1; i > 0; i--)
        {
            int ans = i;
            count += arr[i] * ans;
        }
        System.out.print(count);
    }
}


// Sample Input
// 4
// 5 3 3 1

// Sample Output
// 24

// Explanation: max(5,3) + max(5,3) + max(5,1) + max(3,3) + max(3,1) + max(3,1) = 24
