// You are given two numbers n and p. You need to find n raised to the power p.

static int Power(int n,int p)
{
      if(p == 0)
      return 1;

      else if (p % 2 == 0)
      return Power(n, p/2) * Power(n, p/2);
      
      else
      return n * Power(n, p/2) * Power(n, p/2);
}


// Sample Input:
// 3
// 2 3
// 9 9
// 2 9

// Sample Output:
// 8
// 387420489‬
// 512
