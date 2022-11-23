// Given two arrays of size N which have the same values but in different orders, we need to make a second array the same as a first array using a minimum number of swaps.

// Note:- It is guaranteed that the elements of the array are unique
// Input
// First line of input contains the size of array N, second line of input contains N space separated integers depicting values of first array, third line of input contains N space separated integers depicting values of second array.

// Constraints:-
// 1 < = N < = 10000
// 1 < = Arr[i] < = 1000000000
// Output
// Print the minimum number of swaps required to make the second array equal to first.
// Example
// Sample Input:-
// 5
// 1 2 3 4 5
// 3 1 2 5 4

// Sample Output:-
// 3

// Sample Input:-
// 4
// 3 6 4 8
// 4 6 8 3

// Sample Output:-
// 2


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int minSwapsToSort(int arr[], int n) {
        ArrayList<ArrayList<Integer>> arrPos = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            arrPos.add(new ArrayList<Integer>(Arrays.asList(arr[i], i)));
        }
        Collections.sort(arrPos, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        
        boolean[] vis = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) 
        {
            if (vis[i] || arrPos.get(i).get(1) == i)
                continue;
            int cycle_size = 0;
            int j = i;
            while (!vis[j]) 
            {
                vis[j] = true;
                j = arrPos.get(j).get(1);
                cycle_size++;
            }
            ans += (cycle_size - 1);
        }
        return ans;
    }

    static int minSwapToMakeArraySame(int a[], int b[], int n) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) 
        {
            mp.put(b[i], i);
        }
        for (int i = 0; i < n; i++)
            b[i] = mp.get(a[i]);
        return minSwapsToSort(b, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) 
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println(minSwapToMakeArraySame(arr, arr2, n));
    }
}
