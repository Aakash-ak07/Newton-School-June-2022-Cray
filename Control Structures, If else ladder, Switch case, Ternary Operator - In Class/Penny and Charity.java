// There is a charity which has N people. Penny wants to donate some of her clothes to the charity in such a way that all people receive equal clothes and each individual receives more than 1. 
// If she has M clothes with her what is the maximum number of clothes one individual can get?
static int Charity(int N, int M){
//Enter your code here
int clo = M/N;

    if (clo<=1)
    {
        return -1;
    }
    else
    {
        return clo;
    }
}


// Sample Input
// 6 20

// Sample Output
// 3
