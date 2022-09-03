// Given an array Arr of N elements. Find the maximum value of GCD(Arr[i], Arr[j]) where i != j.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int findGcd (int arr[], int n)
    {
        // find higest no in array
        int h = 0;
        for(int i= 0; i<n; i++)
        h = Math.max(h , arr[i]);

        int divisior[] = new int[h + 1]; 

        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j <= Math.sqrt(arr[i]); j++)
            {
                if (arr[i] % j == 0)
                {
                    divisior[j]++;

                    if (j != arr[i] / j)
                    divisior [arr[i] / j]++;
                }
            }
        }
        for(int i = h; i >= 1; i--)
        
        if(divisior [i] > 1)
            return i;
        return 1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(findGcd(arr, n));
    }
}


// Sample Input 1
// 5
// 2 4 5 2 2

// Sample Output 1
// 2

// Explanation: We can select index 1 and index 4, GCD(2, 2) = 2
