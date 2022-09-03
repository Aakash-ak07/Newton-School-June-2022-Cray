// Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);

        int n =sc.nextInt();
        int m =sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if (i==1 || j == 1 || i == n || j ==m)
                {
                    System.out.print("*");
                } else
                    {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
}


// Sample Input:-
// 3 3

// Sample Output:-
// ***
// * *
// ***

// Sample Input:-
// 5 3

// Sample Output:-
// ***
// * *
// * *
// * *
// ***
