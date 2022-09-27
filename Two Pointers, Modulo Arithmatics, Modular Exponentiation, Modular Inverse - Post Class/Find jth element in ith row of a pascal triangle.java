// In a pascal triangle starting from top to bottom. Find the value of the element in a given row and column position i.e. ith row and at jth position.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z = 0; z < t; z++)
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int max = Math.max(row, col); 
            int[][] pascal = new int[max + 1][max + 1];
            
            for(int i = 0; i < max+1; i++)
            {
                for(int j = 0; j < max+1 ; j++)
                {
                    if(j == 0 || j == i)
                    {
                        pascal[i][j] = 1;
                    }
                    else if(j < i && j != 0 && i != 0)
                    {
                        pascal[i][j] = (pascal[i-1][j]%1000000007 + pascal[i-1][j-1]%1000000007)%1000000007;
                    }
                    else
                        pascal[i][j] = 0;
                }
            }
            System.out.print(pascal[row][col] % 1000000007);
            System.out.println("");
        }
    }
}

// Input:
// 2
// 0 0
// 2 1

// Output:
// 1
// 2
// Explanation: The Pascal Triangle has first value as 1. (0th row 0th element). The pascal triangle has next set of values as 1 1. (1th row). On the next level, pascal triangle has values 1 2 1. (2nd row). Its 1st element is 2. (0 based).
