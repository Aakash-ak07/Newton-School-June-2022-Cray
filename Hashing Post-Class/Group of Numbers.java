// You are given an array a that contains N integers. All the integers in the array may not be distinct. The number of repetitions of each integer in the array is represented by ri. Your task is to print the integers in the decreasing order of their occurrence in the array.
// Note
// 1. If ri > rj, then ai must be printed before aj.
// 2. If ri == rj, then among ai and aj whichever has a larger value, is printed first.

// Here ri and rj is the number of repetitions of integers ai and aj in the array.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int maxElement = -1;
        for(int i = 0; i < n; i++)
        {
            maxElement = Math.max(maxElement, arr[i]);
        }
        int[] frequency = new int[maxElement + 1];
        for(int i = 0; i < n; i++)
        {
            frequency[arr[i]]++;
        }
        int maxFrequency = -1;
        for(int i = 0; i <= maxElement; i++)
        {
            maxFrequency = Math.max(maxFrequency, frequency[i]);
        }
        while(maxFrequency > 0)
        {
            for(int i = maxElement; i >= 0; i--)
            {
                if(maxFrequency == frequency[i])
                    System.out.print(i + " ");
            }
            maxFrequency--;
        }
    }
}


// Sample input:
// 6
// 1 2 3 3 2 1

// Sample Output
// 3 2 1
