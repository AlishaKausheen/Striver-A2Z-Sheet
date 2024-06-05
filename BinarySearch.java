public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {3,4,6,7,9,12,16,17};
        int target =6;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        if(nums.length==2){
            if(nums[0]==target){
                return 0;
            }
            if(nums[1]==target){
                return 1;
            }
            return -1;
        }

        if(nums.length<=1){
            if(nums[0]==target){
                return 0;
            }
            return -1;
        }
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
