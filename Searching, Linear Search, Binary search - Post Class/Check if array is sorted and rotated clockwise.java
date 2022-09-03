// Given an array arr[] of N distinct integers, check if this array is Sorted and Rotated clockwise.
// A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.
// Note:-Array can be sorted both increasingly and decreasingly

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean ArrayIsSortedandRotated (int arr[] , int n)
    {
        int x = 0, y = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            if (arr[i] < arr[i + 1])
                x++;
            else
                y++;
        }
        if (x == 1 || y == 1) 
        {
            // Checking for last element with first.
            if (arr[n - 1] < arr[0])
                x++;
            else
                y++;
 
            // Checking for final result.
            if (x == 1 || y == 1)
                return true;
        }
        return false;
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            boolean x = ArrayIsSortedandRotated(arr, n);
            if(x == true)
                System.out.println("Yes");
            else
                System.out.println("No");    
        }
    }
}


// Sample Input:
// 2
// 4
// 3 4 1 2
// 3
// 1 3 2

// Sample Output:
// Yes
// Yes
