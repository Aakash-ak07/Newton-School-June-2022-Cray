// Write a program to check whether a number is positive, negative or zero using switch case.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        if(n>0)
        {
            System.out.println("Positive");
        }
        else if (n<0)
        {
            System.out.println("Negative");
        }
        else
        {
          System.out.println("Zero");  
        }
    }
}
