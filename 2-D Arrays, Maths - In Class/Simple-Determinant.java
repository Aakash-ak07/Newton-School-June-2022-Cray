//You are given a 2X2 square matrix. You need to find the determinant of the matrix.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [2][2];
        for(int i = 0; i<2; i++)
        {
            for (int j = 0; j<2; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int determinant= (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        System.out.println(determinant);
    }
}


// Sample Input
// 4 5
// 2 3

// Sample Output
// 2
