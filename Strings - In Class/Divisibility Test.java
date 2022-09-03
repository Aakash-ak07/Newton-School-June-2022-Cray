// You are given a big number in form of a string A of characters from 0 to 9.
// Return 1 if it's divisible by 30 and 0 otherwise.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isDivisible(String num)
    {
        int s = num.length();
        return((Integer.parseInt(num.substring(s - 1)) == 30)
            || (Integer.parseInt(num.substring(s - 1))
                == 0));
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    if ( isDivisible(num))
    System.out.print("Yes");
    else
    System.out.print("No");
    }
}


// Sample Input :
// 3033330

// Sample Output:
// Yes
