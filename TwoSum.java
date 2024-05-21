import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target =14;
        System.out.println(Arrays.toString(brute(arr,target)));
        System.out.println(Arrays.toString(better(arr,target)));
        System.out.println(Arrays.toString(optimal(arr,target)));

    }
    //tc:o(n*n)
    static  int[] brute(int[] arr, int target){
        int[] ans = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    //tc:o(n) sc:o(n)
    static int[] better(int[] arr, int target){
        int [] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            int left = target-a;
            if(map.containsKey(left)){
                ans[0]=i;
                ans[1]= map.get(left);
            }else {
                map.put(arr[i],i);
            }
        }
        return ans;
    }
    static int[] optimal(int[] arr , int target){
        int[] ans = {-1,-1};
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }else{
                ans[0] =i;
                ans[1]=j;
            }
        }
        return ans;
    }
}
