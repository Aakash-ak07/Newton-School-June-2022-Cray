// Given an integer X find an integer Y such that Y has exactly two set bits in its binary representaion and abs(X- Y) is minimum.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = Long.MAX_VALUE;
        
        for(long i = 0; i < 63; i++)
        {
            long first = (1l << i);
            for(long j = i + 1; j < 63; j++)
            {
                long second = (1l << j);
                long num = first | second;
                y = Math.min(y, Math.abs(x - num));
            }
        }
        System.out.println(y);
    }
}

// Sample input 1
// 5

// Sample output 1
// 0

// Explanation: Y=5.
