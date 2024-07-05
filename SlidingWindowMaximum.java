import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] buteforce(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left=0,right=0;
        while(right<k-1){
            right++;
        }
        while(right<nums.length){
            ans.add(maxi(left,right,nums));
            left++;
            right++;
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public int maxi(int l,int r, int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int j=0;
        Deque< Integer > deque = new ArrayDeque<>();
        int[] ans = new int[n - k + 1];
        for(int i=0;i<n;i++){
            while (!deque.isEmpty() && deque.peek()<=i-k) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=k-1){
                ans[j]=nums[deque.peek()];
                j++;
            }
        }
        return ans;
    }
}
