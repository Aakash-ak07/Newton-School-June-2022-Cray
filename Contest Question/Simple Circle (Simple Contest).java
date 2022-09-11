import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long result = arr[n-1];
        for(int i = n-2, z = 1; z < n-2; z += 2, i -= 1)
        {
            result = result + 2 * arr[i];
        }
        System.out.println(result);
    }
}


// People prefer smartness over anything. You know N people and their smartness level. You need to place people in a circle one by one in any order. 
// The happiness that a person gets is equal to the minimum smartness value of its clockwise neighbour and its anti-clockwise neighbour at the time when he enters the circle. 
// You can ask the person to stand at any position of the circle that you like. The happiness of the first person to enter is 0 since he has no neighbours.

// Sample Input
// 4
// 2 2 1 3

// Sample Output
// 7

// Explanation
// We ask the persons to enter the circle in this particular order of smartness [3, 2, 2, 1].
// Step 1:
// 3

// Happiness attained = 0
