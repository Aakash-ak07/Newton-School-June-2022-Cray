// Given a number N your task is to print its first two digits in reverse order. For eg:- If the given number is 123 then the output will be 21.

static int firstTwo(int N){

    int digit = 0;
    while(N >= 10)
    {
        digit = N % 100;
        N = N/10;
    }
    int reverse = 0;
    while(digit != 0)
    {
        int x = digit % 10;
        reverse = reverse * 10 + x;
        digit /= 10; 
    }
    return reverse;
}


// Sample Input:-
// 3423

// Sample Output:-
// 43

// Sample Input:-
// 1234

// Sample Output:-
// 21
