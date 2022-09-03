

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int conversion1=0, conversion2=0;
        String row;
        for(int i=0; i<n; i++)
        {
            row= sc.nextLine();
            int j=0;
            for(var ch: row.toCharArray())
            {
                if(ch==' ')
                {
                    continue;
                }

                if((i+j)%2==0)
                {
                    if(ch== '0')
                        conversion1++;
                    else 
                        conversion2++;
                }else
                {
                    if(ch=='1')
                        conversion1++;
                    else 
                        conversion2++;
                }  
                j++;
            }
        }
        System.out.println(Math.min(conversion1, conversion2)); 
    }
}

// Input:
// 3
// 1 1 1
// 1 1 1
// 1 1 1

// Output:
// 4

// Explanation:
// Convert to
// 1 0 1
// 0 1 0
// 1 0 1
// Thus we will have to colour 4 cells.

// Input:
// 3
// 0 1 0
// 1 0 1
// 0 1 0

// Output:
// 0
// It already has a chess board like coloring.
