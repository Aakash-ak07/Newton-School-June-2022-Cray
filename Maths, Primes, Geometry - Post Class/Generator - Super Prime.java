// For a given integer N, super primes are those integers from 1 to N whose multiples (other than themselves) do no exist in the range [1, N].
// Your task is to generate all super primes <= N in sorted order.
// Note: Super primes are not related to primes in any way.

public static void SuperPrimes(int n)
{
  for(int i = 1; i <= n; i++)
  {
    if(i * 2 > n)
    System.out.print(i+" ");
  }
}

// Sample Input:-
// 5

// Sample Output:-
// 3 4 5

// Sample Input:-
// 4

// Sample Output:-
// 3 4
