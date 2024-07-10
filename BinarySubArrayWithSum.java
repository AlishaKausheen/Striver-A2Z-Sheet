public class BinarySubArrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostK( nums, goal)-atmostK( nums, goal-1);
    }
    public int atmostK(int[] nums, int goal){
        int left=0,right=0,sum=0,count=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal && left<=right){
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);

            right++;
        }
        return count;
    }
}
