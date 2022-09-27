// Modulo exponentiation is super awesome. But can you still think of a solution to the following problem?
// Given three integers {a, b, c}, find the value of abc % 1000000007.
// Here ab means a raised to the power b or pow(a, b). Expression evaluates to pow(a, pow(b, c)) % 1000000007.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long power(long a,long b,long mod)
    {
        if(b == 0) 
            return 1;
        long p = power(a, b/2, mod);
        if(b % 2 == 0) {
            return  (p * p) % mod;
        }
        else
        {
            long tempPower = (a * p) % mod;
            return (tempPower * p) % mod;
        }
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mod = 1000000007;
        for(int k = 0; k < t; k++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            long temp = power(b, c, mod-1);
            long temp2 = power(a, temp, mod);
            System.out.println(temp2); 
        }
    }
}

// Sample Input
// 3
// 3 7 1
// 15 2 2
// 3 4 5

// Sample Output
// 2187
// 50625
// 763327764

// Explaination:
// In the first test, a = 3, b = 7, c = 1
// bc = 71 = 7
// abc = 37 = 2187
