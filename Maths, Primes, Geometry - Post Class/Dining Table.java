

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import static java.lang.Math.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int r = sc.nextInt();


        if(r>R || N>1 && (R-r)* sin (acos(-1.0)/N) + 1e-8 <r) 
        {
          System.out.println("No");
        }
        else
        {
          System.out.println("Yes");
        }            
    }
}

// Sample Input:-
// 4 10 4

// Sample Output:-
// Yes

// Sample Input:-
// 5 10 4

// Sample Output:-
// No
