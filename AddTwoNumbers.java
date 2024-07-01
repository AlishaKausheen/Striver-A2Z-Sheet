public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode brute(ListNode l1, ListNode l2) {
    ListNode dummy=new ListNode(),current=dummy;
    int carry=0;
    while (l1!=null ||l2!=null){
      int sum=carry;
      if(l1!=null){ sum=sum+l1.val;
      l1=l1.next;
      }
      if (l2!=null) {sum=sum+l2.val;
      l2=l2.next;
      }
      ListNode x= new ListNode(sum%10);
      carry=sum/10;
      current.next=x;
      current=current.next;

    }
    if (carry!=0) {
      ListNode x= new ListNode(carry);
      current.next=x;
    }
    return dummy.next;
  }
}
