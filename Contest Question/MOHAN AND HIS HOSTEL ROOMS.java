// Mohan was so excited to visit his college NIT Arunachal Pradesh campus after COVID along with his friends Shreya and Anuj. The Warden allocated the hostel room for him but he was curious to know about the fact that how students are getting rooms.
// The warden told him that those students whose roll no are divisible by 2 they will get PAPUM HOSTEL and if it odd then they will get LOHIT HOSTEL. If the student is girl, then she will get ‘Upper Wing’ otherwise ‘Lower Wing’.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int r = sc.nextInt();
            char s = sc.next().charAt(0);
        
            if(r % 2 == 0)
            {
                System.out.print("PAPUM" + " ");
                if(s == 'G')
                    System.out.println("U");
                else    
                    System.out.println("L");
            }
            else
            {
                System.out.print("LOHIT" + " ");
                if(s == 'G')
                    System.out.println("U");
                else    
                    System.out.println("L");
            }
        }
    }
}


// Sample Input
// 2
// 30 B
// 35 G
// Sample Output
// PAPUM L
// LOHIT U
// Explanation
// Here 30 is evenly divisible by two and B is the boy so he gets the Papum Hostel and allocated the room at lower wing.
