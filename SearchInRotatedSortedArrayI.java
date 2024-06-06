public class SearchInRotatedSortedArrayI {
    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 1;
        System.out.println(brute(nums,target));
        System.out.println(optimal(nums,target));
    }
    static int brute(int[] nums, int target){
        for (int i=0;i< nums.length;i++){
            if(nums[i]==target)
                return i;
        }

        return -1;
    }

    static int optimal(int[] nums, int target){
        int low =0, high = nums.length-1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid] == target){
                return mid;
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
      return -1;
    }
}
