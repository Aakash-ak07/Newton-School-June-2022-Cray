// Given an integer array A of size N. The array is Good if the GCD (Greatest Common Divisor) of all elements of array is a multiple of 2.
// You need to make the array Good. You can perform only increment operations (if the array value is A[i] make it A[i]+1) on array elements. Find the minimum number of operations needed to make the array Good.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0)
            {
                arr[i]+= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}


// Sample Input 1:
// 3
// 1 2 3

// Output
// 2

// Explanation:
// Increment elements at index 0 and 2.
// Array ={2, 2, 4}
// Gcd of array is 2 which is a multiple of 2.
// So, minimum moves required is 2.
