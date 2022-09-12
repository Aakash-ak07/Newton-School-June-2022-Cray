// Sara has an exam of geometry in which the following question is asked:-
// Given three points A, B, and C. Check if there exists a point and an angle such that if we rotate the page around the point by the angle, 
// the new position of A is the same as the old position of B, and the new position of B is the same as the old position of C.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void geoExam (int ax, int ay, int bx, int by, int cx, int cy) 
    {   //calculate distance
        long dist1 = (long)Math.pow(bx - ax, 2) + (long)Math.pow(by - ay, 2);
        long dist2 = (long)Math.pow(cx - bx, 2) + (long)Math.pow(cy - by, 2);
        
        // if distanceis not equal
        if (dist1 != dist2)
            System.out.print("No");
            //if the point in same line
        else if(bx == ((ax+cx)/2.0) && by == ((ay+cy)/2.0))
            System.out.print("No");
        else
            System.out.print("Yes");
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner s =new Scanner(System.in);
        int ax =s.nextInt();
        int ay =s.nextInt();
        int bx =s.nextInt();
        int by =s.nextInt();
        int cx =s.nextInt();
        int cy =s.nextInt();
        geoExam (ax,ay,bx,by,cx,cy);

    }
}


// Sample Input:-
// 0 1
// 1 1
// 1 0

// Sample Output:-
// Yes

// Explanation:-
// (0.5, 0.5) by 90

// Sample Input:-
// 1 1
// 0 0
// 1000 1000

// Sample Output:-
// No
