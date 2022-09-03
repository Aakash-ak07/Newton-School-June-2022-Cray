// A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
// Given a number N, your task is to find the closest Magic number from the given number N.
// Note:- If more than one answer exists return the minimum one

static int MagicNumber(int N){
//Enter your code here
int magNo = 0;
    for(int i=0;i<=1000;i++){
        if(checkIfContain7And9(N-i)){
            magNo = N-i;
            break;
        }
        if(checkIfContain7And9(N+i)){
            magNo = N+i;
            break;
        }
    }
    return magNo;
}
static boolean checkIfContain7And9(int n){
    boolean ifSeven = false;
    boolean ifNine = false;
    while(n>0){
        int rem = n%10;
        if(rem == 7)
            ifSeven = true;
        if(rem == 9)
            ifNine = true;
        n = n/10;
    }
    return (ifSeven && ifNine);
}


// Sample Input:-
// 8

// Sample Output:-
// 79

// Sample Input:-
// 900

// Sample Output:-
// 897
