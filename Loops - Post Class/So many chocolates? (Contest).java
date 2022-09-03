// It's Solo's 1st birthday and everyone is gifting her chocolates. There are N guests invited, the ith guest gives Solo A[i] chocolates.
// Find the total number of chocolates that Solo receives.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gift[] = new int [n];

        for (int i = 0; i<gift.length; i++)
        {
          gift[i]=sc.nextInt();
          sum += gift[i];
        }
        
         System.out.println(sum); 

    }
}

// Sample Input
// 5
// 1 2 4 3 2

// Sample Output
// 12
