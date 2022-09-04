// You are given an array A of size N. You need to find the integer not present in this array that is closest to K. The closeness between two numbers A[i] and A[j] is defined as abs(A[i] - A[j]).

// For Example:
// For given array A = [1,2,5,6,13]
// For given K = 12
// Output: 12

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            set.add(arr[i] = sc.nextInt());
        }
        int add = 1;
        while(k >= 0)
        {
            if(set.contains(k) == false)
            {
                System.out.print(k);
                break;
            }
            else if(set.contains(k - add) == false)
            {
                System.out.print(k - add);
                break;
            }
            else if(set.contains(k + add) == false)
            {
                System.out.print(k + add);
                break;
            }
            add++;
        }
    }
}
