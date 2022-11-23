// Given an array of N elements and a number K. The task is to arrange array elements according to the absolute difference with K, i. e., element having minimum difference comes first and so on.


// Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.
// Input
// First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of test case contains two space separated integers N and K. Second line of each test case contains N space separated integers.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 10^5
// 1 <= K <= 10^4
// 1 <= A[i] <= 10^4

// Sum of N over all test cases does not exceed 2*10^5
// Output
// For each test case print the given array in the order as described above.
// Example
// Input:
// 3
// 5 7
// 10 5 3 9 2
// 5 6
// 1 2 3 4 5
// 4 5
// 2 6 8 3

// Output:
// 5 9 10 3 2
// 5 4 3 2 1
// 6 3 2 8

// Explanation:
// Testcase 1: Sorting the numbers accoding to the absolute difference with 7, we have array elements as 5, 9, 10, 3, 2.
// Testcase 2: Sorting the numbers according to the absolute difference with 6, we have array elements as 5 4 3 2 1.
// Testcase 3: Sorting the numbers according to the absolute difference with 5, we have array elements as 6 3 2 8.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;// contains Collections framework


class Pair implements Comparable<Pair>{
    int num;
    int diff;
    Pair(){
    this.num = 0;
    this.diff = 0;
    }
    @Override
    public int compareTo(Pair o){
        return  this.diff - o.diff;
    }
}
class Main {
    public static void sort(int arr[],int K){
        Pair arr1[] = new Pair[arr.length];
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = new Pair();
            arr1[i].num = arr[i];
            arr1[i].diff = Math.abs(K - arr[i]);
        }
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i].num + " "); 
    }
    
    public static void main (String[] args) throws IOException {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int K = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            sort(arr,K);
            System.out.println();
        }
    }
}
