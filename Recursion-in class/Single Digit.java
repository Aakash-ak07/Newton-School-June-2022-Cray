// Given a number N, your task is to convert the number into a single digit by repeatedly replacing the number N with its sum of digits until the number becomes a single digit

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int singleDigit(int n)
    {
        if (n == 0)
        return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(singleDigit(n));
    }
}

// Sample Input:-
// 987

// Sample Output:-
// 6
