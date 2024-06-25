public class LinkedListFromArray {
  public   class Node {
        int data;
        Node next;

        Node() { data = 0; }
        Node(int d) { data = d; }  //constructor to create a new node
    }


    public Node constructLL(int arr[]) {
            // code here
            Node head = new Node(arr[0]);
            Node ptr=head;
            for(int i=1;i<arr.length;i++)
            {
                ptr.next = new Node(arr[i]);
                ptr=ptr.next;
            }
            ptr.next=null;
            return head;
        }


}
