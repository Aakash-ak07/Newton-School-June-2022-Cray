// Given an integer N, you have to print the given below pattern for N >= 3.
// Pattern for N = 4:-
// *
// *^*
// *^^*
// *****

static void Pattern(int N){
//Enter your code here
    for(int i = 1; i <= N+1; i++)
    {
        if (i==2);
            else
            {
              for(int j = 1; j <= i; j++)
                {
                 if (i == 1 || i ==N+1 || j == 1 || j == i)
                    System.out.print("*");
                 else
                    System.out.print("^");
                 }
                    System.out.println();
            }
    }
}
