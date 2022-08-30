//Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[][] = new int[N][N];
    for (int p=0 ;p<N ;p++)
    {
      for (int o=0;o<N;o++)
      {
        a[p][o]=sc.nextInt();
      }
    }
    for (int w=1;w<=2;w++)
    {
      for (int i = 0; i < N / 2; i++)
      {
        for (int j = i; j < N - i - 1; j++) 
        {
          int temp = a[i][j];
          a[i][j] = a[N - 1 - j][i];
          a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
          a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
          a[j][N - 1 - i] = temp;
        }
      }
      for (int x = 0;x < N; x++) 
      {
        for (int v = 0; v < N; v++)
        System.out.print( a[x][v] + " ");
        System.out.println();
      }
      System.out.println();
    }
  }
}


// Sample Input
// 2
// 3 4
// 7 6

// Sample Output
// 7 3
// 6 4

// 6 7
// 4 3
