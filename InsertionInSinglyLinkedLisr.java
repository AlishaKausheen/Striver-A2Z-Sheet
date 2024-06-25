public class InsertionInSinglyLinkedLisr {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    class Solution
    {
        //Function to insert a node at the beginning of the linked list.
        Node insertAtBeginning(Node head, int x)
        {
            // code here
            Node net = new Node(x);
            if(head==null){
                head=net;
            }else{
                net.next = head;
                head = net;
            }
            return head;

        }

        //Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x)
        {
            // code here
            Node net = new Node(x);
            Node temp=head;
            if(head==null){
                head =net;
            }else{
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next = net;
                net.next =null;
            }
            return head;
        }
    }
}
