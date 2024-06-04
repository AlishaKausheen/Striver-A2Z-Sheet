import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,4};
        ArrayList<ArrayList<Integer>> ans = brute(nums);
        for (ArrayList<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }

    }
    static ArrayList<ArrayList<Integer>> brute(int[] nums){

        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){

            for (int j=i+1;j< nums.length;j++){
                for (int k= j+1;k< nums.length;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        ArrayList<Integer> temp = new ArrayList<>();
                        Collections.addAll(temp, nums[i],nums[j], nums[k]);

                        Collections.sort(temp);

                    }

                }

            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
