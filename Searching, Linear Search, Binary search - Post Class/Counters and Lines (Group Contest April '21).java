

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long counterAndLines(long n, long count)
    {
        long d = count;
        if(d > n)
            d = n;
        count -= d;
        return count + d * (2 * n - d + 1) / 2;

    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong();
        long p = sc.nextLong();
        long k = sc.nextLong();
        long x = 1l, r = 10000000000l;

        while(x + 1 < r)
        {
            long m = (x + r) / 2;
            if ( counterAndLines(m, k) + counterAndLines(m, n - k + 1) - m > p) r = m;
            else x = m;
        }
        System.out.println((long)x); 
    }
}


// Sample Input 1
// 3 3 1

// Sample Output 1
// 1

// Explanation: Optimal Arrangement is 1 1 1.
