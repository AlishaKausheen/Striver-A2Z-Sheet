public class MinStack {
    private  class Node{
        private int val;
        private int min;
        private Node next;

        private Node(int val, int min,  Node next){
            this.val=val;
            this.next=next;
            this.min =min;
        }
        private Node(int val, int min){
            this.val=val;
            this.min =min;
            this.next=null;
        }

    }
    private Node head;
    public void push(int val) {
        if(head==null){
            head = new Node(val,val);
        }else{
            head = new Node(val,Math.min(val,head.min),head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
