public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {7,8,1,2,3,3,4,4,5,6,7};
        int target = 3;
        System.out.println(optimal(nums, target));
    }
    static boolean optimal(int[] nums, int target){

        int low =0, high = nums.length-1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid] == target){
                return true;
            }
            if (nums[low] == nums[mid] && nums[high] == nums[mid]){
                low++;
                high--;
                continue;
            }
            if (nums[low]<=nums[mid]){
                if (nums[low]<=target && nums[mid]>= target){
                    high =mid-1;
                }
                else {
                    low =mid+1;
                }
            }else{
                if (target<= nums[high] && target >= nums[mid]){
                    low =mid+1;
                }else {
                    high= mid-1;
                }
            }
        }


        return false;
    }

}
