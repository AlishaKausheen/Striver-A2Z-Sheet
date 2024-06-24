public class StackUsingLinkedList {
    class StackNode {
        int data;
      StackNode next;
         StackNode(int a) {
             data = a;
             next = null;
         }
     }
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a)
    {
        // Add your code here
        StackNode node = new StackNode(a);
        node.next =top;
        top = node;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        // Add your code here
        if(top==null) return -1;
        int number = top.data;
        top = top.next;
        return number;

    }
    int peek(){
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
}
