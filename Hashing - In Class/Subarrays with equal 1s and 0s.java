//Given an array arr[] of size N containing 0s and 1s only. The task is to count the subarrays having an equal number of 0s and 1s.

// Sample Input
// 7
// 1 0 0 1 0 1 1

// Sample Output
// 8

// The index range for the 8 sub-arrays are:
// (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)
// (2, 5), (0, 5), (1, 6)

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static long subarrays1and0(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        long count = 0; 
        int preSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            arr[i] = -1;
        }
        for(int i = 0; i < arr.length; i++)
        {
            preSum = preSum +arr[i];
            if(map.containsKey(preSum))
            {
                int initalCount = map.get(preSum);
                count += initalCount;
                map.put(preSum, initalCount + 1);
            }
            else
            {
                map.put(preSum, 1);
            }
        }
        return count;
    } 
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(subarrays1and0(arr));
    }
}

