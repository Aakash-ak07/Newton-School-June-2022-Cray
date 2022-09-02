// You are given a decimal number n. You need to find the gray code of the number n and convert it into decimal.
// Binary to Gray conversion :
// 1. The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given binary code.
// 2. Other bits of the output gray code can be obtained by XORing binary code bit at that index and previous index.
// Eg: Gray code of 01001 is 01101

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int graycode(int n)
    {
        return n^(n >> 1);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            System.out.println(graycode(n));
        }
    }
}


// Sample Input:
// 4
// 10
// 13
// 5
// 101

// Sample Output:
// 15
// 11
// 7
// 87

// Explanation:
// 5: 101 in binary
// Gray: 111
