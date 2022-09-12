import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     // Your code here Closest Prime (Contest)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ad=1;
        for(int i = n; i >= Math.sqrt(n); i--)
        {
            // n = n;
            if(isPrime(i))
            {
                System.out.print(i);
                break;
            }
            // n = n-i;
            else if (isPrime(n-ad))
            {
                System.out.print(n-ad);
                break;
            }  
            // n = n+i
            else if(isPrime(n+ad))
            {
                System.out.print(n+ad);
                break;
            }
        ad++;      
        }
    } 

    public static boolean isPrime (int n) 
    {
        if(n<=1)
           return false;
        for(int i = 2; i<=Math.sqrt(n); i++)
        {
            if(n%i == 0)
                return false;
        }
        
        return true;
    }
}


// Given an integer N, find the closest prime number to N. If there are multiple print the smaller one.
// Sample Input 1
// 12

// Sample Output 1
// 11

// Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.

// Sample Input 2
// 17

// Sample Output 2
// 17

// Explanation: Closest prime to 17 is 17.
