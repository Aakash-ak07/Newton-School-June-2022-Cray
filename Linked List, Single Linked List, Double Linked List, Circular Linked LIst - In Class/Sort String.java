// You are given head which is a reference node to a singly- linked list of lowercase characters. Complete the function string_sort which sorts the given string. Sorting here means that all occurrence of 'a' comes before 'b' and all occurrence of 'b' comes before 'c' and so on.
// Modify the original linked list to contain the sorted string.
// Input
// User task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the functions string_sort that takes the head of the linked list as parameter.

// Constraints:
// The Linked List is not empty.
// Number of nodes will not exceed 1000.
// Output
// No need to return anything. Modify the contents of linked list to contain the sorted string.
// Example
// Sample Input 1:-
// 3
// a x a

// Sample Output 1:-
// a a x

// Explanation:
// a < x

// Sample Input 2:-
// 5
// c e c a a

// Sample Output 2:-
// a a c c e

// Explanation:
// a < c < e


/*
class Node
    {
    	char data;
    	Node next;
    	Node(char d){
    	    data=d;
    	}
    };
*/
static void string_sort(Node head)
{
    int[] counts = new int[26]; 
    Node curr = head;
    while (curr != null) 
    {
        counts[curr.data - 'a']++;
        curr = curr.next;
    }
    curr = head;
    int i = 0;
    while (curr != null) 
    {
        while (counts[i] == 0) 
        { 
            i++;
        }
        curr.data = (char)('a' + i); 
        counts[i]--;
        curr = curr.next;
    }
}
