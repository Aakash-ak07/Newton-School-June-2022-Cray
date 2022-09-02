// Recently Ultron invented a new structure that he has called Xor Grid. It is an infinitely large grid G filled with numbers based on these three rules:
// 1. G[1, c] = 1 for all c ≥ 1
// 2. G[r, 1] = r for all r ≥ 1
// 3. G[r, c] = G[r - 1, c] xor G[r, c - 1] for all r > 1 and c > 1
// Now Ultron is wondering, what are the xor sums of all the numbers within some specific rectangles of the Xor Grid?


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static long gridding (long r, long c, long i)
    {
        r += (1L << 62) - (1L << i) + 1;
        c += (1L << i);
        if((r & c) > 0) 
        return (1L << i);

        return 0;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long r1 = sc.nextLong();
        long r2 = sc.nextLong();
        long c1 = sc.nextLong();
        long c2 = sc.nextLong();
        r1--;
        c1--;

        long ans = 0;
        for(int  i = 0; i < 62; i++)
        {
            ans ^= gridding(r2, c2, i);
            ans ^= gridding(r1, c2, i);
            ans ^= gridding(r2, c1, i);
            ans ^= gridding(r1, c1, i);
        }
        System.out.println(ans);
    }
}


// Sample Input:-
// 1 2 1 4

// Sample Output:-
// 0

// Explanation:-
// Matrix:-
// 1 1 1 1 1 1. .. ..
// 2 3 2 3 2 3. .. ..
// 3 0 2 1 3 0. .. ..
// Required sum = 1^1^1^1^2^3^2^3 = 0
