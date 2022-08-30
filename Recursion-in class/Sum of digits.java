// Given a number N, find the sum of all the digits of the number. Note: Use a recursive method to solve this problem.

static long  Sum(long  n) 
{ 
  if(n == 0)
  return 0;

  return n % 10 + Sum(n/10);
}

// Sample Input
// 2
// 25
// 28

// Sample Output
// 7
// 10
