public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k=5;
        System.out.println(optimal(arr,k));
    }
    static int brute(int[] arr, int k){
         int noOfMissing=arr[0]-1;

        for (int i=0;i<arr.length-1;i++){
            noOfMissing+= (arr[i+1]-arr[i]-1);
        }
        if(k>noOfMissing){
            return k+ arr.length;
        }
        if(k<noOfMissing) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < k) {
                    k++;
                } else {
                    break;
                }
            }

            return k;
        }
        return -1;
    }
    static int optimal(int[] arr, int k){
        int low =0, high =arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if (missing<k){
                low = mid+1;
            }else {
                high = mid-1;
            }
            return low+k;
        }

        return -1;
    }
}
