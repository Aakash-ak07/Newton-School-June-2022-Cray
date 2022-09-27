// Alice is rearranging her library. She takes the innermost shelf and reverses the order of books. She breaks the walls of the shelf. In the end, there will be only books and no shelf walls. Print the order of books.
// Opening and closing walls of shelves are shown by '/' and '\' respectively whereas books are represented by lower case alphabets.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String reverse(String str)
    {
        String x = "";
        for(int i = str.length()-1 ; i >= 0 ; i--)
        {
            x += str.charAt(i); 
        }
        return x;
    }
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<String> st = new Stack<>();
        String x = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '/')
            {
                st.push(x);
                x = "";
            }
            else if(str.charAt(i) == '\\')
            {
                String rev = reverse (x);
                String temp = "";
                if(!st.empty())
                    temp = st.pop() + rev;
                
                else
                    temp = rev;
                
                x = temp;
            }
            else
            {
                x += str.charAt(i);
            }
        }
        System.out.print(x);
    }
}


// Sample input
// /u/love\i\

// Sample Output
// iloveu

// Explanation
// /u/love\i\
// Here Alice breaks the inner most shelf and reverse the order. So the library will be /uevoli\.
// Now she breaks the outermost wall and reverses the order. So the library will be iloveu.
