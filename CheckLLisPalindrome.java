import java.util.Stack;

public class CheckLLisPalindrome {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


        public boolean UsingStacks(ListNode head) {
            ListNode temp =head;

            Stack<Integer> st = new Stack<>();
            while(temp!=null){
                st.push(temp.val);
                temp=temp.next;
            }
            temp=head;
            while(temp!=null){
                if((temp.val)!= st.peek()) return false;
                temp=temp.next;
                st.pop();
            }
            return true;
        }
    public boolean optimal(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        if(fast!=null)
            slow = slow.next;

        ListNode revHead = reverse(slow);

        while(revHead!=null){
            if(revHead.val!=head.val){
                return false;
            }
            else{
                revHead = revHead.next;
                head = head.next;
            }
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode current = head, prev=null,temp;
        while(current!=null){
            temp=current.next;
            current.next=prev;
            prev=current;
            current = temp;
        }
        return prev;
    }
    }

