// Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n))

 //Algo-1. merge two sorted arrays
    //2. find median of merged array
    //3. if size of merged array is odd then median is mid value
    // else it is average of two mid values
    //catch--> to get output of division in decimal instead of int(rounding to int)
    //convert num into double

class Main {
    public static int[] mergeTwoSortedArray(int a[],int b[]){
        int res[]=new int[a.length + b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]>=b[j])
            {
                res[k]=b[j];
                j++;
                k++;
            }
            else{
                res[k]=a[i];
                i++;
                k++;
            }
        }
            while(i<a.length)
            {
                res[k]=a[i];
                i++;
                k++;
            }
            while(j<b.length)
            {
                res[k]=b[j];
                j++;
                k++;
            }
            return res;
    }
    
    public static void medianOfTwoSortedArrays(int a[],int b[]){
        int res[]= mergeTwoSortedArray(a,b);
        //System.out.print(res);
        
        double median=0.0;
        int n=res.length;
        if(n % 2 != 0)
        {
            median=(double)res[n/2];
            //System.out.println("odd="+median);
        }
        else
        {
            median=(double)(res[n/2]+res[(n/2)-1])/2;
            //System.out.println("even="+median);
        }
        System.out.printf("%.2f",median);
        // return median;
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];

        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        medianOfTwoSortedArrays(arr1,arr2);          
    }
}



// Sample Input :
// 2 1
// 1 3
// 2

// Sample Output :
// 2.00
