// Given an array containing N integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int longestSubArray (int[] arr, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int maxLength = 0;

        for(int i = 0; i < arr.length; i++)
        {
            preSum += arr[i];
            if(preSum == k)
            {
                maxLength =  i + 1;
            }
            if(!map.containsKey(preSum))
            {
                map.put(preSum, i);
            }
            if(map.containsKey(preSum - k))
            {
                // int idxpSumMK = map.get(preSum - k);
                if(maxLength < (i - map.get(preSum - k)))
                    maxLength = i - map.get(preSum - k);
            }
        }
        return maxLength;
    } 

    public static void main (String[] args) throws IOException{
                      // Your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       for(int i = 0; i < t; i++)
       {
           String [] srr = br.readLine().trim().split(" ");
           int n = Integer.parseInt(srr[0]);
           int k = Integer.parseInt(srr[1]);
           String ksrr[] = br.readLine().trim().split(" ");
           int [] arr = new int[n];
           for(int x = 0; x < n; x++)
           {
               arr[x] = Integer.parseInt(ksrr[x]);
           } 
           System.out.println(longestSubArray(arr, k));
        } 
    }
}



// Sample Input:
// 3
// 6 15
// 10 5 2 7 1 9
// 6 -5
// -5 8 -14 2 4 12
// 3 6
// -1 2 3

// Sample Output:
// 4
// 5
// 0
