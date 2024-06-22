import java.util.ArrayList;

public class PrintSubsets {
    public static void main(String[] args) {

    }
    static ArrayList<ArrayList<Integer>> brute(int[] nums){
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
}
