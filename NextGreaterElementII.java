import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%nums.length]){
                stack.pop();
            }
            if(i<nums.length){
                int value = stack.isEmpty() ? -1 : stack.peek();
                ans[i] = value;
            }
            stack.push(nums[i%nums.length]);

        }
        return ans;
    }
}
