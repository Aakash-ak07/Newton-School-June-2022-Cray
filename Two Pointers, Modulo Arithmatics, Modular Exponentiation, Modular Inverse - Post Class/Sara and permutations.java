// Sara loves problems on permutation but this time she stuck on a problem and asks for your help.
// Given a permutation of N integers as Arr[], your task is to check for each K(1 <= K <= N) there exists a subarray of size K such that it is also a permutation of K integers.

// Note:- A permutation of N integers is a sequence of size N where every element from 1- N are present.
// Input
// The first line of input contains a single integer N denoting the size of permutation, the next line of input contains N space separated integers depicting the permutaiton.

// Constraints:-
// 1 <= N <= 100000
// 1 <= Arr[i] <= N
// Output
// Print N space separated integers either 1 or 0. Print 1 if there exist a permutation K for the ith number else print 0.
// Example
// Sample Input:-
// 6
// 4 5 1 3 2 6

// Sample Output:-
// 1 0 1 0 1 1

// Explanation:-
// for k=1 permutaion exist from [3, 3]
// for k=2 no permutaion exists
// for k=3 permutaion exist from [3, 5]
// for k=4 no permutaion exists
// for k=5 permutaion exist from [1, 5]
// for k=6 permutaion exist from [1, 6]

// Sample Input:-
// 6
// 6 5 4 3 2 1

// Sample Output:-
// 1 1 1 1 1 1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int [] idxArr = new int[100001];
		for(int i = 0; i < n; i++)
    {
			arr[i] = sc.nextInt();
			idxArr[arr[i]] = i;
		}
    
		int l = Integer.MAX_VALUE;
		int r = Integer.MIN_VALUE;
		for(int k=1;k<=n;k++)
    {
      l = Math.min(l, idxArr[k]);
			r = Math.max(r, idxArr[k]);
			if(r - l == k - 1)
      {
				System.out.print("1 ");
			}
			else
      {
				System.out.print("0 ");
			}
		}
	}
}
