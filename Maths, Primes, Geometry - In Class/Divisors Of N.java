import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int div(long n)
    {
        int count = 0;
        int i = 0;
        for (i = 1; i*i<=n; i++)   //Math.sqrt(n)
        {
            if(n % i ==0)
            {
                if(i % 2 == 0)
                count++;
                if ((n/i)%2 ==0)
                count++;
            }
        }
        i--;
        if(i*i == n && (i % 2)==0)
        count--;
        return count;
    }
    

    public static void main (String[] args) 
    {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++)
        {
            long n = sc.nextLong();
            System.out.println(div(n));
        }

    }
}


// Given an integer N, the task is to find the number of divisors of N which are divisible by 2.

// Input:
// 2
// 9
// 8

// Output
// 0
// 3
