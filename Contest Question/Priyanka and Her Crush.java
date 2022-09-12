// Khusboo found a love letter in the class that her friend Priyanka has written to her boyfriend Khusboo is a prankster, so she decides to meddle with the letter. She changes all the words in the letter
// into palindromes.
// To do this, she follows two rules:
// 1. She can only reduce the value of a letter by 1, i. e. she can changed to c, but he cannot change c to d or d to b.
// 2. The letter may not be reduced any further.
// Each reduction in the value of any letter is counted as a single operation. Help Khusboo to find minimum number of operations required to convert a given string into a palindrome.
// Example
// s = cde
// The following two operations are performed: cde → cdd → cdc. Return 2.
// string s: the text of the letter


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int loveLetter(String m)
    {
        int count = 0;
        for(int j = 0; j < m.length()/2; j++)
        {
            int a = (int) (m.charAt(j));
            int b = (int) (m.charAt(m.length() - 1 - j));
            if(a > b)
                count += a - b;
            else if (a < b)
                count += b - a;
        }
        return count;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            String m = sc.next();
            System.out.println(loveLetter(m));
        }
    }
}


// Sample Input
// 3
// abc
// abcd
// cba
// Sample Output
// 2
// 4
// 2
// Explanation
// For the first query, abc → abb → aba.
// For the second query, abcba is already a palindromic string.
// For the third query, abcd → abcc → abcb → abca → abba.
// For the fourth query, cba → bba → aba.
