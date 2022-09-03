// Ram is studying in Class V and has four subjects, each subject carry 100 marks. He passed with flying colors in his exam, but when his neighbour asked how much percentage did he got in exam, he got stuck in calculation. Ram is a good student but he forgot how to calculate percentage. Help Ram to get him out of this problem.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      int b= sc.nextInt();
      int c= sc.nextInt();
      int d= sc.nextInt();

      System.out.println(((a+b+c+d)/4));
                     
    }
}

// Sample Input 1:
// 25 25 25 25

// Sample Output 1:
// 25
