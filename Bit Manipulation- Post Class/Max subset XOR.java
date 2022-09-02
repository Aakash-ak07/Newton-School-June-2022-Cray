// Given a set of positive integers. Find the maximum xor of a non-empty subset from the given set.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    static final int INT_BITS = 32;

    public static int maxSubsetXOR (int []arr, int n)
    {
        int idx = 0;
        for(int i = INT_BITS-1; i >= 0; i--)
        {
            int maxInd = idx;
            int maxElement = Integer.MIN_VALUE;
            for(int j = idx; j < n; j++)
            {
                if((arr[j] & (1 << i)) != 0 && arr[j] > maxElement)
                {
                    maxElement = arr[j];
                    maxInd = j;
                }
            }

            if(maxElement == -2147483648)
                continue;

            int temp = arr[idx];
            arr[idx] = arr[maxInd];
            arr[maxInd] = temp;

            maxInd = idx;

            for(int j = 0; j < n; j++)
            {
                if(j != maxInd && (arr[j] & (1 << i)) !=0)
                arr[j] = arr[j] ^ arr[maxInd];
            }
            idx++;
        }
        int result = 0;
        for(int i = 0; i < n; i++)
            result ^= arr[i];
            return result;
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxSubsetXOR(arr, n));
    }
}


// Sample Input:
// 3
// 2 4 5

// Sample Output:
// 7

// Explanation:
// Subset {2, 5} has the maximum xor
