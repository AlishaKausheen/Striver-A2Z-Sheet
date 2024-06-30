public class DeleteMiddleNodeOfALL {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode brute(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int res= n/2;
        temp = head;
        while(temp!=null && temp.next!=null){
            res--;
            if(res==0) break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast = head, slow = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
