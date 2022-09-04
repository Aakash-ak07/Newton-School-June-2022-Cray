// Sara is playing a game in which there are N monsters standing in a circle and the ith (1 <= i <= N) monster has A[i] HP.
// Rules:-
// At the end of each second, all the monster's HP decreases by 1 if it is not 0.
// At the end of each second, the player will jump to the next monster (monster standing to the right of the current).
// The game ends when the current monster has 0 health.

// If the player starts at index 1 then find the index at which the game ends.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int v[]=new int[n];
        for(int i=0;i<n;i++)
        {
            v[i]=s.nextInt();
        }
        int count=0;
        int i=0;
        while(true)
        {
            if(v[i] - count <= 0)
            {
                System.out.println((i+1)%n);
                break;
            }
            else
            {
                i=(i+1)%n;
                count++;
            }
        }
    }
}


// Sample Input:-
// 5
// 3 2 3 2 1

// Sample Output:-
// 4

// Explanation:-
// [ 3(P), 2, 3, 2, 1] - > [2, 1(P), 2, 1, 0] - > [1, 0, 1(P), 0, 0 ] - > [0, 0, 0, 0(P), 0]
