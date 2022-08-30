//Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. 
//You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int X = 1;
        for(int i = 0 ; i < N/2 ; i++)
        {
            if( X < (arr[i]+arr[N-i-1])){
                X = arr[i]+arr[N-i-1];
            }
        }
        System.out.println(X);
    }
}


// Sample Input
// 4
// 3 1 1 4

// Sample Output
// 5
//Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.
