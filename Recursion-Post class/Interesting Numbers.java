//Interesting Numbers
// The number is positive
// The digits of the number when considered from left to right, they form an alternate odd even sequence. 
// A sequence is an alternate odd even sequence when the numbers present on even indices in the sequence are odd, and the numbers present on the odd indices are even, where the sequence is having 1 based indexing.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    static boolean evenFlag;
    static int[] even = {0, 2, 4, 6, 8};
    static int[] odd = {1, 3, 5, 7, 9};

    public static String interestingNum(int k)
    {
        int quo = k / even.length;
        int reminder = k % even.length;

        if(quo < even.length)
        {
            String baseCaseAns = quo == 0 ? "" + odd[reminder] : ""  + even[quo] + odd[reminder];
            return baseCaseAns;
        }
        String recursionAns = interestingNum(quo);

        recursionAns += evenFlag ?  even[reminder] : odd[reminder];
        // flip the flag even to odd and odd to even 2147... 8360 like this num..
        evenFlag = !evenFlag;

        return recursionAns;
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int z = 0; z < t; z++)
        {
            int k = scn.nextInt();

            evenFlag = true;
            String num;
            if(k <= 4)
            {
                num = ""+ even[k];    
            }
            else
            {
                num = interestingNum(k);
            }
            System.out.println(num);
        }
    }
}

// Sample Input 1:
// 1
// 3

// Sample Output 1:
// 6

// Explanation
// The first three interesting numbers are [2, 4, 6]. So the 3rd smallest number is 6.
