// Sara want to buy a toy and for this purpose she goes to a toy shop, there is a special offer going in the toy shop that is if you buy one toy you can get extra k toys for free now Sara wonders what is the minimum amount of money she need to spend so that she can get all the toys.
// You are given some queries containing values of k you need to print the minimum amount of cost Sara need to spend to get all the toys for each value of k.
// Sample Input :
// 6 2
// 100 20 50 10 2 5
// 3
// 4
// Sample Output :
// 7
// 7
// Explanation:
// She can buy toy at index 5 and get toys at index 1, 2, 3 for free than she buy toy at index 6 and get toy at index 4 for free so the total cost becomes 7


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 1; i <= Q; i++)
        {
            int k = sc.nextInt();
            int buyToy = n/(k + 1);
            if(n %(k + 1) != 0)
                buyToy++;
            int result = 0;
            for(int j = 0; j < buyToy; j++)
            {
                result += arr[j];
            }
            System.out.println(result);
        }
    }
}
