// You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
// Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        boolean isOnePresent = false;
        int r, c;

        while (tc -- > 0) {
            String arr1[] = sc.nextLine().split(" ");
            r = Integer.parseInt(arr1[0]);
            c = Integer.parseInt(arr1[1]);

            String allOnes = "", allZeros = "";
            for (int i = 0; i < c; i++) {
                allOnes += "1 ";
                allZeros += "0 ";
            }

            for (int i = 0; i < r; i++) {
                String line = sc.nextLine();
                if (line.indexOf('1') == -1) { // -1 -> 1 not present
                    System.out.println(allZeros);
                } else {
                    System.out.println(allOnes);
                }
            }
        }
    }
}


// Input:
// 2
// 5 4
// 1 0 0 0
// 0 0 0 0
// 0 1 0 0
// 0 0 0 0
// 0 0 0 1
// 1 2
// 0 0

// Output:
// 1 1 1 1
// 0 0 0 0
// 1 1 1 1
// 0 0 0 0
// 1 1 1 1
// 0 0

// Explanation:
// Testcase1: rows = 5 and columns = 4
// The given matrix is
// 1 0 0 0
// 0 0 0 0
// 0 1 0 0
// 0 0 0 0
// 0 0 0 1
// Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
// The final matrix is
// 1 1 1 1
// 0 0 0 0
// 1 1 1 1
// 0 0 0 0
// 1 1 1 1
