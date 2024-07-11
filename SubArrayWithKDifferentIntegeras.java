import java.util.HashMap;

public class SubArrayWithKDifferentIntegeras {
    public int bruteforce(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<nums.length;j++){
                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
                if(map.size()==k) count++;
                else if(map.size()>k) break;
            }
        }
        return count;
    }
    public int optimal(int[] nums, int k) {
        return atmostK(nums, k)-atmostK(nums, k-1);
    }
    public int atmostK(int[] nums, int k){
        int left=0,right=0,count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            count=count+(right-left+1);
            right++;
        }
        return count;
    }
}
