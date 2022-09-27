// Your are given an array and Q queries. Your task is to perform these operations:-
// enqueue:-this operation will add an element to your current queue.
// dequeue:-this operation will delete the element from the starting of the queue
// displayfront:-this operation will print the element presented at front

/*
  class Queue{ 
    static final int MAX = 10000; 
    int rear=0,front=0; 
    int a[] = new int[MAX]; 
}
   int rear=0,front=0; //pointer to rear and front
    int a[] //array that contain elements of queue
*/ 

public static void enqueue(int x, int k)
  {
    if(rear == k)
      System.out.println("Queue is full");
    
    else
    {
      if(front == -1)
        front = 0;

        //rear++;
      a[rear++] = x;
    }
  }

  public static  void dequeue()
  {
    if(rear == front)
      System.out.println("Queue is empty");
    
    else
    {
      if(front >= rear)
      {
        front = -1;
        rear = -1;
      }
      else
        front++;
    }
  }

  public static void displayfront()
  {
    if(front == rear)   
      System.out.println("Queue is empty");
    
    else
      System.out.println(a[front]);
  }
}


// Sample Input:-
// 8 2
// displayfront
// enqueue 2
// displayfront
// enqueue 4
// displayfront
// dequeue
// displayfront
// enqueue 5

// Sample Output:-
// Queue is empty
// 2
// 2
// 4
// Queue is full

// Explanation:-here size of given array is 2 so when last enqueue operation perfomed the array was already full so we display the msg "Queue is full".

// Sample input:
// 5 5
// enqueue 4
// enqueue 5
// displayfront
// dequeue
// displayfront

// Sample output:-
// 4
// 5
