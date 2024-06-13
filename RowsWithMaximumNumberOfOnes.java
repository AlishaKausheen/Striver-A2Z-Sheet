public class RowsWithMaximumNumberOfOnes {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
        System.out.println(brute(arr));
        System.out.println(optimal(arr));
    }
    static int brute(int[][] arr){
        int index=-1;
        int maxCount=-1;
        for (int i=0;i<arr.length;i++){
            int countRow =0;
            for (int j=0;j<arr[0].length;j++){
                countRow+=arr[i][j];
                if(countRow>maxCount){
                    maxCount =countRow;
                    index =i;
                }
            }
        }
        return index;
    }

    public static int lowerBound(int[] arr ,int n, int x){
        int low =0, high = n-1;
        int ans = n;
        while (low<=high){
            int mid= low+(high-low)/2;
            if (arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
    static int optimal(int[][] arr){
        int countMax=0;
        int index=-1;
        for (int i=0;i< arr.length;i++){
            int countOnes = arr[i].length- lowerBound(arr[i],arr[i].length,1 );
            if (countOnes> countMax){
                countMax=countOnes;

                index=i;

            }

        }
        return index;
    }
}
