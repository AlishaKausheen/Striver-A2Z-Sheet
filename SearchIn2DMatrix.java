public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        int target =23;
        System.out.println(brute(matrix,target));
        System.out.println(optimal(matrix,target));

    }
    static boolean brute(int[][] matrix, int target){

       for (int i=0;i<matrix.length;i++){
           for (int j=0;j<matrix[i].length;j++){
               if (matrix[i][j]==target){
                   return true;
               }
           }
       }
        return false;
    }
    public static boolean binarySearch(int[] matrix, int target){
        int low=0, high = matrix.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(matrix[mid]<target){
                low=mid+1;
            }else if(matrix[mid]>target){
                high=mid-1;
            }else {
                return true;
            }
        }
        return false;
    }
    static  boolean optimal(int[][] matrix, int target){

        for (int i=0;i<matrix.length;i++){
            if (matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target){
                return binarySearch(matrix[i],target);
            }
        }

        return false;
    }
}
