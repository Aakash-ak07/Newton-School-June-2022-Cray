// Given a string(1-indexed). Print all the characters of the string at odd positions

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String oddCh (String str)
    {
        String n = "";
        for(int i = 0; i<str.length(); i++)
        {
            if(i % 2 == 1)
            continue;
            n += str.charAt(i)+" ";
        }
        return n;

    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // char ch;
        str = oddCh(str);
        System.out.println(str);
    }
}


// Sample Input
// abcde

// Sample Output
// a c e

// Sample Input
// abcd

// Sample Output
// a c
