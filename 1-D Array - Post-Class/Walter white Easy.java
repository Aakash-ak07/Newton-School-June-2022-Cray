// Walter white is considered very intelligent person. He has a problem to solve. As he is suffering from cancer, can you help him solve it?
// Given two integer arrays C and S of length c and s respectively. Index i of array S can be considered good if a subarray of length c can be formed starting from index i which is complimentary to array C.
// Two arrays A, B of same length are considered complimentary if any cyclic permutation of A satisfies the property (A[i]- A[i-1]=B[i]-B[i-1]) for all i from 2 to length of A (1 indexing).
// Calculate number of good positions in S .
// Cyclic Permutation
// 1 2 3 4 has 4 cyclic permutations 2 3 4 1, 3 4 1 2, 4 1 2 3,1 2 3 4
// Input
// First line contains integer s (length of array S).
// Second line contains s space separated integers of array S.
// Third line contain integer c (length of array C).
// Forth line contains c space separated integers of array C.

// Constraints:
// 1 <= s <=1000000
// 1 <= c <=1000000
// 1 <= S[i], C[i] <= 10^9
// Output
// Print the answer.

// Example
// Input :
// 9
// 1 2 3 1 2 4 1 2 3
// 3
// 1 2 3

// Output :
// 4
// Explanation :
// index 1- 1 2 3 matches with 1 2 3
// index 2- 2 3 1 matches with 2 3 1(2 3 1 is cyclic permutation of 1 2 3)
// index 3- 3 1 2 matches with 3 1 2(3 1 2 is cyclic permutation of 1 2 3)
// index 7- 1 2 3 matches with 1 2 3

// Input :
// 4
// 3 4 3 4
// 2
// 1 2

// Output :
// 3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int countdigits(int C1)
            {
                int count = 0;
                while (C1>0) {
                    count++;
                    C1 = C1 / 10;
                }
                return count;
            }

    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
 
            int S = sc.nextInt();
            int[] arr = new int[S];
            for(int i = 0; i < S; i++){
                arr[i]=sc.nextInt();
            }
            //Converting to String array
            String[] arrstr = new String[arr.length];
 
            for (int i = 0; i < arr.length; i++) {
                arrstr[i] = String.valueOf(arr[i]);
            }
            Arrays.toString(arrstr);

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrstr.length; i++) {
                sb.append(arrstr[i]);
            }
            String str = sb.toString();  //str contains the S input
            
            // --------------------------------------------------------------
            int C = sc.nextInt();
            int[] arr1 = new int[C];
            //int[] arrc = new int[C];
            for(int i = 0; i < C; i++){
                arr1[i]=sc.nextInt();
            }

            //Converting to String array
            String[] arrstr1 = new String[arr1.length];
 
            for (int i = 0; i < arr1.length; i++) {
                arrstr1[i] = String.valueOf(arr1[i]);
            }
            Arrays.toString(arrstr1);

            //StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrstr1.length; i++) {
                sb.append(arrstr1[i]);
            }
            String str1 = sb.toString();
            //str contains the C input
            int C1 = Integer.parseInt(str1); //converted to integer
            //cyclic(C1);
                        int num = C1;
                        int n = countdigits(C1);
                        int[] arrc = new int[C];
                        
                        for(int i=0; i<=C; i++){
                            
                            arrc[i]=num; // containing the cyclic values
                            int rem = num % 10;
                            int dev = num / 10;
                            num = (int)((Math.pow(10, n - 1)) * rem + dev);

                            if (num == C1)
                                break;
                        }
            // ---------------------------------------------------------------------------
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            for(int i=0; i<S; i++){
            int index = str.indexOf(arrc[i]);
            arrlist.add(index);
        }

        System.out.println(arrlist.size());
    }
}
