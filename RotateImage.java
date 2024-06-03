import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int[] row: brute(matrix)) {
            System.out.println(Arrays.toString(row));
        }
        for (int[] row:optimal(matrix)) {
           System.out.println(Arrays.toString(row));
        }
    }
    static int[][] brute(int[][] matrix){
        int[][] ans = new int[matrix.length][matrix.length];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                ans[j][matrix.length-1-i]= matrix[i][j];
            }
        }
        return ans;
    }
    static int[][] optimal(int[][] matrix){
        for (int i=0;i< matrix.length-1;i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i=0;i< matrix.length;i++){
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        return matrix;
    }
}
