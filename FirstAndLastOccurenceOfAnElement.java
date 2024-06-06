import java.util.Arrays;

public class FirstAndLastOccurenceOfAnElement {
    public static void main(String[] args) {
        int[] nums = {1,4,5,5,5,5,6,7,8,9};
        int target =5;
        System.out.println(Arrays.toString(brute(nums, target)));
        System.out.println(Arrays.toString(optimal(nums,target)));
    }
    static int[] brute(int[] nums, int target){
        int first =-1, last=-1;

        for (int i=0;i< nums.length;i++){
            if(nums[i]==target){
                if (first==-1)
                    first=i;
                last=i;
            }
        }

        return new int[]{first,last};
    }

    static int[]  optimal(int[] nums, int target){

        int lb= lowerBound(nums, target);
        if(lb==nums.length || nums[lb]!= target){
            return new int[]{-1,-1};

        }

        return new int[]{lb, upperBound(nums,target)-1};
    }
    public static int lowerBound(int[] nums, int target){
        int low= 0;
        int high = nums.length-1;
        int ans =-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high=mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }


    public static int upperBound (int[] nums, int target){
        int low= 0;
        int high = nums.length-1;
        int ans =-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                ans = mid;
                high=mid-1;
            }else {
                low = mid+1;
            }
        }
        if(nums[nums.length-1]==target){
            ans = nums.length;
        }
        return ans;
    }
}
