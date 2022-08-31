// Person A and Person B uses an encryption based system for their conversation. 
// Each conversation message is encoded from the source end and decoded in the destination end using a shared private positive number key known to each other.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int encDec=sc.nextInt();
        String pattern=sc.next();
        String msg=sc.next();
        String out="";
        if(encDec == 1){
            int i;
            for(i=0;i<pattern.length();i++){
                int num=pattern.charAt(i)-'0';
                if(num<0 || num>9){
                    System.out.println(-1);
                    return;
                }
                if(i<msg.length())
                System.out.print(Character.toString(msg.charAt(i)).repeat(num));

            }
            while(i<msg.length()){
                System.out.print(msg.charAt(i));
                i++;
            }
        }
        else{
            int cnt=0;
            for(int i=0;i<pattern.length();i++){
                System.out.print(msg.charAt(cnt));
                cnt+=pattern.charAt(i)-'0';
            }
        }
    }
}


// Sample Input 1
// 1
// 123
// open

// Sample Output 1
// oppeeen
