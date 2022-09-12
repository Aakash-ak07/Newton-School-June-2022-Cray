import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++)
        { 
            int n = sc.nextInt();
            
            int total = 0;
            int count;
            for(int i = 1; i <= n; i++)
            {
                count = 0;
                for(int j = 1; j <= i; j++)
                {
                    if (i % j == 0)
                    count++;
                }
                if (count == 2)
                total = total+1;
            }
            System.out.println(total);
        }
        
    }
}


// You are given a number n. Your task is to print the number of prime numbers before that number.

// Sample Input 1:
// 3
// 10
// 19
// 4

// Sample Output 1:
// 4
// 8
// 2
