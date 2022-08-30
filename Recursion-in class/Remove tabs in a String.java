// Write a recursive program to remove all tabs or spaces from a string.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static String removTab (String str)
    {
        str = str.replaceAll("\\s","");
        return str;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removTab(str)); 
    }
}


// Sample Input:
// Hello World

// Sample Output:
// HelloWorld
