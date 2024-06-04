import java.util.*;

public class MajorityElementNByThreeTimes {
    public static void main(String[] args) {

        int[] arr = {1,1,1,3,3,2,2,2};
        ArrayList<Integer> ans = brute(arr);
        ArrayList<Integer> ans1 = better(arr);
        ArrayList<Integer> ans2 = optimal(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans1.size(); i++){
            System.out.print(ans1.get(i) + " ");
        }
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans2.size(); i++){
            System.out.print(ans2.get(i) + " ");
        }
    }
    static ArrayList<Integer> brute(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(ans.size()==0 || ans.get(0)!=nums[i]){
                int count =0;
                for (int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(count> nums.length/3){

                    ans.add(nums[i]);
                }
            }
            if(ans.size()==2)
                break;
        }

        return ans;
    }
    static ArrayList<Integer> better(int[] nums){
        ArrayList<Integer> ans= new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int mini = (int) (nums.length/3)+1;

        for (int i=0;i<nums.length;i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1);

            if(map.get(nums[i])==mini){
                ans.add(nums[i]);
            }
            if(ans.size()==2)
                break;

        }
        return  ans;
    }

    static ArrayList<Integer> optimal(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int count1=0,count2=0,ele1=0,ele2=0;
        for (int i=0;i< nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1 =nums[i];
            } else if (count2==0 && nums[i]!=ele1) {
                count2 = 1;
                ele2 = nums[i];
            }else if (ele1 ==nums[i]){
                count1++;
            } else if (ele2 ==nums[i]) {
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for (int i=0;i<nums.length;i++){
           if(ele1==nums[i]){
               count1++;
           }
           if (ele2== nums[i]){
               count2++;
           }
        }
        int mini = (int) (nums.length/3)+1;
        if(count1>=mini)
            ans.add(ele1);
        if (count2>=mini)
            ans.add(ele2);
        return ans;
    }
}
