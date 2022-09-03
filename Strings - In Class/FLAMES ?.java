// They say friendship is greater than love. Why not play the famous game "FLAMES".
// The rules are super simple. Given two strings (all lowercase), remove all the letters that are common to both the strings from both the strings. You cannot erase two characters corresponding to one character.
// For example, in the case
// String 1: saumya
// String 2: ansh
// You can remove only 1 'a' and 1 's' from both the strings.
// Remaining strings are:
// String 1: umya
// String 2: nh

// Now all you need to do is find the sum of the remaining strings length % 6.

// Output:
// If obtained value is 1, output "Friends"
// If obtained value is 2, output "Love"
// If obtained value is 3, output "Affection"
// If obtained value is 4, output "Marriage"
// If obtained value is 5, output "Enemy"
// If obtained value is 0, output "Siblings"

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        int count1[] = new int[26];
        int count2[] = new int[26];

        for(int i = 0; i < s1.length(); i++)
        {
            count1[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s2.length(); i++)
        {
            count2[s2.charAt(i) - 'a']++;
        }
        int sum = 0;
        for(int i =0; i < 26; i++)
        {
            sum += Math.abs(count2[i] - count1[i]);
        }

        sum = sum % 6;

        switch(sum)
        {
            case 1:
                System.out.println("Friends");
                break;
            case 2:
                System.out.println("Love");
                break;
            case 3:
                System.out.println("Affection");
                break;
            case 4:
                System.out.println("Marriage");
                break;
            case 5:
                System.out.println("Enemy");
                break;
            case 0:
                System.out.println("Siblings");
        }
    }
}


// Sample Input:-
// saumya
// ansh

// Sample Output:-
// Siblings

// Explanation:-
// after deleting characters :-
// str1 = umya
// str2 = nh
// sum = 4+2
// sum%6=0
