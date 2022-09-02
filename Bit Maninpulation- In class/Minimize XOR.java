// Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int minXOR (int[] arr, int n)
    {
        Arrays.sort(arr);
        int xor = Integer.MAX_VALUE;
        int value = 0;
        for(int i = 0; i < n-1; i++)
        {
            value = arr[i] ^ arr[i + 1];
            xor = Math.min(xor, value);        
        }
        return xor;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        } 
        System.out.println(minXOR(arr, n)); 
    }
}


// Sample Input
// 4
// 0 2 5 7

// Sample Output
// 2

// Explanation:
// 0 xor 2 = 2
