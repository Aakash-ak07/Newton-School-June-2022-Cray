// Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack <Character> ch = new Stack<>();
        Stack <Integer> idx = new Stack<>();
        idx.add(-1);
        int maxLen = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '(')
            {
                ch.push('(');
                idx.push(i);
            }
            else
            {
                if(!ch.isEmpty() && ch.peek() == '(')
                {
                    ch.pop();
                    idx.pop();
                    maxLen = Math.max(i-idx.peek(), maxLen);
                }
                else
                {
                    idx.push(i);
                }
            }
        }
        System.out.println(maxLen);
    }
}

// Input
// ((()

// Output
// 2

// Input
// )()())

// Output
// 4
