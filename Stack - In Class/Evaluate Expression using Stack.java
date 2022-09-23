// Given a postfix expression, your task is to evaluate given expression.
// Infix expression: The expression of the form a operator b. When an operator is in-between every pair of operands.
// Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.
// Valid operators are +, -, *, /. Each operand may be an integer or another expression.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String exp = sc.nextLine();
        Stack <Integer> st = new Stack<>();
        String elements[] = exp.split(" ");
        for(String i : elements)
        {
            switch(i.charAt(0))
            {
                case '+' :
                {
                    int oprnd2 = st.pop();
                    int oprnd1 = st.pop();
                    st.push(oprnd1 + oprnd2);
                    break;
                }
                case '-' :
                {
                    int oprnd2 = st.pop();
                    int oprnd1 = st.pop();
                    st.push(oprnd1 - oprnd2);
                    break;
                }
                case '/' :
                {
                    int oprnd2 = st.pop();
                    int oprnd1 = st.pop();
                    st.push(oprnd1 / oprnd2);
                    break;
                }
                case '*' :
                {
                    int oprnd2 = st.pop();
                    int oprnd1 = st.pop();
                    st.push(oprnd1 * oprnd2);
                    break;
                }
                default:  
                    st.push(Integer.parseInt(i));
            }
        }
        System.out.println(st.peek());
    }
}


// Input 1:
// 5
// 2 1 + 3 *
// Output 1:
// 9

// Explaination 1:
// starting from backside:
// *: ( )*( )
// 3: ()*(3)
// +: ( () + () )*(3)
// 1: ( () + (1) )*(3)
// 2: ( (2) + (1) )*(3)
// ((2)+(1))*(3) = 9

// Input 2:
// 5
// 4 13 5 / +
// Output 2:
// 6

// Explaination 2:
// +: ()+()
// /: ()+(() / ())
// 5: ()+(() / (5))
// 1: ()+((13) / (5))
// 4: (4)+((13) / (5))
// (4)+((13) / (5)) = 6
