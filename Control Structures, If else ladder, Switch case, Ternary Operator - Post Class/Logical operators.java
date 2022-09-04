// Given two integers a and b, your task is to check following conditions:-
// 1. If a <= 10 and b >= 10 (Logical AND).
// 2. Atleast one from a or b will be even (Logical OR).
// 3. if a is not equal to b (Logical NOT).

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a <= 10 && b >= 10)
        {
            System.out.print("true"+" ");
            
        }
        else
        {
            System.out.print("false" + " ");
        }

        if(a % 2 == 0 || b % 2 == 0)
        {
            System.out.print("true"+" ");  
        }
        else
        {
            System.out.print("false" + " ");
            
        }

        if(a != b)
        {
            System.out.print("true"+" ");
        }
        else
        {
            System.out.print("false" + " ");
            
        }

    }
}

// Sample Input:-
// 3 12

// Sample Output:-
// true true true
