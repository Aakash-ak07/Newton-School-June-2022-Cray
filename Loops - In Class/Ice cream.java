// Sara is fond of ice- cream initially she had N icecreams with her. If Sara eats exactly half of the ice cream she has in a day and the remaining icecreams get tripled each night. How many ice creams does Sara have at the end of D days?
// Note:- Take floor value while dividing by 2.

static int Icecreams (int N, int D){
//Enter your code here
for(int i = 1; i<=D; i++)
{
int a = N/2;
N= (N-a)*3;
}
return N;
}

// Sample Input:-
// 5 1

// Sample Output:-
// 9

// Explanation:-
// Sara will eat 2 ice creams and the remaining 3 will be tripled i. e 9.
