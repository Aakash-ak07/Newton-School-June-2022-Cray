// Natsu is fighting with a dragon that has A Health and B attack power and Natsu has C health and D attack power. The fight goes in turns first Natsu will attack the Dragon then Dragon will attack Natsu and this goes on. The fight will stop when either the dragon's or Natsu's health drops zero or below. 
// Your task is to check whether Natsu will able to slay the Dragon or not.

static int DragonSlayer(int A, int B, int C,int D){
//Enter your code here
   int x = C/B;
   {
     if (C%B!= 0) 
     x++;
   }

   int y = A/D;
   {
   if (A%D !=0)
   y++;
   }

   if (x<y)
   {
       return 0;
   }
   else
   {
       return 1;
   }
}

// Sample Input:-
// 8 2 5 3

// Sample Output:-
// 1
