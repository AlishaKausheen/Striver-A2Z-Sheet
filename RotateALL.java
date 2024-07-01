public class RotateALL {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode approach(ListNode head, int k){
     if(head==null ||head.next==null) return head;
    ListNode temp=head,tail=head;
    int n=1;
      while (tail.next!=null){
        n++;
        tail=tail.next;
    }
    k=k%n;
      if (k==0) return head;
    tail.next=head;
    ListNode newLastNode = findnewLastNode(head,n-k);
    head=newLastNode.next;
    newLastNode.next=null;
      return head;
}
    public ListNode findnewLastNode(ListNode head, int k){
        int count=1;
        while(count!=k){
            head=head.next;
            count++;
            if(count==k){
                break;
            }
        }
        return head;
    }
}
