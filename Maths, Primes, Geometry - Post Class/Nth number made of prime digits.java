// Given a number 'N'. The task is to find the Nth number whose each digit is a prime number(<10) i.e 2, 3, 5, 7.
// In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import static java.lang.Math.pow;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void nthPrimeNo (long n)
    {
        long len = 1;
        long prevCount = 0;
        while(true)
        {
            long currentCount = (long)(prevCount+pow(4,len));
            if(prevCount < n && currentCount >= n)
                break;
                len++;
            prevCount = currentCount;
        }
        for(int i = 1; i<= len; i++)
        {
            for(long j = 1; j <= 4; j++)
            {
                if(prevCount + pow(4, len-i) < n)
                    prevCount += pow(4, len - i);
                else
                {
                    if (j == 1)
                        System.out.print("2");
                    else if (j == 2)
                        System.out.print("3");
                    else if (j == 3)
                        System.out.print("5");
                    else if (j == 4)
                        System.out.print("7");
                    break;
                }
            }
        }
        System.out.println("");
    }
    public static void main (String[] args) 
    {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) 
        {    
            long s = sc.nextLong();
            nthPrimeNo(s);
        }
    }
}
