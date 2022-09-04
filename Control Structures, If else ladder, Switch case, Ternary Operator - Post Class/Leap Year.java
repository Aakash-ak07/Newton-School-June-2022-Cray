// Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.

import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {
       //Capture the user's input
       Scanner scanner = new Scanner(System.in);
       //Storing the captured value in a variable
       int n = scanner.nextInt();
       LeapYear(n);

    
 }
 static void LeapYear(int year){
    //Write code here
    if(year%100 == 0)
    {
        if(year%400 == 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    else if (year%4 == 0)
    {
        System.out.println("YES");
    }
    else 
    {
        System.out.println("NO");
    }
 } 
}

