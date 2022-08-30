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
