import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       int x =sc.nextInt();

       int multi= n*x;

       System.out.println(multi);
    }
}

// Sara is standing in a line for her turn to see the doctor. There are N people standing in front of Sara and for each person, the doctor takes exactly X minutes. Sara wants to know the time after which her number comes. 
// Since Sara is weak in maths, your task is to calculate the time for her.
