// Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
// - >P number of Questions will have A as the correct option
// - >Q number of Questions will have B as the correct option
// - >R number of Questions will have C as the correct option
// - >S number of Questions will have D as the correct option
// Sara doesn't know the order of the questions. If Sara filled the MCQs optimally using the above information what will be the maximum of minimum marks she can get.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();

        if(P>Q && P>R && P>S)
        {
            System.out.println(P);
        }
        else if (Q>R && Q>S)
         {
             System.out.println(Q);
         }
         else if (R>S)
         {
             System.out.println(R);
         }
         else 
         {
             System.out.println(S);
         }
    }
}


