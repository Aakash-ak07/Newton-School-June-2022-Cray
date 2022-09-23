// Black widow is on a mission to get more information about hydra's whereabouts. She comes across a room where laser lines intersect to form containers. A message pops up on the screen in front of her mocking her saying that she won't be able to find the information she needs. 
// But there's a hint too, the container with maximum water has the intel she needs. The water is polluted with a substance that causes it to become invisible so that no one can make out by seeing how much water is in the container. Help Black Widow solve the mystery and get more intel about hydra.
// Find the largest rectangular area that contains most water in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack <Integer> st = new Stack<>();
        st.push(-1);
        long maxarea = 0;
        for(int i = 0; i < n; i++)
        {
            while (st.size() != 1 && arr[i] < arr[st.peek()])
            {
                long area = arr[st.pop()] * (i - st.peek() - 1);
                maxarea = Math.max(maxarea, area);
            }
            st.push(i);
        }
        while(st.size() != 1)
        {
            long area = arr[st.pop()] * (n - st.peek() - 1);
            maxarea = Math.max(maxarea,area);
        }
        System.out.print(maxarea);
    }    
}


// Input
// 7
// 6 2 5 4 5 1 6

// Output
// 12

// Input
// 4
// 6 3 4 2

// Output
// 9
