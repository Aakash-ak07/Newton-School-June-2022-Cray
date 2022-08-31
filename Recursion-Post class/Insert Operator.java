// You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int insOperator(long [] arr, long sum, int i)
    {  
        if(i == arr.length)
        {
            if(sum == 0)
                return 0;
        
            else
                return 1;
        }
        return insOperator(arr, sum - arr[i], i + 1) * insOperator(arr, sum + arr[i], i + 1);
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long [] arr = new long[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        }
        int sum = insOperator(arr, x, 0);
        if(sum == 0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}

// Sample Input:-
// 4 4
// 1 2 3 4

// Sample Output:-
// YES
