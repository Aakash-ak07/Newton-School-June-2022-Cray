// In an 8X8 chessboard. Given the position of the Enemy Queen(X, Y) and the King(P, Q) your task is to check whether the king is in an attacking position by the queen i.e. you have to check if the king is in the check position by the queen or not.


static int QueenAttack(int X, int Y, int P, int Q){
//Enter your code here
 if (X == P)
    return 1;

 if (Y == Q)
    return 1;

    if (Math.abs(X-P)==Math.abs(Y-Q))
    return 1;

    return 0;
}


// Sample Input:-
// 1 1 5 5

// Sample Output:-
// 1

// Sample Input:-
// 3 4 6 6

// Sample Output:-
// 0
