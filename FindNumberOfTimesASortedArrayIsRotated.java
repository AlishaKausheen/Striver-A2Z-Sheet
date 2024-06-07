public class FindNumberOfTimesASortedArrayIsRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,4,5,6,1,2,2,3};
        System.out.println(optimal(nums));
    }
    static int optimal(int[] nums){
        int ans=Integer.MAX_VALUE;
        int low=0,high= nums.length-1;
         int index=-1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            //for duplicates
            if (nums[low] == nums[mid] && nums[high] == nums[mid]){
                low++;
                high--;
                continue;
            }
            if (nums[low] <= nums[mid]) {
                if(nums[low]<ans){
                    ans = nums[low];
                    index=low;
                }

                low = mid + 1;
            } else {

                    if(nums[mid]<ans){
                        ans = nums[mid];
                        index=mid;
                    }
                high = mid - 1;
            }
        }

        return index;
    }
}
