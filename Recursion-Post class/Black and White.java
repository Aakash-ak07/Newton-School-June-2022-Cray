// How many ways are there to place a black and a white knight on an N * M chessboard such that they do not attack each other? The knights have to be placed on different squares. A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped). 
// The knights attack each other if one can reach the other in one move.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static long blackAndWhite (int n, int m)
    {
        long ans = (n * m -1) * n * m;

        if(n >= 1 && m >= 2)
        {
            ans -= (4 * (n-1) * (m-2));
        }

        if(n >= 2 && m >= 1)
        {
            ans -= (4 * (n-2) * (m-1));
        }
        return ans;
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(blackAndWhite(n, m));
        }   
    }
}

// Sample Input:
// 3
// 2 2
// 2 3
// 4 5

// Sample Output:
// 12
// 26
// 312
