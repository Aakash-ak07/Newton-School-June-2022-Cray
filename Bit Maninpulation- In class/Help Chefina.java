// Chef and Chefina are playing a game, Chef asks Chefina that whether the ith bit is set in the binary representation of the number. 
//Chefina knows how to do it but she is taking quite a lot time. You are Chefina friend so help her out from this situation.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void checkBit (long n, long k)
    {  
        if ((n & (1 << (k - 1))) != 0)
        System.out.println("SET");
        
        else
        System.out.println("NOT SET");
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        for(long z = 0; z < t; z++)
        {
            long k = sc.nextLong();
            long n = sc.nextLong();
         
            checkBit(k, n);
        }
    }
}


// Sample Input
// 2
// 2 1
// 1 1

// Sample Output
// NOT SET
// SET

// Explanation
// 2's binary representation : 10 hence the first bit is 0 which is not set
// 1's binary representation : 1 hence the first bit is 1 which is set
