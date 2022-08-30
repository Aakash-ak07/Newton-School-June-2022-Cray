//Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
            arr [i][j] = sc.nextInt();
            }
        }
        for(int k= 0; k < m+n-1; k++)
        {
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j < m; j++)
                {
                    if (k == i+j)
                    System.out.print(arr[j][i]+" ");
                } 
            } 
          System.out.println("");
        }
    }
}


// Sample Input:-
// 4 3
// 1 2 3
// 4 5 6
// 7 8 9
// 10 11 12

// Sample Output:-
// 1
// 4 2
// 7 5 3
// 10 8 6
// 11 9
// 12
