// Given N and F(N) find value of F(1), if, F(i)=(F(i-1) + F(i-1))%1000000007 and 0 <= F(1) < 1000000007.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static final int M = 1000000007;
    static long power(long x, long N)
    {
        long result = 1;
        while(N>0)
        {
            if(N % 2 == 1 ) 
            {
                result = (result * x)% M;

            }
            x = (x * x) % M;
            N = N >>1;    
        }
        return result;
    }
    static long modulolnverse(long X)
    {
        return power (X, M-2);
    }
    static long F_1(long N,long F_N)
    {
        long P_2 = power(2,N-1);
        long modlnv = modulolnverse(P_2);
        long result;
        result = ((modlnv % M) * (F_N % M))%M;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long F_N = sc.nextLong();
        System.out.println(F_1(N,F_N));
    }
}



// Sample Input 1
// 2 6

// Sample Output 1
// 3

// Exlpanation: F(1) = 3, F(2)=(3+3)%1000000007 = 6.

// Sample Input 2
// 3 6

// Sample Input 2
// 500000005

// Explanation:
// F(1) = 500000005
// F(2) = (500000005+500000005)%1000000007 = 3
// F(3)= (3+3)%1000000007 = 6
