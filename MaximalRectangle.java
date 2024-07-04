import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int heights[] = new int[matrix[0].length];
        int largest=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int val = matrix[i][j]-'0';
                if(val==0){
                    heights[j]=0;
                }else{
                    heights[j]+=val;
                }
            }
            int maxArea= largestRectangleArea(heights);
            if(largest<maxArea){
                largest = maxArea;
            }
        }
        return largest;
    }
    public int largestRectangleArea(int[] heights) {
        if(heights==null || heights.length==0) return 0;

        Stack<Integer> stack = new Stack<>();
        int[] leftmost = new int[heights.length];
        int[] rightmost = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            if(stack.isEmpty()){
                leftmost[i] =0;
                stack.push(i);
            }else{
                while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
                    stack.pop();
                leftmost[i] = stack.isEmpty()?0:stack.peek()+1;
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            stack.pop();
        }
        for(int i=heights.length-1;i>=0;i--){
            if(stack.isEmpty()){
                rightmost[i] =heights.length-1;
                stack.push(i);
            }else{
                while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
                    stack.pop();
                rightmost[i] = stack.isEmpty()?heights.length-1:stack.peek()-1;
                stack.push(i);
            }
        }
        int areaMax=0;
        for(int i=0;i<heights.length;i++){
            areaMax= Math.max(areaMax, heights[i]*(rightmost[i]-leftmost[i]+1));
        }
        return areaMax;
    }
}
