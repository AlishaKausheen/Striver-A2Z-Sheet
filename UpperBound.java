public class UpperBound {
    public static void main(String[] args) {
        int [] nums = {1,2,4,6,7,9};
        int target =3;
        System.out.println(searchGreaterThan(nums, target));
    }
    public static int searchGreaterThan(int[] nums, int target) {
        int ans = nums.length;
        int low =0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}
