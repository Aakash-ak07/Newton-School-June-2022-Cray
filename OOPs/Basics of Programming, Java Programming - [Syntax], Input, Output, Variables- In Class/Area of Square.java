//Given a side of a square, your task is to calculate its area.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
      int side, area;
      Scanner sc = new Scanner(System.in);
      side = sc.nextInt();
      area = side* side;
      System.out.println(area);
   
    }
}


// Sample Input:-
// 3

// Sample Output:-
// 9

// Sample Input:-
// 6

// Sample Output:-
// 36
