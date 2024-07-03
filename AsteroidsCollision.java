import java.util.Stack;

public class AsteroidsCollision {
    public int[] stackApproach(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(int i=0;i<asteroids.length;i++){
            while(!stack.isEmpty() && asteroids[i]<0 && stack.peek()>0){
                sum = asteroids[i]+stack.peek();
                if(sum<0){
                    stack.pop();
                }else if(sum>0){
                    asteroids[i]=0;

                }else if(sum==0){
                    stack.pop();
                    asteroids[i]=0;

                }
            }
            if(asteroids[i]!=0){

                stack.push(asteroids[i]);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]= stack.pop();
        }
        return ans;
    }
}
