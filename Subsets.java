import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsets {
    public ArrayList<ArrayList<Integer>> brute(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int subsets = 1<< nums.length;
        for (int i = 0; i < subsets; i++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
    public ArrayList<ArrayList<Integer>> recursion(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), nums,0);
        return result;
    }
    private void backtracking(ArrayList<ArrayList<Integer>> result , ArrayList<Integer> temp,
                              int[] nums, int start){
        result.add(new ArrayList<>(temp));
        for(int i= start;i<nums.length;i++){
            temp.add(nums[i]);
            backtracking(result, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
