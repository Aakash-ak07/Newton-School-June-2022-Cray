// Sara is learning bits manipulation today and she is stuck on a problem and asks for your help.
// Problem:-
// Given an integer N. Your task is to change the integer to 0 by performing the following operations:-
// 1. Change the rightmost digit(0th index). i. e you can change the rightmost digit to 1 if it is 0 or 0 if it is 1.
// 2. Change the ith bit if (i-1)th bit is 1 and all bits right to (i-1) is 0. For eg:- you can change the left most bit of these numbers:- 1100, 110, 110000.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int minOperation (int n, int res)
    {
        if(n == 0)
        return res;
        int b = 1;
        while((b << 1) <= n)
        b = b << 1;
        return minOperation((b >> 1) ^ b ^ n, res + b);
        
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(minOperation(n, 0));
    }
}


// Sample Input:-
// 3

// Sample Output:-
// 2

// Explanation:-
// 3- >11(binary representation)
// 01;- Change the leftmost bit using the second operation
// 00:- Change the rightmost bit using the first operation
