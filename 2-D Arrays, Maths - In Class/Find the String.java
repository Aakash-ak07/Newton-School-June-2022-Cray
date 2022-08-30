//You are given a matrix of characters. The matrix has N rows and M columns. Given a string s, you have to tell if it is possible to generate that string from given matrix.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[][] arr = new String[N][1];
        for (int i = 0; i < N; i++) 
        {
            arr[i][0] = sc.next();
        }

        String s1 = sc.next();
        int a = 0;
        boolean ans = true;
        while (s1.length() != a)
        {
            if (arr[a % N][0].contains(String.valueOf(s1.charAt(a))))
            {
                ans = true;
                arr[a % N][0] = arr[a % N][0].replaceFirst(String.valueOf(s1.charAt(a)),"");
            }
            else
            {
                ans = false;
                break;
            }
            a +=1;
        }
        if (ans == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}


// Sample Input 1:
// 3 3
// aba
// xyz
// bdr
// axbaydb

// Sample Output 1:
// Yes
