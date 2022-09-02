// You are given the following pseudocode: code :
// res = a
// for i = 1 to k
// if i is odd
// res = res & b
// else
// res = res | b .  You are also given the values of a, b and k. Find the value of res.
  

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            if(k == 1)
            System.out.println(a & b);
            else
            System.out.println(b);
        }
    }
}

// Sample Input :
// 1
// 4 5 1

// Sample Output :
// 4
