// On his way to Alwar, Bunty noticed 10^K road signs (numbered 0 through 10^K −1). For each valid i, the sign with the number i had the integer i written on one side and 10^K- i-1 written on the other side.
// Now, Alwar is wondering — how many road signs have exactly two distinct decimal digits written on them (on both sides in total)? Since this number may be large, compute it modulo 10^9+7.
// For example, if K = 3, the two integers are written on the road sign 363 are 363 and 636, and they contain two distinct digits 3 and 6, but on the road sign 362, there are integers 362 and 637, which contain four distinct digits — 2, 3, 6 and 7. On- road signs 11, there are integers 11 and 988, which contain three distinct digits — 1, 9, and 8.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long alwar(long k, long a)
    {
        long mod = 1000000007;
        if(k == 0)
            return 1;
        
        if(k % 2 != 0)
            return (a * alwar((k - 1)/2,((a * a) % mod)))% mod;
        
        return alwar(k / 2, ((a * a) % mod));
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long t= sc.nextLong();
        long mod = 1000000007;
        while(t-- > 0)
        {
            int k = sc.nextInt();
            long ans = alwar(k - 1, 2);
            ans = ans * 10;
            ans = ans % mod;
            System.out.println(ans);
        }
    }
}

// Sample Input:
// 1
// 2
// Sample Output:
// 20
