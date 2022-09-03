//Given an array A of size N. You need to find the root mean square (RMS) of the array i. e you first need to square all values of array and take its mean. 
// Then you need to return the square root of mean. 
// Print the answer with precision upto 6 decimal places.


import java.io.*; // for handling input/output
    import java.util.*; // contains Collections framework

    // don't change the name of this class
    // you can add inner classes if needed
    class Main {
        public static void main (String[] args) {
                        // Your code here
            Scanner sc = new Scanner(System.in); 
                    int n = sc.nextInt(); 
                    int arr [] = new int[n];  
                    for(int i=0; i<n ; i++){ 
                        arr[i] = sc.nextInt(); 
                    } 
                    int sum = 0; 
                    for(int i=0; i<n ;i++){ 
                    sum += (int)Math.pow(arr[i],2);  
                    } 
                double mean = (double)sum/(double)n ; 
                double root = (double)Math.sqrt(mean) ; 
                System.out.printf("%.6f",root); 
        }
    }
