public class CountNumberOfNiceSubArrays {
    public int optimal(int[] nums, int k) {
        return atmostK( nums, k)-atmostK( nums, k-1);
    }
    public int atmostK(int[] nums, int goal){
        int left=0,right=0,sum=0,count=0;
        while(right<nums.length){
            sum+=(nums[right]%2);
            while(sum>goal && left<=right){
                sum-=(nums[left]%2);
                left++;
            }
            count+=(right-left+1);

            right++;
        }
        return count;
    }
}
