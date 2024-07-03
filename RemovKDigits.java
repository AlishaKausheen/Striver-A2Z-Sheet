import java.util.Stack;

public class RemovKDigits {
    public String removeKdigits(String nums, int k) {
        Stack<Character> stack =  new Stack<>();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<nums.length();i++){
            while(!stack.isEmpty() && stack.peek()>nums.charAt(i) && k>0){
                stack.pop();
                k--;
            }
            if(stack.size()>0 || nums.charAt(i)!='0'){
                stack.push(nums.charAt(i));
            }
        }
        while( !stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        for (char c : stack) {
            if (ans.length() == 0 && c == '0') continue;
            ans.append(c);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
