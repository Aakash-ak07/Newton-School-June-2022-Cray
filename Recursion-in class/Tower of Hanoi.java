import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void toH (int n, char s, char d, char h)
    {
        if (n == 0)
        return;
        toH(n-1, s, h, d);
        System.out.println(n + ":" + s + "->" + d);
        toH(n-1, h , d , s);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toH(n,'A', 'C', 'B');
    }
}

// Input
// 2

// Output
// 1:A->B
// 2:A->C
// 1:B->C
