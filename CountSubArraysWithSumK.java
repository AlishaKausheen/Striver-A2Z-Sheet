import java.util.HashMap;

public class CountSubArraysWithSumK {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1};
        int k=3;
        System.out.println(better(nums,k));
        System.out.println(optimal(nums,k));
    }
    static int better(int[] nums, int k){
        int count =0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count= count+1;
                }
            }
        }
        return count;
    }
    static int optimal (int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        int preSum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int remove = preSum-k;
            count+= map.getOrDefault(remove,0);
            map.put(preSum, map.getOrDefault(preSum,0)+1);
        }
        return count;



    }
}
