// We define a weird series as follows:
// 7, 77, 777, 7777, 77777, 777777,. .
// Given a positive integer N find where is first occurrence of a number divisible by N in the given series.
// If the series contains no multiple of N, print -1 instead.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int count = 0;
        for(int  i = 1; i < n; i++)
        {
            x = x * 10;
            x = x + 7;
            x %= n;
            if(x == 0)
            {
                System.out.println(i);
                count++;
                break;
            }
        }
        x %= n;
        if(count == 0)
        {
           System.out.print(-1);
        }
    }
}


// Sample Input 1
// 101

// Sample Output 1
// 4

// Explanation: 7, 77, 777 are not multiple of 101 whereas 7777 is a multiple of 101.

// Sample Input 2
// 2

// Sample Output 2
// -1
