// Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. What is the largest number of groups she can make?
// Identical groups mean there are equal number of same coloured balls in each group.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd (int a, int b){
        int divident = a;
		int divisor = b;
		while (a%b > 0)
        {
            int rem = a % b;
            a =b;
            b= rem;
		}
		return b;
	}
        // if( b == 0)  (we can use also these method insted of while loop)
        // return a;
        // return gcd(b, a % b);
    // }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int xR = sc.nextInt();
        int yB = sc.nextInt();
        // int min = xR < yB ? yB : xR;
        // int count = 0;
        System.out.println(gcd(xR,yB));    
    }
}


// Sample Input
// 3 9

// Sample Output
// 3

// Explanation:-
// 1 red ball and 3 blue ball will be in each group.
