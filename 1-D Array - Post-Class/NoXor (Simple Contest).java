//We need a problem on xor again. Given an array A of N integers (1- indexed), you need to find the sum of (N- i) xor A[i] for all i from 1 to N.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long [] A =new long[N];

        for (int i=0; i<N; i++)
        {
            A[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i=1; i<=N; i++)
        {
            sum += ((N-i) ^ A[i-1]);
        }
        System.out.println(sum);
    }
}


// Sample Input
// 5
// 1 2 3 4 5

// Sample Output
// 17

// Explanation
// (5-1)xor1 = 5, (5-2)xor2 = 1, (5-3)xor3 = 1, (5-4)xor4 = 5, (5-5)xor5 = 5.
