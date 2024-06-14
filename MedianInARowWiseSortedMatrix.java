import java.util.ArrayList;
import java.util.Collections;

public class MedianInARowWiseSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix ={{1,5,7,9,11},{2,3,4,5,10},{9,10,12,14,16}};
    }

    static int brute(int[][] matrix){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        int index= arr.size()/2;
        int ans = arr.get(index);
        return ans;
    }

    public static int upperBound(int[] mat , int x) {
        int low = 0, high = mat.length - 1;
        int ans = mat.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (mat[mid] > x) {
                ans = mid;
                // look for a smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static int blackBox(int[][] matrix, int x){
        int cnt = 0;
        for (int i = 0; i < matrix.length; i++) {
            cnt += upperBound(matrix[i], x);
        }
        return cnt;
    }

    static int optimal(int[][] matrix){
        int req = matrix.length*matrix[0].length/2;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][matrix[0].length - 1]);
        }

        while (low<=high){
            int mid= low+(high-low)/2;
            int smallerEquals = blackBox(matrix,mid);
            if (smallerEquals<=req){
                low =mid+1;
            }else {
                high =mid-1;
            }
        }
        return low;
    }
}
