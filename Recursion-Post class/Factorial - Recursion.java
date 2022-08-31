//Find factorial of a given number N.

static int Factorial(int N)
{
    if(N == 1)
    return 1;

    else
    return  N*Factorial(N-1);
}


// Sample Input:-
// 5

// Sample Output:-
// 120
