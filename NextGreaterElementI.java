import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] brute(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        boolean found=false;
        for(int i=0;i<nums1.length;i++){
            found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                }
                if(found==true && nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
    public int[] better(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=map.get(nums1[i])+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
    public int[] optimal(int[] nums1, int[] nums2) {
 int[] ans = new int[nums1.length];
 HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<nums2.length;i++){
            while (!st.isEmpty() && st.peek()<nums2[i]){
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for ( int i:st){
            map.put(i,-1);
        }
        for (int i=0;i<nums1.length;i++){
            ans[i]= map.get(nums1[i]);
        }
 return ans;
    }
}
