import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementI {
    public static void main(String[] args) {
        //element that appears more than n/2 times
        int[] arr = {2,2,3,3,1,2,2};
        System.out.println(brute(arr));
        System.out.println(better(arr));

    }
    //tc:o(n*n)
    static int brute(int[] arr){
        int ans=-1;
        for(int i=0;i< arr.length;i++){
            int count =0;
            for (int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count> arr.length/2){
                ans = arr[i];
            }
        }
        return ans;
    }
    //tc:o(n+n) sc:o(n)
    static int better (int[] arr){
        int ans =-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);
        }
        for (Map.Entry<Integer, Integer> it: map.entrySet()){
            if (it.getValue()>arr.length/2){
                return it.getKey();
            }
        }
        return  ans;
    }
}
