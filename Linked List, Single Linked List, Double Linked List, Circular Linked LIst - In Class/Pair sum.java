// You are given head which is a reference node to a doubly- linked list of distinct integers and an integer K. Complete the function pairSum which returns the number of pairs whose sum is equal to K.
// Input
// User task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function pairSum that takes the head of the linked list and integer K as parameters.

// Constraints:
// 1 <= Number of nodes <= 1000.
// 0 <= K <= 10^5
// Output
// Return an integer- the number of pairs whose sum is equal to K.
// Example
// Sample Input 1:-
// 3 5
// 1 2 3

// Sample Output 1:-
// 1

// Explanation
// 2 + 3 = 5
// So, there is only one pair

// Sample Input 2:-
// 3 6
// 1 2 3

// Sample Output 2:-
// 0

// Explanation:
// There are no pairs which sum to 6


/*
class Node
{
   int data;
   Node next, prev;
};
*/

static int pairSum( Node head, int x)
{
    int count = 0;
    HashSet<Integer> set = new HashSet<>();
    Node current = head;
    while(current != null)
    {
        int diff = x - current.data;
        if(set.contains(diff))
            count++;
        set.add(current.data);
        current = current.next;
    }
    return count;
}
