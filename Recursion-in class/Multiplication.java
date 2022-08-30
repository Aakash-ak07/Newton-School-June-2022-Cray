static int  Multiply_by_recursion(int M, int N) 
{ 
  if (M < N)
  return Multiply_by_recursion(N , M);

  else if (N != 0)
  return(M + Multiply_by_recursion(M , N - 1));

  else
  return 0;
}



// Sample Input
// 2
// 2 3
// 3 4

// Sample Output
// 6
// 12
