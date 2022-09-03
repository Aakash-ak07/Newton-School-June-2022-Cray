// Given a natural number N, your task is to print all the digits of the number in words. The words have to separated by space and in lowercase english letters.


static void Print_Digits(int N)
{
    //Enter your code here
    String str = Integer.toString(N); 
    int l = str.length();
    int num=1, New;
    int d =0;
    String digitWords = "";
    New=N;
    while(New>0)
    {
        d = New%10;
        switch (d)
        {        
            case 0:
                digitWords= "zero "+digitWords;
                break;
            case 1:
                digitWords= "one "+digitWords;
                break;
            case 2:
                digitWords= "two "+digitWords;
                break;
            case 3:
                digitWords= "three "+digitWords;
                break;
            case 4:
                digitWords= "four "+digitWords;
                break;
            case 5:
                digitWords= "five "+digitWords;
                break;
            case 6:
                digitWords= "six "+digitWords;
                break;
            case 7:
                digitWords= "seven "+digitWords;
                break;
            case 8:
                digitWords= "eight "+digitWords;
                break;
            case 9:
                digitWords= "nine "+digitWords;
                break;
        
        }
        New = New/10;
    }
    System.out.print(digitWords);
}

// Sample Input:-
// 1024

// Sample Output:-
// one zero two four
