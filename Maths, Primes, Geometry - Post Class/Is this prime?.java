// Let's assume some functional definitions for this problem.
// We take prime(x) as the set of all prime divisors of x. For example, prime(140)={2,5,7}, prime(169)={13}.
// Let f(x,p) be the maximum possible integer p**k where k is an integer such that x is divisible by p**k.
// (Here a**b means a raised to the power b or pow(a, b))
// For example:
// f(99,3)=9 (99 is divisible by 3**2=9 but not divisible by 3**3=27),
// f(63,7)=7 (63 is divisible by 7**1=7 but not divisible by 7**2=49).
// Let g(x,y) be the product of f(y,p) for all p in prime(x).
// For example:
// g(30,70)=f(70,2)*f(70,3)*f(70,5)=2*1*5=10,
// g(525,63)=f(63,3)*f(63,5)*f(63,7)=9*1*7=63.
// You are given two integers x and n. Calculate g(x,1)*g(x,2)*…*g(x,n) mod (1000000007).

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long mod = 1000000007L;
    static long calculatePower(long a,long b)
    {
       long result = 1;
       b=b % (mod - 1);
       while(b > 0)
       {
          if(b % 2 != 0)
          {
            result = (result *a) % mod;
          }
          a=(a * a) % mod;
          b >>= 1;	
       }
       return result ;
    }
    static long f(long n,long p)
    {
        long result = 1;
        long value = 1;
        while(value <= n / p)
        {
           value = value * p;
           long x = calculatePower(p, n / value);
           result =(result * x) % mod;
        }
        return result ;
    }
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long i;
        long result = 1;
        long x = sc.nextLong();
        long n = sc.nextLong();
        for(i = 2; i * i <= x; i++)
        {
            if(x % i != 0)
            {
              continue;
            }
            result = (result * f(n, i)) % mod;
            while(x % i == 0)
            {
               x = x / i;
            }
        }
        if (x > 1)
        {
           result = (result * f(n, x)) % mod;
        }
        System.out.println(result);
    }
}


// Sample Input 1
// 10 2

// Sample Output 1
// 2

// Sample Input 2
// 20190929 1605

// Sample Output 2
// 363165664

// Explanation
// In the first example, g(10,1)=f(1,2)⋅f(1,5)=1, g(10,2)=f(2,2)⋅f(2,5)=2.


