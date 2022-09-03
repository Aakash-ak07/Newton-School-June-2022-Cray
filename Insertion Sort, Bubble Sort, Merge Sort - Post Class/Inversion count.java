// Calculate inversion count of array of integers.
// Inversion count of an array is quantisation of how much unsorted an array is. A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
// Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static long inversionCount (long[] arr, int l, int m, int r)
    {
        int i = l, j = m, k = 0;
        long count = 0;
        long temp[] = new long[(r - l + 1)];
        while((i < m) && (j <= r))
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                ++k;
                ++i;
            }
            else
            {
                temp[k] = arr[j];
                count += (m - i);
                ++k;
                ++j;
            }
        }
        while(i < m)
        {
            temp[k] = arr[i];
            ++k;
            ++i;
        }
        while (j <= r) 
        {
            temp[k] = arr[j];
            ++k;
            ++j;
        }
        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = temp[k];
        }
        return count;
    }

    public static long sortAndCount (long[] arr, int l, int r)
    {
        long count = 0;
        if (r > l)
        {
            int m = (l + r) / 2;
            count += sortAndCount(arr, l, m);
            count += sortAndCount(arr, m + 1, r);
            count += inversionCount(arr, l, m + 1, r);
        }
        return count;
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        }
        System.out.println(sortAndCount(arr, 0, arr.length-1));
    }
}

// Sample Input
// 5
// 1 1 3 2 2

// Sample Output
// 2

// Sample Input
// 5
// 5 4 3 2 1

// Sample Output
// 10


    
