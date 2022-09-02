// Given an array of N integers, your task is to calculate the sum of bit difference in all pairs which can be formed.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long mod = (long) 1e9+7;
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long [n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        } 
        long ans = 0;
		for(int i = 0; i < 64; i++){
			long count = 0;                 //how many ones in that column bit
			long bitshift = (1l << i);      //000.....10
			for(int j = 0; j < n; j++)
            {
				if((arr[j] & bitshift) == 0)
                {
					count++;                //counting number of 0's last bit + second last bit
				}
			}
			ans += (count*(n - count)*2);
			ans %= mod;
		}
		System.out.println(ans);
    }
}


// Sample Input:-
// 2
// 1 3

// Sample Output:-
// 2

// Explanation:-
// (1, 1) = 0
// (1, 3) = 1
// (3, 1) = 1
// (3, 3) = 0
