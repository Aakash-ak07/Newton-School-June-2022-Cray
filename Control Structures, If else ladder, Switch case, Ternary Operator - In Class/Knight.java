// Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y). Your task is to find the number of positions knight can jump into in a single move.

static int Knight(int X, int Y){
//Ener your code here
int P[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
    int Q[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; 
    int n = 9; 
    int count = 0; 
    for (int i = 1; i < 9; i++) { 
        int x = X + P[i-1]; 
        int y = Y + Q[i-1]; 
        if (x >= 1 && y >= 1 && x < n && y < n) 
            count++; 
        } 
    return count;
}

// Sample input:-
// 4 5

// Sample Output:-
// 8

// Explanation:-
// Positions:- (3, 3), (5, 3), (3, 7), (5, 7), (6, 6), (6, 4), (2, 6), (2, 4)
