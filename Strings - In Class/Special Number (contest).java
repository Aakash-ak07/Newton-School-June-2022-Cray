// Given a number N, find out whether it is divisible by 3.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean SN(String s){
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++)
        sum += (s.charAt(i)-'0');
        return(sum % 3 == 0);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String s = sc.next(); 
        if(SN(s))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");    
        }
    }   
}


// Sample Input 1
// 14

// Sample Output 1
// No

// Sample Input 2
// 1234567890123456789012345678901234567890

// Sample Output 2
// Yes
