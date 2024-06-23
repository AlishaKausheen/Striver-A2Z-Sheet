public class QueuesUsingArray {
    int front, rear;
    int arr[] = new int[100005];
    int count =0;

    QueuesUsingArray()
    {
        front=0;
        rear=0;
        count=0;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        // Your code here

        arr[rear]=x;
        rear++;

    }

    //Function to pop an element from queue and return that element.
    int pop()
    {
        // Your code here
        if(rear==front) return -1;

        return arr[front++];
    }
}
