public class RemoveNthNodeFromEnd {

    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode brute(ListNode head, int n) {
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            temp= temp.next;
            count++;
        }
        if(count==n){
            ListNode newHead = head.next;
            return newHead;
        }
        int res= count-n;
        temp=head;
        while(temp!=null && temp.next!=null){
            res=res-1;
            if(res==0){
                break;
            }
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public ListNode optimal(ListNode head, int n) {
        ListNode fast=head, slow=head;
        while(n-->0){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

