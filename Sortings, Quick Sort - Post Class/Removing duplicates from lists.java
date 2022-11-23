// Given a string, convert it to a list containing all of its elements only once without any repetition, even if there is repetition in the string.

// hint - you might use sets for this.
// Input
// The input would be a string containing 5 characters. Each character can be any alpha numeric value.
// Output
// The output would be a sorted list with no repeating elements
// Example
// Sample input
// abbbc

// Sample output
// ['a', 'b', 'c']

// Explanation-
// the string 'abbbc' contains elements 'a','b', and 'c' , therefore they are printed out in the list without any duplication.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] a = str.toCharArray();
        TreeSet <String> set = new TreeSet <>();
        for(char c : a)
        {
            set.add("'" + c + "'");
        }
        System.out.println(set);
    }
}
