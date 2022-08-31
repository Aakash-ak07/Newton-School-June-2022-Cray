// The Base can be represented as an M*N grid, and Sky needs to conquer it cell by cell. Sky starts conquering the Base from the cell (1, 1). In each move, he conquers the cell, and moves to an adjacent non- conquered cell (he cannot move if there is no adjacent non- conquered cell). 
// Now, there is a catch, the last cell he needs to conquer is (M, N) so as to complete the quest for the red ranger tag!

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        if(M % 2 == 0 && N % 2 == 0 &&(M*N) % 2 == 0)
        {
        System.out.println("NO");
        }

        else
        {
        System.out.println("YES");
        }
    }
}

// Sample Input
// 2 2

// Sample Output
// NO
