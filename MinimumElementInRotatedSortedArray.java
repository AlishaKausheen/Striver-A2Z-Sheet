public class MinimumElementInRotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {4,5,0,1,2,3};
        System.out.println(optimal(nums));
    }
    static  int optimal(int[] nums){
        int ans=Integer.MAX_VALUE;
        int low=0,high= nums.length-1;

        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}
