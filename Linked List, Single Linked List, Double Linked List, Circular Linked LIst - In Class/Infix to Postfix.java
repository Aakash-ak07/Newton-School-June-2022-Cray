// Given an infix expression, your task is to convert it into postfix.

// Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands.
// Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

// Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'.

// See example for better understanding.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int operation (char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix (String exp)
    {
        String result = new String("");
        Stack <Character> st= new Stack<>();
        for (int i = 0; i < exp.length(); ++i)
        {
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch))
                result += ch;
            else if(ch == '(')
                st.push(ch);
            else if(ch == ')')
            {
                while(!st.isEmpty() && st.peek() != '(')
                {
                    result += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && operation(ch) <= operation(st.peek()))
                {
                    result += st.peek();
                    st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty())
        {
            if(st.peek() == '(')
                return "Invalid Expression";
            
            result += st.peek();
            st.pop();
        }
        return result;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String exp =sc.nextLine();
        System.out.println(infixToPostfix(exp));
    }
}


// Sample Input:-
// ((A-(B/C))*((A/K)-L))

// Sample Output:-
// ABC/-AK/L-*

// Sample Input:-
// A+B

// Sample Output:-
// AB+
