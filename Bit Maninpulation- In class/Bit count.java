// Negi is fascinated with the binary representation of the number. Tell him the number of set bits (ones) in the binary representation of an integer N.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(Long.bitCount(n));  
    
    }
}

// Sample Input
// 7

// Sample Output
// 3

// Sample Input
// 16

// Sample Output
// 1
