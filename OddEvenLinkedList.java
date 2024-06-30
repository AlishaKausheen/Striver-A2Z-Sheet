import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class OddEvenLinkedList {
    public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public static ListNode brute(ListNode head){
        if (head==null ||head.next==null) return head;
        ListNode temp = head;
      ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null && temp.next!=null){
            list.add(temp.val );
            temp=temp.next.next;
        }
        if (temp!=null){
            list.add(temp.val);
        }
        temp =head.next;
      while(temp!=null && temp.next!=null){
          list.add(temp.val );
          temp=temp.next.next;
      }

      if (temp!=null){
          list.add(temp.val);
      }
      temp =head;
     int i=0;
     while(temp!=null){
         temp.val= list.get(i);
         temp=temp.next;
         i++;
     }
      return head;
  }

    public ListNode optimal(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode odd =head,even=head.next, headEven = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next= even.next.next;
            odd =odd.next;
            even =even.next;
        }
        odd.next = headEven;
        return head;

    }
}
