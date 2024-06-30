import java.util.HashMap;

public class IntersectionOfTwoLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode UsingHashmaps(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> mpp = new HashMap<>();
        ListNode temp=headB;
        while(temp!=null){
            mpp.put(temp,mpp.getOrDefault(temp,0)+1);
            temp=temp.next;
        }
        temp=headA;
        while (temp!=null){
            if (mpp.containsKey(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public ListNode UsingTraversalApproach(ListNode headA, ListNode headB) {
        while(headB!=null){
            ListNode temp = headA;
            while(temp!=null){
                if(temp == headB){
                    return headB;
                }
                temp = temp.next;
            }
            headB = headB.next;
        }
        return null;
    }
    public ListNode usingCollisionApproach(ListNode headA, ListNode headB) {
        int n1=0,n2=0;
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null){
            n1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            n2++;
            temp2=temp2.next;
        }
        if(n1<n2){
            return collision(headA,headB,n2-n1);
        }
        return collision(headB,headA, n1-n2);


    }
    public ListNode collision(ListNode  a, ListNode b,int d){
        while(d!=0){
            d--;
            b=b.next;
        }
        while(a!=b){
            a=a.next;
            b=b.next;
        }
        return a;
    }
}
