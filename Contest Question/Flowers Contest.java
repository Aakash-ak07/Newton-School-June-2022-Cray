// The flower shop near his house sells flowers of N types. It is found that the store has Ai flowers of the i-th type. We like odd numbers. 
// Therefore, we have decided that there should be an odd number of flowers of each type in the bouquet, and the total number of flowers in the bouquet should also be odd.
// Determine the maximum number of flowers the bouquet can consist of.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
       Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    int x=sc.nextInt();
		    if(x%2==0){
		        sum+=x-1;
				x-=1;
				}
		    else
		        sum+=x;
			if(x<min)
			min=x;
		}
		if(sum%2==0)
		    sum=sum-min;
		System.out.println(sum);
    }
}


// Sample input
// 3
// 3 5 8

// Sample output
// 15
