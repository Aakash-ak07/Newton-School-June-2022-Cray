// Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
// Game is played in pairs.
// If Rick plays against anyone, Rick wins.
// If Jerry plays against anyone, Jerry Loses.
// A game between any other players is a draw.
// Given a pair of players, find who wins the game or if the game is draw.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        char c = Character.toUpperCase(sc.next().charAt(0));
        char d = Character.toUpperCase(sc.next().charAt(0));

         if(c=='R'){ 
            System.out.println(c); 
        } 
        else if(d=='R'){ 
            System.out.println(d); 
        } 
        else if((c!='R') && (d=='J')){ 
            System.out.println(c); 
        } 
        else if((c=='J') && (d!='R')){ 
            System.out.println(d); 
        } 
        else{ 
            System.out.println("D"); 
        }
    }
}


// Sample Input 1
// R S

// Sample Output 1
// R

// Sample Input 2
// B J

// Sample Output 2
// B
