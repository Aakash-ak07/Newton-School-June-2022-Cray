// You are given an array(Arr) of N Distinct integers. You have to find the sum of minimum element of all the subarrays (continous) in that array. See Sample for better understanding.
// Input
// The first line of input contains N, the size of the array
// The second line of input contains N space-separated integers
// Constraints
// 2 ≤ N ≤ 100000
// 1 ≤ Arr[i] ≤ 1000000000
// Output
// The output should contain single integers, the sum of minimum element of all the subarrays in that array.
// Example
// Sample Input
// 3
// 1 2 3

// Sample Output
// 10

// Explaination
// all subarrays [1] [1,2] [1,2,3] [2] [2,3] [3]
// Sum of minimums : 1 + 1 + 1 + 2 + 2 + 3 = 10

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static class pair 
    {
        int first, second;

        public pair(int first, int second) 
        {
            this.first = first;
            this.second = second;
        }
    }
    static long sumSubarrayMins(long A[], int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<pair> s1 = new Stack<pair>();
        Stack<pair> s2 = new Stack<pair>();

        for (int i = 0; i < n; ++i) 
        {
            int cnt = 1;

            while (!s1.isEmpty() && (s1.peek().first) > A[i]) 
            {
                cnt += s1.peek().second;
                s1.pop();
            }

            s1.push(new pair((int) A[i], cnt));
            left[i] = cnt;
        }

        for (int i = n - 1; i >= 0; --i) 
        {
            int cnt = 1;

            while (!s2.isEmpty() && (s2.peek().first) >= A[i]) 
            {
                cnt += s2.peek().second;
                s2.pop();
            }

            s2.push(new pair((int) A[i], cnt));
            right[i] = cnt;
        }

        long result = 0;

        for (int i = 0; i < n; ++i)
            result = (result + A[i] * left[i] * right[i]);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(sumSubarrayMins(arr, n));
    }
}
