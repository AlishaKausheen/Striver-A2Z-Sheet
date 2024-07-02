import java.util.Stack;

public class NearestSmallerElement {
    public int[] brute(int[] A) {
        int[] ans = new int[A.length];
        boolean found =false;

        for(int i= A.length-1;i>=0;i--){
            found = false;
            for(int j=i;j>=0;j--){
                if(A[i]>A[j]){
                    found=true;
                    ans[i]=A[j];
                    break;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0) ans[i]=-1;
        }
        return ans;
    }
    public int[] prevSmaller(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ans.length;i++){
            while(!stack.isEmpty() && stack.peek()>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=-1;
            else ans[i] =stack.peek();
            stack.push(A[i]);
        }
        return ans;
    }
}
