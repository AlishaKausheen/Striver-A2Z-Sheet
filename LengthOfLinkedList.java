public class LengthOfLinkedList {
    class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }

    class Solution
    {
        //Function to count nodes of a linked list.
        public static int getCount(Node head)
        {

            //Code here
            int count =0;
            Node temp=head;
            while(temp!=null){
                temp =temp.next;
                count++;
            }
            return count;
        }
    }

}
