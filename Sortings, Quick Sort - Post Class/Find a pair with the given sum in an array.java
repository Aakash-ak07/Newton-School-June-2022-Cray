// Given an unsorted integer array having distinct integers, find a pair with the given sum in it.
// First element of pair > second element of pair
// Input
// First line of input contains a single integer N, next line contains N space separated integers depicting the values of array and third line consist target sum.

// Constraints:
// 2<=N<=5*(10^5)
// 1<=A[i], target<=2*(10^9)
// Target
// Output
// Print the pair of integers which sum is target.
// Example
// Sample Input1:-
// 6
// 8 7 4 5 3 1
// 10

// Sample Output:-
// Pair found (7, 3)


// Sample Input2:
// 6
// 5 2 6 8 1 9
// 12

// Sample Output:
// Pair not found

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int partition(int arr[], int pivot, int start, int end) {
        int i = start, j = start;
        while(i <= end) 
        {
            if(arr[i] <= pivot) 
            {
            // region 1
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j]= temp;
                i++;
                j++;
            }
            else 
            // region 2
            i++;
        }
        return j - 1;
    }

    public static void quickSort(int arr[], int start, int end) {
        if(start >= end) return;

        int pivot = arr[end];
        int pi = partition(arr, pivot, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        quickSort(arr,0,n-1);
        int start=0,end=n-1;
        boolean isFound= false;
        while(start<end)
        {
            int tempT =(arr[start]+arr[end]);
            if(tempT==target)
            {
                System.out.print("Pair found "+"("+arr[end]+", "+arr[start]+")");
                isFound = true;
                start++; end --;
                break;
            }
            else if(tempT>target) end--;
            else start++;
        }
        if(isFound== false)
        System.out.print("Pair not found");
    }
}
