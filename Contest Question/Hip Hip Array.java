// You will be given an array of N numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) 
//  and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        // for(int i = 0; i < n/2; i++)
        // {
        //     int temp = arr[i];
        //     arr[i] = arr[n - i - 1];
        //     arr[n - i - 1] = temp;
        // }
        int  start = 0;
        int end  = n-1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        int sum = 0; 
        long product = 1;
        for(int i = 0; i < n; i++)
        {
            if((i+1) % 2 == 0)
            {
                sum +=arr[i];
            }
            else 
            {
                product *= arr[i];
            }
        }
        System.out.print(sum + " " + product);
    }
}


// Sample Input:
// 6
// 1 2 3 4 5 6

// Sample Output:
// 9 48

// Explanation:-
// After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
// Hence sum of the numbers at even indices : 5+3+1=9
// product of the numbers at odd indices: 6*4*2=48
