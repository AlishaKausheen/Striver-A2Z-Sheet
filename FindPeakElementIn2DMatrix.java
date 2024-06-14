import java.util.Arrays;

public class FindPeakElementIn2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
        System.out.println(Arrays.toString(optimal(mat)));
    }
    public static int maxEle(int[][] mat, int col){
        int maxi =-1;
        int index=-1;
        for (int i=0;i<mat.length;i++){
            if (mat[i][col]>maxi){
                maxi= mat[i][col];
                index=i;
            }
        }
        return index;
    }
    static int[] optimal(int[][] mat){
        int low=0,high = mat[0].length;
        while (low<=high){
            int mid = low+(high-low)/2;
            int row = maxEle(mat, mid);
            int left = mid-1>0?mat[row][mid-1]:-1;
            int right = mid+1<mat[0].length?mat[row][mid+1]:-1;
            if (mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            } else if (mat[row][mid]<left) {
                high =mid-1;
            }else {
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
