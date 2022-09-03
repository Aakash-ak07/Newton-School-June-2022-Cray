// Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.
// Note: Use binary search to solve the problem

static int isPresent(long arr[], int n, long k)
{
	int left = 0;
	int right = n-1;
	while (left <= right)
	{
		int mid = left+(right-left)/2;
		if(arr[mid] == k)
		{
			return 1;
		}
		else if (arr[mid] < k)
		{
			left = mid + 1;
		}
		else
		{
			right = mid - 1;
		}
		mid = (left+(right-left)/2);
	}
	return -1;
}



// Sample Input:
// 2
// 5 6
// 1 2 3 4 6
// 5 2
// 1 3 4 5 6

// Sample Output:
// 1
// -1
