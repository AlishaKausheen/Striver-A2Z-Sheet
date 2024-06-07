public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6,7,7};
       System.out.println(brute(nums));
       System.out.println(optimal(nums));
    }
    static int brute(int[] nums){
        if (nums.length==1){
            return nums[0];
        }
        for (int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]!= nums[i+1]){
                    return nums[i];
                }
            } else if (i== nums.length-1) {
                if(nums[i]!= nums[i-1])
                    return nums[i];
            }else {
                if (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
        }

        return -1;
    }
    static int optimal(int[] nums){

        //if even odd is followed our element is in right half else left half
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!= nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int low =1, high = nums.length-2;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]!= nums[mid+1] && nums[mid]!= nums[mid-1]){
                return nums[mid];
            }
            if((mid%2 ==1 && nums[mid]==nums[mid-1])|| (mid%2==0 && nums[mid]==nums[mid+1]) ){
                low=mid+1;
            }else {
                high= mid-1;
            }

        }

        return -1;
    }
}
