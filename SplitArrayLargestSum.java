//split array in k contegious sub array
//such that each has atleast one element
//find minimum of maximum sum
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] nums ={10,20,30,40};
        int k=2;
        System.out.println(optimal(nums,k));
    }
    public static int max(int[] nums){
        int maxi=-1;
        for (int i=0;i< nums.length;i++){
            maxi =Math.max(maxi,nums[i]);
        }
        return maxi;
    }
    public static int sum(int[] nums){
        int sum =0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static int countSubArray(int[] nums, int job){
        int subArray=1,count=0;
        for (int i=0;i<nums.length;i++){
            if(count+nums[i]<=job){
                count+=nums[i];
            }else {
                subArray++;
                count=nums[i];
            }
        }
        return subArray;
    }
    static int optimal(int[] nums, int k){
        int low = max(nums), high= sum(nums);
        while (low<=high){
            int mid = low +(high-low)/2;
            if(countSubArray(nums,mid)>k){
                low=mid+1;
            } else if (countSubArray(nums, mid)<=k) {
                high=mid-1;
            }else {
                return mid;
            }
        }
        return low;
    }
}
