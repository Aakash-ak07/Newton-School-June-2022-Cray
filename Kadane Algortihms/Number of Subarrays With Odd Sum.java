//Given an array A of integers, find the number of subarrays with an odd sum.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long subArrayWithOddSum(int[] arr, int n)
    {
        long ans = 0;
        int even = 0, odd = 0, sum = 0;

        for(int i : arr)
        {
            sum += i;
            if(sum % 2 == 0)
            {
                ans += odd;
                even++;
            }
            else
            {
                ans += 1 + even;
                odd++;
            }
        }
        return ans;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(subArrayWithOddSum(arr, n));
    }
}

// Sample Input 1:
// 3
// 1 3 5

// Output
// 4

// Explanation:
// All subarrays are [1], [1, 3], [1, 3, 5], [3], [3, 5], [5]
// All sub- arrays sum are [1, 4, 9, 3, 8, 5].
// Odd sums are [1, 9, 3, 5] so the answer is 4.
