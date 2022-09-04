import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = a+b;
       int diff = a-b;
       int multi = a*b;
       int div = a/b;

       System.out.println(sum);
       System.out.println(diff);
       System.out.println(multi);
       System.out.println(div);
    }
}
