// Given two integers a and b your task is to print the summation of these two numbers

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger sum;

        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        sum = s1.add(s2);

        System.out.println(sum);
    }
}


// Sample Input:-
// 3 8

// Sample Output:-
// 11

// Sample Input:-
// 15 1

// Sample Output:-
// 16
