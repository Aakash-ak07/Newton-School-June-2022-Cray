static int MagicNumber(int N){
    int mgcNo = 0;
    for(int i = 0; i <= 1000; i++)
    {
        if(numberContain7And9(N - i))
        {
            mgcNo = N - i;
            break;
        }
        if(numberContain7And9(N + i))
        {
            mgcNo = N + i;
            break;
        }
    }
    return mgcNo;
}

static boolean numberContain7And9(int n)
{
    boolean is7 = false;
    boolean is9 = false;

    while(n > 0)
    {
        int reminder = n % 10;

        if(reminder == 7)
            is7 = true;
        if(reminder == 9)
            is9 = true;

        n = n / 10;
    }
    return(is7 && is9);
}
