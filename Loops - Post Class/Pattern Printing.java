// Given a positive integer N, your task is to print a right angle triangle pattern of consecutive numbers of height N.
// For N = 5, the following pattern is printed.
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

static void pattern(int n){
//enter your code here
    for(int i=1; i<=n;i++)
    {
        for( int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }    
}
