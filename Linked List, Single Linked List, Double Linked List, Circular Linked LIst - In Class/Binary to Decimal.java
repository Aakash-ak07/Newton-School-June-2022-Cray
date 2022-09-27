// You are given a binary number in the form of a linked list. So, value at each node is either 0 or 1. You are given head which is a reference node to a singly- linked list.
// Return the decimal value of the number in the linked list.

/*
class Node
    {
    	int data;
    	Node next;
    	Node(int d){
    	    data=d;
    	}
    };
*/
static int decimalValue(Node head)
{
	int length = 0;
	Node temp = head;
	while(temp != null)
	{
		length += 1;
		temp = temp.next;
	}
	int ans = 0;
	temp = head;
	while(temp != null)
	{
		ans += (temp.data * (1 << (length - 1)));
		temp = temp.next;
		length -= 1;
	}
	return ans;
}


// Sample Input 1:-
// 101

// Sample Output 1:-
// 5

// Sample Input 2:-
// 1101

// Sample Output 2:-
// 13

// Explanation:
// 1101 = 2^3 + 2^2 + 2^0 = 13
