import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
       spiralOrder(matrix);
    }
    static void spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left =0, right =matrix[0].length-1, top=0, bottom=matrix.length-1;
        while(top<=bottom &&left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i= right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        for (int i=0;i< ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
