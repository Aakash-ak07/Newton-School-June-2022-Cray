// Tom has N sticks that are distinguishable from each other. The length of the i-th stick is L[i]. He is going to form a triangle using three of these sticks. Let a, b, and c be the lengths of the three sticks used. Here, all of the following conditions must be satisfied:

// a < b+c
// b < c+a
// c < a+b

// How many different triangles can be formed? Two triangles are considered different when there is a stick used in only one of them.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int triAngles(int[] L, int n)
    {
        Arrays.sort(L);
        int count = 0;
        for(int i = n-1; i >= 1; i--)
        {
            int left = 0;
            int right = i - 1;
            while(right > left)         // (left < right)
            {
                if(L[left] + L[right] > L[i])
                {
                    count += right - left;
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return count;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        for (int i = 0; i < n; i++)
        {
            L[i] = sc.nextInt();
        }
        System.out.print(triAngles(L, n));
    }
}



// Sample Input 1
// 4
// 3 4 2 1

// Sample Output 1
// 1

// Sample Input 2
// 3
// 1 1000 1

// Sample Output 2
// 0

// Explanation:
// Fortestcase1 the only triangle that can be formed is 2 3 4
