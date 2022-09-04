// Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();

      if(n %100 == 0)
      {
        if(n %400 == 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
      }
     else if (n %4 == 0)
     {
        System.out.println("YES");
     }
     else 
     {
        System.out.println("NO");
     }
  }
}


// Sample Input:
// 2000

// Sample Output:
// YES

// Sample Input:
// 2003

// Sample Output:
// NO

// Sample Input:
// 1900

// Sample Output:
// NO
