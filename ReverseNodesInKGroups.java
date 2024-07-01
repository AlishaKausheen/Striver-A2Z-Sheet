public class ReverseNodesInKGroups {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode temp=head,nextNode,prevNode=null;
       while (temp!=null){
           ListNode kthNode = findKthNode(temp,k);
           if (kthNode==null){
          if (prevNode!=null)    prevNode.next=temp;
               break;
           }
           nextNode=kthNode.next;
           kthNode.next=null;
           reverse(temp);
           if (temp==head) head=kthNode;
           else prevNode.next =kthNode;
               prevNode=temp;
           temp=nextNode;
       }
       return head;
    }
    public ListNode findKthNode(ListNode temp, int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode current=head,prev=null,temp;
        while(current!=null){
            temp=current.next;
            current.next=prev;
            prev=current;
            current = temp;
        }
        return prev;
    }
}
