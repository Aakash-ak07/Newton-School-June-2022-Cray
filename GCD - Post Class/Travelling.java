// Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd (int a, int b)
    {
        if(b == 0)
        return a;
        return gcd(b, a % b);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i< arr.length; i++)
        {
            int x = 0;
            x = arr[i] - s;
            x = Math.abs(x);
            arr[i] = x;
        }
        int temp = gcd(arr[0], arr[1]);
        for(int i = 1; i<n-1; i++)
        {
            temp =  gcd(temp, arr[i+1]);
        }
        System.out.println(temp);
    }
}


// Sample Input:-
// 3 3
// 1 7 11

// Sample Output:-
// 2

// Sample Input:-
// 3 81
// 33 105 57

// Sample Output:-
// 24
