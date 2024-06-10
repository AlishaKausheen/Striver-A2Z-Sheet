import java.util.Arrays;

//place cows in succh a way that minimum distance between two cows is maximum
public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr ={0,3,4,7,10,9};
        int cows = 4;
        System.out.println(brute(arr, cows));
        System.out.println(optimal(arr,cows));
    }
    static int brute(int[] arr, int cows){
        Arrays.sort(arr);
        int min= arr[0];
        int max= arr[arr.length-1];
        for (int i=1;i<max-min;i++){
            if(canWePlace(arr, i, cows)){
                continue;
            }else {
                return i-1;
            }
        }
        return -1;
    }

    public static boolean canWePlace(int[] arr, int mindistance, int cows){
        int countCow=1,last=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]-last>=mindistance){
                countCow++;
                last=arr[i];
            }
        }
        if (countCow>=cows){
            return true;
        }
        return false;
    }
    static int optimal(int[] arr, int cows){
        Arrays.sort(arr);
        int ans=-1;
        int low = arr[0],high=arr[arr.length-1];
        while (low<=high){
            int mid = low+(high-low)/2;
            if(canWePlace(arr,mid,cows)){
                ans=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }

}
