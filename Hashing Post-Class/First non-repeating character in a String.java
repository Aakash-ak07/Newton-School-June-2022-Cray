// Given a string s, find the first non-repeating character in the string and return its index. If it does not exist, return -1.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int firstNonRepetCharacter(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(map.get(ch) == 1)
            return i;
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        System.out.print(firstNonRepetCharacter(str));
    }
}

// Input
// s = "newtonschool"

// Output
// 1

// Explanation
// "e" is the first non- repeating character in a string
