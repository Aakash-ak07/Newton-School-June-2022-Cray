// You are given a NxN matrix. You need to find the transpose of the matrix.
// The matrix is of form:
// a b c ...
// d e f ...
// g h i ...
// ...........
// There are N elements in each row.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [][] arr = new int [n][n];
         for (int i = 0; i<n ; i++)
         {
            for (int j = 0; j<n; j++)
            {
            arr[i][j] = sc.nextInt();
            System.out.print("");
            }
         }
         System.out.print("");
            for (int i=0; i<n; i++)
            {
                for (int j = 0; j<n; j++)
                {
                    System.out.print("");
                }
            }
            System.out.print("");
            for (int i=0; i<n; i++)
            {
                for (int j = 0; j<n; j++)
                {
                     System.out.print(arr[j][i] + " ");
                }
             System.out.println("");
            }
      System.out.print("");
    }
}


// Sample Input
// 2
// 1 3
// 2 2

// Sample Output
// 1 2
// 3 2
