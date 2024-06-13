import java.util.Arrays;

public class SearchIn2DMatrixII {
    public static void main(String[] args) {
     int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
     int target = 14;
     System.out.println(Arrays.toString(better(matrix,target)));
     System.out.println(Arrays.toString(optimal(matrix,target)));

    }
    public static int binarySearch(int[] matrix, int target){
        int low=0, high = matrix.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(matrix[mid]<target){
                low=mid+1;
            }else if(matrix[mid]>target){
                high=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    static int[] better(int[][] matrix, int target){
        int[] ans = {-1,-1};
        int index =-1;
        for (int i=0;i<matrix.length;i++){
            index = binarySearch(matrix[i], target);
            if (index!=-1){
                ans[0] =i;
                ans[1] = index;
            }
        }

        return ans;
    }
    static int[] optimal(int[][] matrix, int target){
        int[] ans = {-1,-1};

        int row =0, col= matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if (matrix[row][col]==target){
                ans[0] = row;
                ans[1]= col;
            } else if (matrix[row][col]<target) {
                row++;
            }else {
                col--;
            }
        }
        return ans;
    }
}
