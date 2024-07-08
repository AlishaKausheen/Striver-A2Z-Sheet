public class MaximumConsecutiveOnesIII{
    //tc:o(n20 sc:O(1)
    public int brute(int[] nums, int k) {
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            int zeroes=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zeroes++;
                }
                if(zeroes<=k){
                    int len= j-i+1;
                    maxLength = Math.max(maxLength,len);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
    public int better(int[] nums, int k) {
        int left=0,right=0,maxLength=0,zeroes=0;
        while(right<nums.length){
            if(nums[right]==0) zeroes++;
            while(zeroes>k) {
                if(nums[left]==0) zeroes--;
                left++;
            }
            if(zeroes<=k){
                maxLength=Math.max(right-left+1, maxLength);
            }
            right++;
        }
        return maxLength;
    }
    public int optimal(int[] nums, int k) {
        int left=0,right=0,maxLength=0,zeroes=0;
        while(right<nums.length){
            if(nums[right]==0) zeroes++;
            if(zeroes>k){
                if(nums[left]==0) zeroes--;
                left++;
            }
            if(zeroes<=k){
                maxLength =Math.max(right-left+1, maxLength);
            }
            right++;
        }

        return maxLength;
    }
}
