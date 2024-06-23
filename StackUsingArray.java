public class StackUsingArray{
    int top;
    int arr[] = new int[1000];

    StackUsingArray()
    {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a)
    {
        // Your code here
        arr[++top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        // Your code here
        if(top==-1) return top;
        return arr[top--];
    }
}
