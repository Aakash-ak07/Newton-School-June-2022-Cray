// Given an integer array A of size N. Find the sum of GCD (Greatest Common Divisor) of all elements with their frequency.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcdF(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
      return gcdF(b, a % b);
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            // System.out.print();
        }

        for(int i = 0; i < n; i++)
        {
            count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            // System.out.print(count);
            sum += gcdF(arr[i], count);
        }
        System.out.println(sum);       
    }
}

// Sample Input 1:
// 3
// 1 2 3

// Output
// 3

// Explanation:
// gcd(1, 1) + gcd(2, 1) + gcd(3, 1) = 1+1+1 = 3

// Sample Input 2:
// 6
// 3 6 6 9 3 3

// Output
// 14
