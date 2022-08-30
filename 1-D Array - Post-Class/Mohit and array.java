// Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
// Given N-1 elements your task is to find the missing one.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int[] arr= new int[n];
        

        for(int i=1; i<n; i++)
        {
          arr[i] = sc.nextInt();
          System.out.print("");
        }
        int total = ((n*(n+1))/2);
        int sum = 0;

        for (int i=1; i<n; i++)
        {
            total = total-arr[i]; 
            System.out.print("");
        }
        
        int missingNo = total-sum;
        System.out.println(missingNo);
    }
}
