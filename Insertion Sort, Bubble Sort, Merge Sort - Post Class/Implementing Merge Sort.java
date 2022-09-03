// Given an unsorted array, your task is to sort the array using merge sort.
// Constraints
// 1 <= T <= 100
// 1 <= N <= 10^4
// 1 <= Arr[i] <= 10^5

public static int[] implementMergeSort(int arr[], int start, int end)
{
  if(start == end)
  {
    int [] res = new int[1];
    res[0] = arr[start];
    return res;
  }
  int mid = (start + end)/2;
  int firstHalf[] = implementMergeSort (arr, start, mid);
  int secondHalf[] = implementMergeSort (arr, mid+1, end);

  int [] res = merge (firstHalf, secondHalf);
  return res;
}

public static int[] merge (int[] a, int[] b)
{
  int [] res = new int [a.length + b.length];
  int i = 0, j = 0, k = 0;

  while (i < a.length && j < b.length)
  {
    if(a[i] <= b[j])
    {
      res[k] = a[i];
      i++;
      k++;
    }
    else
    {
      res[k] = b[j];
      j++;
      k++;
    }
  }
  while(i < a.length) 
  {
    res[k] = a[i];
    i++;
    k++;
  }
  while(j < b.length) 
  {
    res[k] = b[j];
    j++;
    k++;
  }
  return res;
}


// Sample Input:
// 2
// 3
// 3 1 2
// 3
// 4 5 6

// Sample Output:
// 1 2 3
// 4 5 6
