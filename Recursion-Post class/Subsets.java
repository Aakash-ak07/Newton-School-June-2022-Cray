// Given an array of integers that might contain duplicates, return all possible subsets.
// Note:
// Elements in a subset must be in non-descending order.
// The solution set must not contain duplicate subsets.
// The subsets must be sorted lexicographically..

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader inputTaker = new BufferedReader(new InputStreamReader(System.in) );

        int t = Integer.parseInt(inputTaker.readLine());
        while (t-- > 0) 
        {
            int n = Integer.parseInt(inputTaker.readLine());
            int[] arr = new int[n];
            String arrs[] = inputTaker.readLine().split(" ");

            for (int i = 0; i < n; i++) 
            {
                arr[i] = Integer.parseInt(arrs[i]);
            }

            Set<String> set = populate(arr);

            List<String> ss = new ArrayList<>(set);

            Collections.sort(ss);

            for (String k : ss) 
            {

                System.out.print("(");
                System.out.print(k);
                System.out.print(")");
            }
            System.out.println();
        }
    }

    public static Set<String> populate(int[] arr) {

        Set<String> set = new HashSet<>();
        Arrays.sort(arr);

        int count = (int) Math.pow(2, arr.length);
        int n = arr.length;

        for (int i = 0; i < count; i++) {

            StringBuffer subset = new StringBuffer();

            for (int j = 0; j < n; j++) {

                // 1<<j = 2^j
                if ( (i & (1 << j)) != 0) {

                    subset.append(arr[j] + " ");
                }
            }
            // (  1 2 3  ) -> (1 2 3)
            String s = subset.toString().trim();

            if ( !set.contains(s) ) {

                set.add(s);
            }
        }
        return set;
    }
}


// Sample Input:
// 2
// 3
// 1 2 2
// 4
// 1 2 3 3

// Sample Output:
// ()(1)(1 2)(1 2 2)(2)(2 2)
// ()(1)(1 2)(1 2 3)(1 2 3 3)(1 3)(1 3 3)(2)(2 3)(2 3 3)(3)(3 3)
