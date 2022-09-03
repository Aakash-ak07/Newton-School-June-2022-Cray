// Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.
// Note: Print the smallest modular multiplicative inverse.

  
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int modInverse(int a, int m)
    {
        for(int i = 1; i < m; i++)
        {
            if(((a % m) * (i % m)) % m == 1)
            return i;
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int a = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(modInverse(a, m));
        }
    }
}

// Sample Input:-
// 2
// 3 11
// 10 17

// Sample Output:-
// 4
// 12
