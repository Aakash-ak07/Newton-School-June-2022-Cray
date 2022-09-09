// For a number N we have N! unique permutations. A permutation is a sequence of integers from 1 to N of length N containing each number exactly once.
// For a positive integer X, X! = 1 * 2 * 3 *...* X-1 * X
// Your task is to find the Kth smallest permutation when all possible permutations of size N are arranged in sorted order.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
    public static String kthPermutation(int n, int k) {
        k = k-1;
        int[] numbers = new int[n];
        int[] indices = new int[n];

        for (int i = 0; i < n; i++)
            numbers[i] = i + 1;
            int divisor = 1;
        for (int place = 1; place <= n; place++)
        {
            if((k / divisor) == 0)
                break;  
    
            indices[n-place] = (k / divisor) % place;
            divisor *= place;
        }
        for (int i = 0; i < n; i++)
        {
            int index = indices[i] + i;
           
            if(index != i)
            {
                int temp = numbers[index];
                for(int j = index; j > i; j--)
                   numbers[j] = numbers[j-1];
                numbers[i] = temp;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<numbers.length;j++){
            sb.append(numbers[j]);
        }
        return sb.toString();   
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(kthPermutation(n,k));
    }
}


// Sample Input:-
// 3 5

// Sample Output:-
// 312

// Explanation:-
// All permutations of length 3 are:-
// 123
// 132
// 213
// 231
// 312
// 321

// Sample Input:-
// 11 2

// Sample Output:-
// 1234567891110
