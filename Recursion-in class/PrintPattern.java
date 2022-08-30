static void printPattern(int n,int curr, boolean flag)
{
//Enter your code here
    System.out.print(curr + " ");
    if (flag == false && n == curr)
    return ;
    if(flag)
    {
        if(curr -5 > 0)
            printPattern(n, curr-5, true);
        
        else
            printPattern(n, curr-5, false);
    }
    else
        printPattern(n, curr+5, false);
}



// Sample Input:
// 2
// 16
// 10

// Sample Output:
// 16 11 6 1 -4 1 6 11 16
// 10 5 0 5 10

// Explanation:
// We basically first reduce 5 one by one until we reach a negative or 0. After we reach 0 or negative, we one by one add 5 until we reach N.
