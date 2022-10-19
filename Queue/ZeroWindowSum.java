/*
You are given an array arr of length "n" and a window of size "k". Your task is to find the window with zero sum. If there exists multiple windows, you need to print the first occurring window index and index start with 1 and if no such window exists print -1.
Input
The first line of the input contains n, k.
The second line of the input contains the value of the array.
Constraints
1 <= k < n <= 1e5
arr[i] lies in [-1, 0, 1]
Output
Print the window number, If multiple such windows exists print the first window number with zero sum, If no window exists print -1.
Example
Sample Input 1:
4 3
1 0 -1 1
Sample Output 1:
1
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    Queue<Integer> qu = new LinkedList<>();
    int sum =0;
    for(int i=0;i<k;i++){
        qu.add(arr[i]);
        sum+=arr[i];
    }
    if(sum==0){
        System.out.println("1");
        return;
    }

    for(int i=k;i<n;i++){
        qu.add(arr[i]);
        sum=sum+arr[i];
        sum = sum-qu.poll();
        if(sum==0){
            System.out.println(i-k+2);
            return;
        }
    }
    System.out.println("-1");                
    }
}
