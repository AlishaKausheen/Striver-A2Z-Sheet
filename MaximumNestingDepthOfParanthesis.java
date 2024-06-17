import java.util.Stack;

public class MaximumNestingDepthOfParanthesis {
    public static void main(String[] args) {
        String  s = "(1)+(2*3)+((8)/4))+1";
    }
    static int approach1(String s){
        int max=0,current=0;
        for (char ch:s.toCharArray()){
            if (ch=='('){
                current++;
                if (current>max){
                    max=current;
                }
            } else if (ch==')') {
                current--;
            }
        }

        return max;
    }
    static int approach2(String s){
        Stack<Character> st = new Stack<>();
        int ans=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                st.push('(');
            } else if (s.charAt(i)==')') {
                st.pop();
            }
            ans = Math.max(ans, (int)st.size());
        }
        return ans;
    }
}
