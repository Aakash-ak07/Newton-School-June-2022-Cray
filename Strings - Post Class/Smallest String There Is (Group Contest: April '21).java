// Given a positive integer N, construct a string of length N such that no two adjacent characters are same. Among all possible strings, find the lexicographically minimum string.
// Note: You can use only lowercase characters from 'a' to 'z'.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
            System.out.print("a");
            else
            System.out.print("b");
        }
    }
}


// Sample Input
// 1

// Sample Output
// a

// Sample Input
// 2

// Sample Output
// ab
