// N cards are placed on an infinite number line. You are given an array(a) of size N where a[i] denotes the position of i- th card. The card is said to be an end- card if the card has a smallest or largest position.

// In one turn, you can pick an end- card and place it at any position between the current endpoints which is unoccupied so that it no longer remains end- card.

// For eg, if a = [2, 3, 6] you cannot move card at position 6 as moving it to position 1 or 4 would still keep it as an end- card(moving card at position 2 to position 4 is a valid move).

// Once all the cards are in consecutive positions you cannot make a valid move and the game ends.

// Print the minimum and maximum valid moves possible when the game ends.
// Input
// First line contains N - the number of cards.
// The next line contains N elements denoting the position of cards.

// Constraints:-

// 3<= N <=10^4
// 1<= position of cards <=10^9

// All the positions are distinct.
// Output
// Print minimum moves and maximum moves separated by space.
// Example
// Sample Input:-
// 3
// 8 5 10

// Sample Output:-
// 1 2

// Explanation:-
// As the card at position 5(a[1]) has minimum position and the card at position 10(a[2]) has the maximum position, cards at position 5 and position 10 are end cards.

// a = [8, 5, 10], min moves = 1(move card at 5 - > 9), max moves = 2(10 - > 6 then 5 - > 7)

// Sample Input:-
// 5
// 7 6 5 4 11

// Sample Output:-
// 2 3

// Sample Input:-
// 6
// 5 6 7 8 9 10

// Sample Output:-
// 0 0

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long max = 0, min = Long.MAX_VALUE;
        long m1, m2;
        m1 = (arr[n - 1] - arr[1]) - (n - 1 - 1);        
        m2 = (arr[n - 2] - arr[0]) - (n - 2);        
        max = Math.max(m1, m2);

        int i = 0, j = 0;
        long size, x;
        while(j < n)
        {
            size = arr[j] - arr[i] + 1;
            x = j - i + 1L;
            if(size > n)
                ++i;
            else
            {
                if(size == n-1 && x == n - 1)
                    min = Math.min(min, 2);
                else
                    min = Math.min(min, n - x);
                ++j;
            }
        }
        System.out.println(min + " " + max);
    }
}
