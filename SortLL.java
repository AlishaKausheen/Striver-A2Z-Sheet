import java.util.ArrayList;
import java.util.Collections;

public class SortLL {
    public class ListNode {
     int val;
  ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode brute(ListNode head){
      ArrayList<Integer> list = new ArrayList<>();
      ListNode temp = head;
      while(temp!=null){
          list.add(temp.val);
          temp=temp.next;
      }
      Collections.sort(list);
      temp = head;
      int i=0;
      while(temp!=null){
          temp.val = list.get(i);
          temp=temp.next;
          i++;
      }
      return head;
  }
}
