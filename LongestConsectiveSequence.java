import java.util.Arrays;

public class LongestConsectiveSequence {
    public static void main(String[] args) {
        int[] nums = {102,4,100,1,101,3,2,1,1};
        System.out.println(brute(nums));
        System.out.println(better(nums));

    }
    public static int brute(int[] nums){

        int longest =1;
        for (int i=0;i<nums.length;i++){
            int x = nums[i];
            int count=1;
            while (linear( nums, x+1)){
             x+=1;
             count+=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static boolean linear(int[] nums, int num){
        for (int i=0;i<nums.length;i++){
            if(nums[i]==num)
                return true;
        }
        return false;
    }
    static int better(int[] nums){
        Arrays.sort(nums);
        int longest =1, currentcount =0, leastsmaller = Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            if(nums[i]-1 ==leastsmaller){
                currentcount=currentcount+1;
                leastsmaller = nums[i];
            } else if (nums[i]!=leastsmaller) {
                currentcount=1;
                leastsmaller= nums[i];
            }
            longest = Math.max(longest, currentcount);
        }
        return longest;
    }
}
