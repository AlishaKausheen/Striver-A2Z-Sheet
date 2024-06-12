//k is number of painters
//in array arr units to be painted is given
//keeping in mind every pinter getsatleat one job to be painted
//find minimum of maximum units a painter paints
public class PaintersPartition {
    public static void main(String[] args) {
    int[] arr = {10,20,30,40};
    int k=2;
    System.out.println(optimal(arr,k));

    }
    public static int max(int[] arr){
        int maxi=-1;
        for (int i=0;i< arr.length;i++){
            maxi =Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public static int sum(int[] arr){
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int countPainter(int[] arr, int job){
        int painter=1,jobCount=0;
        for (int i=0;i<arr.length;i++){
            if(jobCount+arr[i]<=job){
                jobCount+=arr[i];
            }else {
                painter++;
                jobCount=arr[i];
            }
        }
        return painter;
    }
static int optimal(int[] arr, int k){
int low = max(arr), high= sum(arr);
while (low<=high){
    int mid = low +(high-low)/2;
    if(countPainter(arr,mid)>k){
        low=mid+1;
    } else if (countPainter(arr, mid)<=k) {
        high=mid-1;
    }else {
        return mid;
    }
}
        return low;
}
}
