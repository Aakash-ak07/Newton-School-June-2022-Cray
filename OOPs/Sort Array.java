// You have to write 4 classes as BubbleSort, InsertionSort, MergeSort and SelectionSort, and each of should implement following interface:
//     interface ISort{
//     public int[] sort(int[] arr);
//     }

// Each class should be defined as:
// Implement sort in each class with respective method, after sorting return sorted array.


/*
interface ISort{
    public int[] sort(int[] arr);
}
*/

// implement classes here
class BubbleSort implements ISort{

    public int[] sort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {  
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
                }
            }
        } 
        return arr;
    }
}

class InsertionSort implements ISort{

    public int[] sort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j]> key)
            {
                arr[j + 1]  = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

class SelectionSort implements ISort {

    public int[] sort(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[smallest])
                    smallest = j;
                {
                    int swap = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[i] = swap;
                }
            }
        }
        return arr;
    }
}

class MergeSort implements ISort {
    public int[] sort(int[] arr)
    {
        Arrays.sort(arr);
        return arr;
    }
}
